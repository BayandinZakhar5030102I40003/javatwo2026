public class Main {
    public static void main(String[] args) {

        // 1. Строка + строка
        String hello = "Привет";
        String world = "мир";
        String result1 = hello + " " + world;
        System.out.println(result1);

        // 2. Строка + число
        String text = "Возраст: ";
        int age = 985;
        String result2 = text + age;
        System.out.println(result2);

        // 3. Строка + дробное число
        double price = 999.99;
        System.out.println("Цена: " + price + " ils.");

        // 4. Строка + символ
        char letter = 'A';
        System.out.println("Буква: " + letter);

        // 5. Строка + логическое значение
        boolean isJava = true;
        System.out.println("Да? " + isJava);

        // 6. Строка + объект
        Object obj = new Object();
        System.out.println("Объект: " + obj);  // Объект: java.lang.Object@15db9742

    }
}