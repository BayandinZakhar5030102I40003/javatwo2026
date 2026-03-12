class DecodeExample {
    public static void main(String[] args) {
        // Десятичные числа
        Integer dec1 = Integer.decode("123");
        Integer dec2 = Integer.decode("-456");
        System.out.println("decode(\"123\") = " + dec1);      // 123
        System.out.println("decode(\"-456\") = " + dec2);     // -456

        // Шестнадцатеричные (0x, 0X, #)
        Integer hex1 = Integer.decode("0xFF");      // 255
        Integer hex2 = Integer.decode("0XAB");      // 171
        Integer hex3 = Integer.decode("#ABCD");     // 43981
        System.out.println("decode(\"0xFF\") = " + hex1);     // 255
        System.out.println("decode(\"0XAB\") = " + hex2);     // 171
        System.out.println("decode(\"#ABCD\") = " + hex3);    // 43981

        // Восьмеричные (начинаются с 0)
        Integer oct1 = Integer.decode("077");       // 63 (7*8 + 7)
        Integer oct2 = Integer.decode("0123");      // 83 (1*64 + 2*8 + 3)
        System.out.println("decode(\"077\") = " + oct1);      // 63
        System.out.println("decode(\"0123\") = " + oct2);     // 83

        // Отрицательные числа в разных системах
        Integer negHex = Integer.decode("-0x1A");   // -26
        Integer negOct = Integer.decode("-077");    // -63
        System.out.println("decode(\"-0x1A\") = " + negHex);  // -26
        System.out.println("decode(\"-077\") = " + negOct);   // -63
    }
}