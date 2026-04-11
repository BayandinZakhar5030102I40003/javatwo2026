class A {
    int a1;           // default
    public int a2;    // public
    protected int a3; // protected
    private int a4;   // private

    void method1() {           // default
    }

    public void method2() {    // public
    }

    protected void method3() { // protected
    }

    private void method4() {   // private
    }
}
class B extends A {
    void testAccessInB() {
        // Доступ из класса B
        a1 = 1;      //  есть доступ - default (в том же пакете)
        a2 = 2;      //  есть доступ - public
        a3 = 3;      //  есть доступ - protected
        // a4 = 4;  //  нет доступа - private (только внутри A)

        method1();   // есть доступ - default
        method2();    // есть доступ - public
        method3();   // есть доступ - protected
        // method4(); //  нет доступа - private
    }
}

class C extends B {
    void testAccessInC() {
        // Доступ из класса C (наследник B, косвенный наследник A)

        a1 = 1;      // есть доступ - default (если C в том же пакете)
        a2 = 2;       // есть доступ - public (везде)
        a3 = 3;      // есть доступ - protected (наследуется)
        // a4 = 4;  // нет доступа - private (никогда не наследуется)

        method1();   // есть доступ - default (если в том же пакете)
        method2();   // есть доступ - public
        method3();   // есть доступ - protected
        // method4(); // нет доступа - private
    }
}