public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("Сгенерированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void calculateAndPrintTotal(int[] arr) {
        int total = 0;

        for (int value : arr) {
            total += value;
        }

        System.out.println("Сумма всех элементов массива: " + total);
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        printArray(arr);
        calculateAndPrintTotal(arr);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int value : arr) {
            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");

    }
    public static void task3() {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        double average = (double) total / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }
    public static void task4(){
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print("Исправленное имя: ");

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println();
    }
}