package exerciciosUnidade6;

public class MetodosDoWhile {

    // Ordena o vetor usando Bubble Sort
    // Ordena um vetor de inteiros em ordem crescente usando o algoritmo Bubble Sort.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Busca linear em um vetor
    // Procura um valor em um vetor de inteiros usando o algoritmo de busca linear.
    public static int linearSearch(int[] arr, int key) {
        int i = 0;
        do {
            if (arr[i] == key) {
                return i;
            }
            i++;
        } while (i < arr.length);
        return -1;
    }

    // Busca binária em um vetor ordenado
    // Procura um valor em um vetor de inteiros usando o algoritmo de busca binária, que requer que o vetor esteja ordenado.
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Inverte a ordem dos elementos no vetor
    // Inverte os elementos de um vetor de inteiros em ordem reversa.
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

   

    // Calcula a soma de todos os elementos do vetor
    // Calcula a soma de todos os elementos de um vetor de inteiros.
    public static int sum(int[] arr) {
        int sum = 0;
        int i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        return sum;
    }

    // Calcula a média dos elementos do vetor
    // Calcula a média dos elementos de um vetor de inteiros.
    public static double average(int[] arr) {
        int sum = 0;
        int i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        return (double) sum / arr.length;
    }

    // Encontra o maior e o menor elemento no vetor
    // Retorna um array com o maior e o menor elemento em um vetor de inteiros.
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        return new int[]{min, max};
    }

    // Conta quantas vezes um determinado elemento aparece no vetor
    // Conta quantas vezes um valor específico aparece em um vetor de inteiros.
    public static int countOccurrences(int[] arr, int key) {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == key) {
                count++;
            }
            i++;
        }
        return count;
    }

    // Verifica se o vetor é um palíndromo
    // Verifica se os elementos de um vetor de inteiros formam um palíndromo (ou seja, são iguais quando lidos de trás para frente).
    public static boolean isPalindrome(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Ordena o vetor usando Selection Sort
    // Ordena um vetor de inteiros em ordem crescente usando o algoritmo Selection Sort.
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Ordena o vetor usando Insertion Sort
    // Ordena um vetor de inteiros em ordem crescente usando o algoritmo Insertion Sort.
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Ordena o vetor usando Merge Sort
    // Ordena um vetor de inteiros em ordem crescente usando o algoritmo de ordenação Merge Sort.
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Ordena o vetor usando Quick Sort
    // Ordena um vetor de inteiros em ordem crescente usando o algoritmo de ordenação Quick Sort.
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Inverte a ordem dos elementos no vetor com do-while
    // Inverte os elementos de um vetor de inteiros em ordem reversa usando a estrutura do-while.
    public static void reverseDoWhile(int[] arr) {
        int left = 0, right = arr.length - 1;
        do {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        } while (left < right);
    }

}
