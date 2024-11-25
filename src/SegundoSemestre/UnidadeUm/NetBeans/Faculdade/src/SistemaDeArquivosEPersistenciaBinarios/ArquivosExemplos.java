import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivosExemplos {

    public static void main(String[] args) {
        try {
            // EXEMPLO 1: Criar e Ler um arquivo de texto
            criarArquivoTexto("exemplo.txt", "Este é um exemplo de conteúdo inicial.");
            System.out.println("Conteúdo do arquivo (Texto):");
            System.out.println(lerArquivoTexto("exemplo.txt"));

            // EXEMPLO 2: Serialização e Desserialização
            Pessoa pessoa = new Pessoa("João", 25);
            serializarObjeto(pessoa, "pessoa.bin");
            Pessoa pessoaRecuperada = desserializarObjeto("pessoa.bin");
            System.out.println("\nObjeto desserializado: " + pessoaRecuperada);

            // EXEMPLO 3: Adicionar conteúdo a um arquivo de texto
            adicionarTextoAoArquivo("exemplo.txt", "\nConteúdo adicional adicionado ao arquivo.");
            System.out.println("\nConteúdo do arquivo após edição:");
            System.out.println(lerArquivoTexto("exemplo.txt"));

            // EXEMPLO 4: Editar conteúdo de um arquivo de texto
            editarArquivo("exemplo.txt", "Conteúdo inicial", "Novo conteúdo substituído.");
            System.out.println("\nConteúdo do arquivo após edição de substituição:");
            System.out.println(lerArquivoTexto("exemplo.txt"));

            // EXEMPLO 5: Manipulação de arquivos CSV
            List<String[]> dados = new ArrayList<>();
            dados.add(new String[]{"Nome", "Idade"}); // Cabeçalho do CSV
            dados.add(new String[]{"Ana", "30"});
            dados.add(new String[]{"Carlos", "25"});
            escreverCSV("dados.csv", dados);
            System.out.println("\nConteúdo do arquivo CSV:");
            lerCSV("dados.csv").forEach(linha -> System.out.println(String.join(", ", linha)));

            // Editar uma linha específica do CSV
            editarCSV("dados.csv", 1, new String[]{"João", "35"});
            System.out.println("\nConteúdo do arquivo CSV após edição:");
            lerCSV("dados.csv").forEach(linha -> System.out.println(String.join(", ", linha)));

        } catch (Exception e) {
            // Tratamento de erros gerais para evitar interrupção da aplicação
            System.err.println("Erro geral: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /* =====================
     * ARQUIVOS DE TEXTO
     * =====================
     */

    /**
     * Cria um arquivo de texto com o conteúdo especificado.
     * Se o arquivo já existir, ele será sobrescrito.
     *
     * @param caminho  Caminho completo ou nome do arquivo a ser criado.
     * @param conteudo Texto que será escrito no arquivo.
     */
    public static void criarArquivoTexto(String caminho, String conteudo) {
        try {
            Files.writeString(Path.of(caminho), conteudo, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            System.out.println("Arquivo criado com sucesso: " + caminho);
        } catch (IOException e) {
            // Tratamento de erro ao criar o arquivo
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    /**
     * Lê o conteúdo de um arquivo de texto e retorna como uma string.
     *
     * @param caminho Caminho completo ou nome do arquivo a ser lido.
     * @return Conteúdo do arquivo.
     */
    public static String lerArquivoTexto(String caminho) {
        try {
            return Files.readString(Path.of(caminho));
        } catch (IOException e) {
            // Tratamento de erro ao ler o arquivo
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return "";
        }
    }

    /**
     * Adiciona texto ao final de um arquivo existente.
     *
     * @param caminho  Caminho completo ou nome do arquivo.
     * @param conteudo Texto a ser adicionado.
     */
    public static void adicionarTextoAoArquivo(String caminho, String conteudo) {
        try {
            Files.writeString(Path.of(caminho), conteudo, StandardOpenOption.APPEND);
            System.out.println("Texto adicionado ao arquivo: " + caminho);
        } catch (IOException e) {
            // Tratamento de erro ao adicionar texto
            System.err.println("Erro ao adicionar texto ao arquivo: " + e.getMessage());
        }
    }

    /**
     * Substitui um texto antigo por um novo no conteúdo de um arquivo de texto.
     *
     * @param caminho     Caminho completo ou nome do arquivo.
     * @param textoAntigo Texto que será substituído.
     * @param textoNovo   Novo texto que substituirá o antigo.
     */
    public static void editarArquivo(String caminho, String textoAntigo, String textoNovo) {
        try {
            String conteudo = lerArquivoTexto(caminho);
            conteudo = conteudo.replace(textoAntigo, textoNovo); // Substitui o texto
            criarArquivoTexto(caminho, conteudo); // Reescreve o arquivo
            System.out.println("Arquivo editado com sucesso: " + caminho);
        } catch (Exception e) {
            // Tratamento de erro ao editar o arquivo
            System.err.println("Erro ao editar o arquivo: " + e.getMessage());
        }
    }

    /* =====================
     * ARQUIVOS BINÁRIOS E SERIALIZAÇÃO
     * =====================
     */

    /**
     * Serializa um objeto (salva em um arquivo binário).
     *
     * @param objeto  Objeto que será serializado.
     * @param caminho Caminho completo ou nome do arquivo.
     */
    public static void serializarObjeto(Serializable objeto, String caminho) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminho))) {
            oos.writeObject(objeto);
            System.out.println("Objeto serializado com sucesso em: " + caminho);
        } catch (IOException e) {
            // Tratamento de erro ao serializar
            System.err.println("Erro ao serializar o objeto: " + e.getMessage());
        }
    }

    /**
     * Desserializa um objeto (carrega de um arquivo binário).
     *
     * @param caminho Caminho completo ou nome do arquivo.
     * @return Objeto desserializado.
     */
    public static <T> T desserializarObjeto(String caminho) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho))) {
            return (T) ois.readObject();
        } catch (IOException e) {
            // Tratamento de erro ao desserializar
            System.err.println("Erro ao desserializar o objeto: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Classe do objeto não encontrada: " + e.getMessage());
        }
        return null;
    }

    /* =====================
     * ARQUIVOS CSV
     * =====================
     */

    /**
     * Escreve dados em um arquivo CSV.
     * Cada linha do arquivo é representada como um array de strings.
     *
     * @param caminho Caminho completo ou nome do arquivo.
     * @param dados   Lista de arrays de strings (representam as linhas e colunas).
     */
    public static void escreverCSV(String caminho, List<String[]> dados) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(caminho))) {
            for (String[] linha : dados) {
                writer.write(String.join(",", linha)); // Junta os elementos com vírgula
                writer.newLine(); // Adiciona uma nova linha
            }
            System.out.println("Arquivo CSV criado com sucesso: " + caminho);
        } catch (IOException e) {
            // Tratamento de erro ao criar o CSV
            System.err.println("Erro ao escrever no arquivo CSV: " + e.getMessage());
        }
    }

    /**
     * Lê um arquivo CSV e retorna uma lista de arrays de strings.
     *
     * @param caminho Caminho completo ou nome do arquivo.
     * @return Lista com as linhas do arquivo CSV (cada linha é um array de strings).
     */
    public static List<String[]> lerCSV(String caminho) {
        List<String[]> dados = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(caminho))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                dados.add(linha.split(",")); // Divide cada linha nos valores separados por vírgula
            }
        } catch (IOException e) {
            // Tratamento de erro ao ler o CSV
            System.err.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }
        return dados;
    }

    /**
     * Edita uma linha específica de um arquivo CSV.
     *
     * @param caminho    Caminho completo ou nome do arquivo.
     * @param linhaIndex Índice da linha que será editada (começa em 0).
     * @param novosDados Array de strings com os novos valores.
     */
    public static void editarCSV(String caminho, int linhaIndex, String[] novosDados) {
        try {
            List<String[]> dados = lerCSV(caminho);
            if (linhaIndex >= 0 && linhaIndex < dados.size()) {
                dados.set(linhaIndex, novosDados); // Substitui a linha
                escreverCSV(caminho, dados); // Reescreve o CSV
                System.out.println("Linha do arquivo CSV editada com sucesso.");
            } else {
                System.err.println("Índice da linha fora do alcance.");
            }
        } catch (Exception e) {
            // Tratamento de erro ao editar o CSV
            System.err.println("Erro ao editar o arquivo CSV: " + e.getMessage());
        }
    }
}

/**
 * Classe exemplo para demonstrar serialização e desserialização.
 * Deve implementar a interface Serializable.
 */
class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }
}
