public class Practice3 {
    public static void main(String[] args) {
        OuterAccess outer = new OuterAccess();
        outer.accessInner();
    }
}

class OuterAccess {
    public class Inner {
        private int privateField = 1;
        protected int protectedField = 2;
        public int publicField = 3;
        int packageField = 4;

        private void privateMethod() { System.out.println("Private method - cannot acces from outer"); }
        protected void protectedMethod() { System.out.println("Protected method access"); }
        public void publicMethod() { System.out.println("Public method access"); }
        void packageMethod() { System.out.println("Package method access"); }

        public void showFields() {
            System.out.println("publicField=" + publicField + ", protectedField=" + protectedField + ", packageField=" + packageField);
        }
    }

    public void accessInner() {
        Inner inner = new Inner();
        inner.publicField = 10;
        inner.protectedField = 20;
        inner.packageField = 30;
        inner.publicMethod();
        inner.protectedMethod();
        inner.packageMethod();
        inner.showFields();
        System.out.println("Private field value: " + inner.privateField);
    }
}