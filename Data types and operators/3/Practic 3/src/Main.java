class DirectAssignment {
    public static void main(String[] args) {
        Integer i = null;

        try {
            int j = i; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Ошибка при прямом присваивании: " + e);
        }
    }
}