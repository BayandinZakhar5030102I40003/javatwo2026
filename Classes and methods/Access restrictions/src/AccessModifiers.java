public class AccessModifiers {
    private int privateField = 10;
    int packagePrivateField = 20;
    protected int protectedField = 30;
    public int publicField = 40;

    private void privateMethod() {
        System.out.println("Private method - доступен только внутри класса");
        System.out.println("privateField: " + privateField);
    }

    void packagePrivateMethod() {
        System.out.println("Package-private (default) method - доступен только в том же пакете");
    }

    protected void protectedMethod() {
        System.out.println("Protected method - доступен в том же пакете и подклассам");
    }

    public void publicMethod() {
        System.out.println("Public method - доступен всем");
    }

    public void demonstratePrivateAccess() {
        System.out.println("\nPRIVATE (доступ внутри класса)");
        privateField = 100;
        privateMethod();
        System.out.println("Измененный privateField: " + privateField);
    }

    static class SamePackageClass {
        public void testAccess(AccessModifiers obj) {
            System.out.println("\nДОСТУП ИЗ КЛАССА В ТОМ ЖЕ ПАКЕТЕ");
            System.out.println("packagePrivateField: " + obj.packagePrivateField);
            obj.packagePrivateMethod();
            System.out.println("protectedField: " + obj.protectedField);
            obj.protectedMethod();
            System.out.println("publicField: " + obj.publicField);
            obj.publicMethod();
        }
    }

    static class SubClassInSamePackage extends AccessModifiers {
        public void testAccess() {
            System.out.println("\n ДОСТУП ИЗ ПОДКЛАССА В ТОМ ЖЕ ПАКЕТЕ");
            System.out.println("packagePrivateField: " + packagePrivateField);
            packagePrivateMethod();
            System.out.println("protectedField: " + protectedField);
            protectedMethod();
            System.out.println("publicField: " + publicField);
            publicMethod();
        }
    }

    public static void main(String[] args) {
        AccessModifiers myObj = new AccessModifiers();

        myObj.demonstratePrivateAccess();

        SamePackageClass samePackageObj = new SamePackageClass();
        samePackageObj.testAccess(myObj);

        SubClassInSamePackage subObj = new SubClassInSamePackage();
        subObj.testAccess();

        System.out.println("\nPUBLIC ДОСТУП");
        System.out.println("publicField: " + myObj.publicField);
        myObj.publicMethod();


    }
}