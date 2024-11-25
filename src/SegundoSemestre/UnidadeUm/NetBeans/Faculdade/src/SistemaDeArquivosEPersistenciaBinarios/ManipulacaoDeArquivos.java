
import java.io.*;

public class ManipulacaoDeArquivos {

    // Caminho de um arquivo no computador
    private static final String FILE_PATH_BINARIO = "D:\\ArquivosJava\\dados.bin";
    private static final String FILE_PATH_TEXTO = "D:\\ArquivosJava\\dados.txt";
    private static File arquivoBinario = new File(FILE_PATH_BINARIO);
    private static File arquivoTexto = new File(FILE_PATH_TEXTO);

    public static void main(String[] args) {
        // Garantir que o diretório exista
        criarDiretorioSeNaoExistir("D:\\ArquivosJava");

        // EXEMPLO 1: Trabalhando com arquivos binários
        escreverArquivoBinario(FILE_PATH_BINARIO, "Frase armazenada no arquivo binário.");
        lerArquivoBinario(FILE_PATH_BINARIO);

        // EXEMPLO 2: Trabalhando com arquivos de texto
        escreverArquivoTexto(FILE_PATH_TEXTO, "Texto armazenado no arquivo de texto.");
        lerArquivoTexto(FILE_PATH_TEXTO);
    }

    /* ========================
     * CRIAÇÃO DE DIRETÓRIOS
     * ========================
     */

    /**
     * Cria um diretório se ele não existir.
     *
     * @param caminho Caminho do diretório.
     */
    public static void criarDiretorioSeNaoExistir(String caminho) {
        File diretorio = new File(caminho);
        if (!diretorio.exists()) {
            if (diretorio.mkdirs()) {
                System.out.println("Diretório criado com sucesso: " + caminho);
            } else {
                System.err.println("Falha ao criar o diretório: " + caminho);
            }
        } else {
            System.out.println("Diretório já existe: " + caminho);
        }
    }

    /* ========================
     * ARQUIVOS BINÁRIOS
     * ========================
     */

    /**
     * Escreve uma string em um arquivo binário.
     *
     * @param caminho Caminho completo do arquivo.
     * @param texto   Texto a ser escrito no arquivo.
     */
    public static void escreverArquivoBinario(String caminho, String texto) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(caminho))) {
            dos.writeUTF(texto);
            System.out.println("Arquivo binário criado com sucesso: " + caminho);
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo binário: " + e.getMessage());
        }
    }

    /**
     * Lê o conteúdo de um arquivo binário.
     *
     * @param caminho Caminho completo do arquivo.
     */
    public static void lerArquivoBinario(String caminho) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(caminho))) {
            String conteudo = dis.readUTF(); // Lê o conteúdo em formato UTF
            System.out.println("Conteúdo do arquivo binário: " + conteudo);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo binário: " + e.getMessage());
        }
    }

    /* ========================
     * ARQUIVOS DE TEXTO
     * ========================
     */

    /**
     * Escreve texto em um arquivo. Se o arquivo já existir, será sobrescrito.
     *
     * @param caminho Caminho completo do arquivo.
     * @param texto   Texto a ser escrito.
     */
    public static void escreverArquivoTexto(String caminho, String texto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            writer.write(texto);
            System.out.println("Arquivo de texto criado com sucesso: " + caminho);
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo de texto: " + e.getMessage());
        }
    }

    /**
     * Lê o conteúdo de um arquivo de texto.
     *
     * @param caminho Caminho completo do arquivo.
     */
    public static void lerArquivoTexto(String caminho) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            System.out.println("Conteúdo do arquivo de texto:");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de texto: " + e.getMessage());
        }
    }
}
