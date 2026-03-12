class Operation {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int sum = a + b;        // 13
        int diff = a - b;       // 7
        int mult = a * b;       // 30
        int div = a / b;        // 3 (целочисленное деление)
        int remainder = a % b;   // 1 (остаток от деления)

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + diff);
        System.out.println(a + " * " + b + " = " + mult);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + remainder);

        double x = 10.0;
        double y = 3.0;
        System.out.println(x + " / " + y + " = " + (x / y)); // 3.333...
    }
}

class Strng {
    public static void main(String[] args) {

        String hello = "Hello";
        String world = "World";

        // Оператор +
        String greeting = hello + " " + world + "!";
        System.out.println("Результат + : " + greeting);

        // Конкатенация с числами
        String message = "Результат: " + (5 + 3); // 8
        System.out.println(message);

        // Оператор +=
        String str = "Start";
        str += " + middle";
        str += " + end";
        System.out.println("После += : " + str); // "Start + middle + end"

        // Интересный случай: порядок выполнения
        System.out.println(1 + 2 + " = 3");       // "3 = 3" (сначала сложение чисел)
        System.out.println("1 + 2 = " + 1 + 2);   // "1 + 2 = 12" (конкатенация)
    }
}

class Comparison {
    public static void main(String[] args) {

        // Присваивание =
        int x = 5;
        int y = 10;
        String name = "Java";

        // Сравнение == и !=
        boolean isEqual = (x == y);        // false
        boolean isNotEqual = (x != y);      // true
        boolean isNameJava = (name == "Java"); // true

        System.out.println(x + " == " + y + " : " + isEqual);
        System.out.println(x + " != " + y + " : " + isNotEqual);

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1 == str2: " + (str1 == str2));       // false (разные объекты)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (одинаковое содержимое)
    }
}

class Logic {
    public static void main(String[] args) {
        boolean trueVal = true;
        boolean falseVal = false;

        System.out.println("true && true: " + (trueVal && trueVal));    // true
        System.out.println("true && false: " + (trueVal && falseVal));  // false

        System.out.println("true || false: " + (trueVal || falseVal));  // true
        System.out.println("false || false: " + (falseVal || falseVal)); // false

        System.out.println("!true: " + (!trueVal));     // false
        System.out.println("!false: " + (!falseVal));   // true

        // Короткое замыкание
        int a = 5;
        int b = 0;

        boolean result = (b != 0) && (a / b > 1);
        System.out.println("Короткое замыкание &&: " + result);
    }
}

class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("\n=== Побитовые операторы ===");

        int a = 5;  // 0101 в двc
        int b = 3;  // 0011 в двc

        int and = a & b;  // 0101 & 0011 = 0001 (1)
        System.out.println(a + " & " + b + " = " + and);

        int or = a | b;   // 0101 | 0011 = 0111 (7)
        System.out.println(a + " | " + b + " = " + or);

        int xor = a ^ b;  // 0101 ^ 0011 = 0110 (6)
        System.out.println(a + " ^ " + b + " = " + xor);

        int not = ~a;     // ~0101 = 1010...
        System.out.println("~" + a + " = " + not);
    }
}

class ShiftOperator {
    public static void main(String[] args) {

        int a = 8;  // 1000 в двc

        // << (сдвиг влево, умножение на 2)
        int leftShift = a << 1;  // 10000 = 16
        System.out.println(a + " << 1 = " + leftShift);

        // >> (сдвиг вправо с сохранением знака, деление на 2)
        int rightShift = a >> 1;  // 0100 = 4
        System.out.println(a + " >> 1 = " + rightShift);

        // >>> (сдвиг вправо с заполнением нулями)
        int negative = -8;  // 11111111111111111111111111111000
        int unsignedShift = negative >>> 1; // большое положительное число
        System.out.println(negative + " >>> 1 = " + unsignedShift);
    }
}

class TernaryOperato {
    public static void main(String[] args) {

        int age = 20;

        // условие ? значение_если_истина : значение_если_ложь
        String status = (age >= 18) ? "взрослый" : "ребенок";
        System.out.println("Возраст " + age + ": " + status);

        int x = 5, y = 10, z = 7;
        int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("Максимум из " + x + ", " + y + ", " + z + " = " + max);
    }
}

class IncrementDecrement {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        // Постфиксная форма: сначала используется значение, потом увеличивается
        System.out.println("Постфиксный инкремент:");
        System.out.println("a = " + a);        // 5
        System.out.println("a++ = " + (a++));  // выведет 5, потом a станет 6
        System.out.println("a теперь = " + a); // 6

        // Префиксная форма: сначала увеличивается, потом используется
        System.out.println("\nПрефиксный инкремент:");
        System.out.println("b = " + b);        // 5
        System.out.println("++b = " + (++b));  // b станет 6, выведет 6
        System.out.println("b теперь = " + b); // 6

        int x = 5;
        int y = 5;

        int result1 = 10 + x++;  // 10 + 5 = 15, потом x=6
        int result2 = 10 + ++y;  // y=6, потом 10 + 6 = 16

        System.out.println("\n10 + x++ = " + result1 + ", x = " + x);
        System.out.println("10 + ++y = " + result2 + ", y = " + y);

        int c = 5;
        System.out.println("\nПостфиксный декремент: c-- = " + (c--) + ", c теперь = " + c);

        c = 5;
        System.out.println("Префиксный декремент: --c = " + (--c) + ", c теперь = " + c);
    }
}