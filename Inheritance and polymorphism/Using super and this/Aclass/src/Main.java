class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        z = 1;
    }

    public A(int a) {
        this();      // Вызов A()
        this.a = a;
    }

    public A(int a, int b) {
        this();      // Вызов A()
        this.a = a;
        this.b = b;
    }

    public A(int a, int b, int c) {
        this();      // Вызов A()
        this.a = a;
        this.b = b;
        this.c = c;
    }
}