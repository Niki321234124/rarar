public class Main {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Масив до сортування:");
        printArray(array);

        insertionSort(array);

        System.out.println("Масив після сортування:");
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Порівнюємо елементи та зміщуємо більші елементи вправо
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
