public class Main {
    public static void main(String[] args) {

        // int + double → double
        int a = 5;
        double b = 2.5;
        double result1 = a + b;
        System.out.println("int(5) + double(2.5) = " + result1);

        // long + float → float
        long c = 10L;
        float d = 3.5f;
        float result2 = c + d;
        System.out.println("long(10) + float(3.5) = " + result2);

        // byte + short → int
        byte e = 50;
        short f = 100;
        int result3 = e + f;  // оба преобразуются в int
        System.out.println("byte(50) + short(100) = " + result3);

        // char + int → int
        char g = 'A';
        int h = 10;
        int result4 = g + h;
        System.out.println("char('A'=65) + int(10) = " + result4);
        System.out.println((char)result4);

        // Все типы вместе
        byte b1 = 10;
        short s1 = 20;
        int i1 = 30;
        long l1 = 40L;
        float f1 = 1.5f;
        double d1 = 2.5;

        // double
        double result5 = b1 + s1 + i1 + l1 + f1 + d1;
        System.out.println("\nВсе типы вместе = double " + result5);

        // Умножение разных типов
        int x = 6;
        double y = 2.5;
        System.out.println("\nint(6) * double(2.5) = " + (x * y));

        // Деление разных типов
        int m = 10;
        int n = 3;
        double p = 3.0;

        System.out.println("\nint(10) / int(3) = " + (10 / 3));
        System.out.println("int(10) / double(3.0) = " + (10 / 3.0));
        System.out.println("double(10.0) / int(3) = " + (10.0 / 3));

        // Смешанные операции в одном выражении
        int q = 5;
        double r = 2.0;
        float s = 3.0f;
        long t = 10L;

        double result6 = q / r + s * t;
        System.out.println("\n5/2.0 + 3.0f*10L = " + result6);

        // Потеря данных при приведении double → int
        double pi = 3.14;
        int intPi = (int)pi;
        System.out.println("double 3.14159 в int = " + intPi);
    }
}
