public class Calculator {

    // Метод для суммирования целых чисел
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Перегруженный метод для суммирования чисел с плавающей точкой
    public static double sum(double... numbers) {
        double total = 0.0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    // Перегруженный метод для конкатенации строк
    public static String sum(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    // Перегруженный метод с дополнительным параметром - используем другое имя
    public static int sumWithMultiplier(int multiplier, int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total * multiplier;
    }

    // Альтернатива - изменить сигнатуру, чтобы избежать неоднозначности
    public static int sum(int multiplier, int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total * multiplier;
    }

    public static void main(String[] args) {
        // Вызов различных методов
        System.out.println("Сумма целых: " + sum(1, 2, 3, 4, 5));              // 15
        System.out.println("Сумма double: " + sum(1.5, 2.5, 3.0));             // 7.0
        System.out.println("Конкатенация: " + sum("Hello", " ", "World"));      // Hello World

        // Используем метод с другим именем
        System.out.println("Сумма с множителем: " + sumWithMultiplier(2, 1, 2, 3)); // 12

        // Или используем перегрузку с массивом
        System.out.println("Сумма с множителем: " + sum(2, new int[]{1, 2, 3}));     // 12
    }
}