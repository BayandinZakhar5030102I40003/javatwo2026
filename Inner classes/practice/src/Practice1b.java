public class Practice1b {
    public static void main(String[] args) {
        Calculator.Operation op = new Calculator.Operation();
        System.out.println("Add: " + op.add(10, 5));
        System.out.println("Multiply: " + op.multiply(10, 5));
    }
}

interface Calculator {
    class Operation {
        public int add(int a, int b) { return a + b; }
        public int multiply(int a, int b) { return a * b; }
    }
}