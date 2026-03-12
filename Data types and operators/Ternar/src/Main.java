class TernaryExample {
    public static void main(String[] args) {
        // Тестируем для разных значений a
        test(1);
        test(2);
        test(5);
        test(100);
    }

    public static void test(int a) {
        // Исходный код с if-else
        int i1;
        if (a == 1) {
            i1 = 1;
        } else if (a == 2) {
            i1 = 2;
        } else {
            i1 = 3;
        }

        // То же самое через тернарный оператор
        int i2 = (a == 1) ? 1 : (a == 2) ? 2 : 3;

        System.out.println("a = " + a + ": i1 = " + i1 + ", i2 = " + i2);
    }
}