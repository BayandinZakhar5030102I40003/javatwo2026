class TernaryExample {
    public static void main(String[] args) {
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