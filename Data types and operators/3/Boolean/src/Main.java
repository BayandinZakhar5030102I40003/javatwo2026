class AllBooleanWays {
    public static void main(String[] args) {

        //1: Конструкторы
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("false");
        System.out.println("1. new Boolean(true): " + b1);
        System.out.println("2. new Boolean(\"false\"): " + b2);

        //2: valueOf() с boolean
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf(false);
        System.out.println("3. valueOf(true): " + b3);
        System.out.println("4. valueOf(false): " + b4);

        //3: valueOf() со String
        Boolean b5 = Boolean.valueOf("true");
        Boolean b6 = Boolean.valueOf("TRUE");
        Boolean b7 = Boolean.valueOf("false");
        Boolean b8 = Boolean.valueOf("FALSE");
        Boolean b9 = Boolean.valueOf("yes");        // не "true" -> false
        Boolean b10 = Boolean.valueOf(null);        // null -> false
        System.out.println("5. valueOf(\"true\"): " + b5);
        System.out.println("6. valueOf(\"TRUE\"): " + b6);
        System.out.println("7. valueOf(\"false\"): " + b7);
        System.out.println("8. valueOf(\"FALSE\"): " + b8);
        System.out.println("9. valueOf(\"yes\"): " + b9);
        System.out.println("10. valueOf(null): " + b10);

        //4: Автоупаковка
        Boolean b11 = true;
        Boolean b12 = false;
        System.out.println("11. Автоупаковка true: " + b11);
        System.out.println("12. Автоупаковка false: " + b12);

        //5: Константы
        Boolean b13 = Boolean.TRUE;
        Boolean b14 = Boolean.FALSE;
        System.out.println("13. Boolean.TRUE: " + b13);
        System.out.println("14. Boolean.FALSE: " + b14);

    }
}

