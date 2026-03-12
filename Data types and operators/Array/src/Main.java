import java.util.Arrays;

class ArraysAllMethodsDemo {

    public static void main(String[] args) {
        ToString();
        binarySearch();
        equals();
        compare();
        sort();
    }

    public static void ToString() {
        // Одномерные массивы
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"Apple", "Banana", "Cherry"};
        double[] doubles = {1.1, 2.2, 3.3};

        System.out.println("int[]: " + Arrays.toString(numbers));
        System.out.println("String[]: " + Arrays.toString(fruits));
        System.out.println("double[]: " + Arrays.toString(doubles));

        // Многомерные массивы
        int[][] matrix = {{1, 2}, {3, 4}};
        String[][] names = {{"Mr.", "Smith"}, {"Ms.", "Johnson"}};

        System.out.println("toString(): " + Arrays.toString(matrix));
        System.out.println("deepToString(): " + Arrays.deepToString(matrix));
        System.out.println("deepToString(): " + Arrays.deepToString(names));

        // Пустой массив и null
        int[] empty = {};
        int[] nullArray = null;

        System.out.println("Пустой массив: " + Arrays.toString(empty));
        System.out.println("null безопасно: " + java.util.Objects.toString(nullArray));

        System.out.println();
    }

    public static void binarySearch() {

        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedNumbers));

        // Поиск существующих элементов
        int key1 = 30;
        int key2 = 10;
        int key3 = 70;

        int index1 = Arrays.binarySearch(sortedNumbers, key1);
        int index2 = Arrays.binarySearch(sortedNumbers, key2);
        int index3 = Arrays.binarySearch(sortedNumbers, key3);

        System.out.println("Поиск " + key1 + ": индекс " + index1);
        System.out.println("Поиск " + key2 + ": индекс " + index2);
        System.out.println("Поиск " + key3 + ": индекс " + index3);

        // Поиск несуществующего элемента
        int key4 = 35;
        int key5 = 5;
        int key6 = 80;

        int index4 = Arrays.binarySearch(sortedNumbers, key4);
        int index5 = Arrays.binarySearch(sortedNumbers, key5);
        int index6 = Arrays.binarySearch(sortedNumbers, key6);

        System.out.println("Поиск " + key4 + ": " + index4 + " (точка вставки: " + (-index4 - 1) + ")");
        System.out.println("Поиск " + key5 + ": " + index5 + " (точка вставки: " + (-index5 - 1) + ")");
        System.out.println("Поиск " + key6 + ": " + index6 + " (точка вставки: " + (-index6 - 1) + ")");

        // Поиск в части массива
        int indexInRange = Arrays.binarySearch(sortedNumbers, 2, 5, 40); // поиск с индекса 2 по 5
        System.out.println("Поиск 40 в диапазоне [2,5): " + indexInRange);

        int[] unsorted = {50, 10, 40, 20, 30};
        System.out.println("\nНеотсортированный массив: " + Arrays.toString(unsorted));
        int badIndex = Arrays.binarySearch(unsorted, 30);
        System.out.println("Поиск 30 в неотсортированном: " + badIndex + " (результат непредсказуем!)");

        System.out.println();
    }
    public static void equals() {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 0};
        int[] array4 = {1, 2, 3, 4};

        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
        System.out.println("array3: " + Arrays.toString(array3));
        System.out.println("array4: " + Arrays.toString(array4));

        System.out.println("array1 equals array2: " + Arrays.equals(array1, array2)); // true
        System.out.println("array1 equals array3: " + Arrays.equals(array1, array3)); // false
        System.out.println("array1 equals array4: " + Arrays.equals(array1, array4)); // false

        // Сравнение многомерных массивов
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] matrix3 = {{1, 2}, {3, 5}};

        System.out.println("\nmatrix1: " + Arrays.deepToString(matrix1));
        System.out.println("matrix2: " + Arrays.deepToString(matrix2));
        System.out.println("matrix3: " + Arrays.deepToString(matrix3));

        System.out.println("equals для 2D: " + Arrays.equals(matrix1, matrix2)); // false
        System.out.println("deepEquals для 2D: " + Arrays.deepEquals(matrix1, matrix2)); // true
        System.out.println("deepEquals matrix1 vs matrix3: " + Arrays.deepEquals(matrix1, matrix3)); // false

        System.out.println();
    }

    public static void compare() {

        // Сравнение чисел
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 4};
        int[] a4 = {1, 2, 3, 4};
        int[] a5 = {0, 2, 3};

        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));
        System.out.println("a3: " + Arrays.toString(a3));
        System.out.println("a4: " + Arrays.toString(a4));
        System.out.println("a5: " + Arrays.toString(a5));

        System.out.println("compare(a1, a2): " + Arrays.compare(a1, a2) + " (равны)");
        System.out.println("compare(a1, a3): " + Arrays.compare(a1, a3) + " (3 < 4)");
        System.out.println("compare(a3, a1): " + Arrays.compare(a3, a1) + " (4 > 3)");
        System.out.println("compare(a1, a4): " + Arrays.compare(a1, a4) + " (a1 короче)");
        System.out.println("compare(a4, a1): " + Arrays.compare(a4, a1) + " (a4 длиннее)");
        System.out.println("compare(a1, a5): " + Arrays.compare(a1, a5) + " (1 > 0)");

        // Сравнение строк
        String[] s1 = {"Apple", "Banana"};
        String[] s2 = {"Apple", "Banana"};
        String[] s3 = {"Apple", "Cherry"};
        String[] s4 = {"Banana", "Apple"};

        System.out.println("\ns1: " + Arrays.toString(s1));
        System.out.println("s2: " + Arrays.toString(s2));
        System.out.println("s3: " + Arrays.toString(s3));
        System.out.println("s4: " + Arrays.toString(s4));

        System.out.println("compare(s1, s2): " + Arrays.compare(s1, s2));
        System.out.println("compare(s1, s3): " + Arrays.compare(s1, s3));
        System.out.println("compare(s1, s4): " + Arrays.compare(s1, s4));

        System.out.println();
    }

    public static void sort() {

        // Сортировка чисел
        int[] numbers = {5, 2, 8, 1, 9, 3, 7, 4, 6};
        System.out.println("Исходный массив чисел: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("После sort(): " + Arrays.toString(numbers));

        // Сортировка строк
        String[] names = {"John", "Alice", "Bob", "Eve", "Charlie"};
        System.out.println("\nИсходный массив имен: " + Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("После sort(): " + Arrays.toString(names));

        // Сортировка части массива
        int[] partial = {5, 2, 8, 1, 9, 3, 7, 4, 6};
        System.out.println("\nИсходный: " + Arrays.toString(partial));

        Arrays.sort(partial, 2, 6);
        System.out.println("После sort(2,6): " + Arrays.toString(partial));

        // Сортировка в обратном порядке (для объектов)
        Integer[] objects = {5, 2, 8, 1, 9};
        System.out.println("\nInteger[]: " + Arrays.toString(objects));

        Arrays.sort(objects, (a, b) -> b - a); // обратный порядок
        System.out.println("После sort с компаратором: " + Arrays.toString(objects));

        // Сортировка многомерных массивов (не напрямую)
        int[][] matrix = {{3, 1}, {1, 4}, {2, 2}};
        System.out.println("\nИсходная матрица: " + Arrays.deepToString(matrix));

        // Сортируем по первому элементу
        Arrays.sort(matrix, (row1, row2) -> Integer.compare(row1[0], row2[0]));
        System.out.println("После сортировки по первому столбцу: " + Arrays.deepToString(matrix));

        System.out.println();
    }

}