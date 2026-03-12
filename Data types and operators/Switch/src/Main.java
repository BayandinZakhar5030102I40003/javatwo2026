class SwitchIntegerTypes {
    public static void main(String[] args) {

        // 1. byte
        byte b = 2;
        switch (b) {
            case 1: System.out.println("byte = 1"); break;
            case 2: System.out.println("byte = 2"); break;
            default: System.out.println("byte другое");
        }

        // 2. short
        short s = 100;
        switch (s) {
            case 100: System.out.println("short = 100"); break;
            case 200: System.out.println("short = 200"); break;
            default: System.out.println("short другое");
        }

        // 3. int
        int i = 5;
        switch (i) {
            case 1: System.out.println("int = 1"); break;
            case 5: System.out.println("int = 5"); break;
            default: System.out.println("int другое");
        }

        // 4. char
        char c = 'A';
        switch (c) {
            case 'A': System.out.println("char = A"); break;
            case 'B': System.out.println("char = B"); break;
            default: System.out.println("char другое");
        }
    }
}

class SwitchStringType {
    public static void main(String[] args) {

        String day = "MONDAY";

        switch (day) {
            case "MONDAY":
                System.out.println("Понедельник");
                break;
            case "TUESDAY":
                System.out.println("Вторник");
                break;
            default:
                System.out.println("Неизвестный день");
        }
    }
}

class SwitchEnumType {

    enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {

        Season currentSeason = Season.SUMMER;

        String description = switch (currentSeason) {
            case WINTER -> "Холодно";
            case SPRING -> "Грязно";
            case SUMMER -> "Жарко";
            case AUTUMN -> "Дождливо";
        };

        System.out.println("Сезон: " + description);
    }
}

class SwitchWrapperTypes {
    public static void main(String[] args) {

        // Integer (автораспаковка в int)
        Integer intObj = 3;
        switch (intObj) {
            case 1: System.out.println("Integer = 1"); break;
            case 2: System.out.println("Integer = 2"); break;
            case 3: System.out.println("Integer = 3"); break;
            default: System.out.println("Integer другое");
        }

        // Character (автораспаковка в char)
        Character charObj = 'X';
        switch (charObj) {
            case 'X': System.out.println("Character = X"); break;
            case 'Y': System.out.println("Character = Y"); break;
            default: System.out.println("Character другое");
        }

        // Byte (автораспаковка в byte)
        Byte byteObj = 127;
        switch (byteObj) {
            case 127: System.out.println("Byte = 127"); break;
            default: System.out.println("Byte другое");
        }
    }
}

class SwitchVarType {
    public static void main(String[] args) {

        var number = 42;        // компилятор выводит int
        switch (number) {
            case 42: System.out.println("Ответ на главный вопрос"); break;
            default: System.out.println("Обычное число");
        }

        var text = "Hello";     // компилятор выводит String
        switch (text) {
            case "Hello": System.out.println("Привет"); break;
            case "Bye": System.out.println("Пока"); break;
        }
    }
}