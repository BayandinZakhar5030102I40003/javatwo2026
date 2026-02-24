public class Main {
    public static void main(String[] args) {

        // 1. byte
        byte b = 100;
        Byte bNull = null;
        System.out.println("byte: " + b + ", null: " + bNull);

        // 2. short
        short s = 30000;
        Short sNull = null;
        System.out.println("short: " + s + ", null: " + sNull);

        // 3. int
        int i = 1000000;
        Integer iNull = null;
        System.out.println("int: " + i + ", null: " + iNull);

        // 4. long
        long l = 10000000000L;
        Long lNull = null;
        System.out.println("long: " + l + ", null: " + lNull);

        // 5. float
        float f = 3.14159f;
        Float fNull = null;
        System.out.println("float: " + f + ", null: " + fNull);

        // 6. double
        double d = 3.141592653589793;
        Double dNull = null;
        System.out.println("double: " + d+ ", null: " + dNull);

        // 7. char
        char c = 'A';
        Character cNull = null;
        System.out.println("char: " + c + ", null: " + cNull);

        // 8. boolean
        boolean bool = true;
        Boolean boolNull = null;
        System.out.println("boolean: " + bool + ", null: " + boolNull);
    }
}
//Пример:
//1. byte (примитивный тип)
//2. Byte (класс-обертка / wrapper class)