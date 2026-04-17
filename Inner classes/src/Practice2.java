public class Practice2 {
    public static void main(String[] args) {
        OuterFields outer = new OuterFields();
        OuterFields.Inner inner = outer.new Inner();
        inner.accessOuter();

    }
}

class OuterFields {
    private int privateField = 1;
    protected int protectedField = 2;
    public int publicField = 3;
    int packageField = 4;

    private void privateMethod() { System.out.println("Private method"); }
    protected void protectedMethod() { System.out.println("Protected method"); }
    public void publicMethod() { System.out.println("Public method"); }
    void packageMethod() { System.out.println("Package method"); }

    public class Inner {
        public void accessOuter() {
            privateField = 10;
            protectedField = 20;
            publicField = 30;
            packageField = 40;
            privateMethod();
            protectedMethod();
            publicMethod();
            packageMethod();
            System.out.println("privateField=" + privateField);
        }
    }
}