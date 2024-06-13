package exerciciosUnidade6;
public class Algoritmos {

    // Algoritmo de Ordenação: Bubble Sort
    // Ordena um vetor de inteiros em ordem crescente usando o algoritmo Bubble Sort.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca os elementos arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Algoritmo de Busca Linear
    // Procura um valor em um vetor de inteiros usando o algoritmo de busca linear.
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Retorna o índice onde o valor é encontrado
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }

    // Algoritmo de Busca Binária (requer vetor ordenado)
    // Procura um valor em um vetor de inteiros usando o algoritmo de busca binária.
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid; // Retorna o índice onde o valor é encontrado
            }
            if (arr[mid] < key) {
                left = mid + 1; // Busca na metade direita
            } else {
                right = mid - 1; // Busca na metade esquerda
            }
        }
        return -1; // Retorna -1 se o valor não for encontrado
    }

    // Algoritmo de Ordenação: Selection Sort
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
            // Troca os elementos arr[i] e arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Algoritmo de Ordenação: Insertion Sort
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

    // Algoritmo de Ordenação: Merge Sort
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

    // Algoritmo de Ordenação: Quick Sort
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
                // Troca os elementos arr[i] e arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Troca os elementos arr[i+1] e arr[high] (ou seja, o pivô)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Algoritmo para encontrar o Máximo Divisor Comum (MDC) usando o Algoritmo de Euclides
    // Calcula o MDC de dois números inteiros usando o Algoritmo de Euclides.
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Algoritmo para encontrar o Menor Múltiplo Comum (MMC)
    // Calcula o MMC de dois números inteiros usando o MDC.
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
