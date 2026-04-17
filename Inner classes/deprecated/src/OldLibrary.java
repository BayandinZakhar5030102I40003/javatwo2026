public class OldLibrary {
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is old");
    }

    public void newMethod() {
        System.out.println("Use this instead");
    }
}

class Main {
    public static void main(String[] args) {
        OldLibrary lib = new OldLibrary();
        lib.oldMethod();
        lib.newMethod();
    }
}

