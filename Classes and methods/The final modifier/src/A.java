class A {
    public final int a1 = 10;

    public final int a2;

    public final int a3;

    public final int a4;

    public final int a5;
    public final int a6;

    {
        a2 = 20;
    }

    public A() {
        a3 = 30;
        a4 = 40;
        a5 = 50;
        a6 = 60;
    }

    public A(int value) {
        a3 = value;
        a4 = value + 10;
        a5 = value + 20;
        a6 = value + 30;
    }

    public A(int value1, int value2) {
        a3 = value1 + value2;
        a4 = value1 - value2;
        a5 = value1;
        a6 = value2;
    }

    public A(String str) {
        a3 = str.length();
        a4 = str.length() * 2;
        a5 = str.length() * 3;
        a6 = str.length() * 4;
    }

    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println("obj1: a1=" + obj1.a1 + ", a2=" + obj1.a2 + ", a3=" + obj1.a3 +
                ", a4=" + obj1.a4 + ", a5=" + obj1.a5 + ", a6=" + obj1.a6);

        A obj2 = new A(100);
        System.out.println("obj2: a1=" + obj2.a1 + ", a2=" + obj2.a2 + ", a3=" + obj2.a3 +
                ", a4=" + obj2.a4 + ", a5=" + obj2.a5 + ", a6=" + obj2.a6);

        A obj3 = new A(50, 30);
        System.out.println("obj3: a1=" + obj3.a1 + ", a2=" + obj3.a2 + ", a3=" + obj3.a3 +
                ", a4=" + obj3.a4 + ", a5=" + obj3.a5 + ", a6=" + obj3.a6);

        A obj4 = new A("Hello");
        System.out.println("obj4: a1=" + obj4.a1 + ", a2=" + obj4.a2 + ", a3=" + obj4.a3 +
                ", a4=" + obj4.a4 + ", a5=" + obj4.a5 + ", a6=" + obj4.a6);
    }
}