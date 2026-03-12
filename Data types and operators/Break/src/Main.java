class BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i <= 5) {
                System.out.println(i);
                continue;
            }
            if (i % 3 == 0) {
                break;
            }

        }
    }
}