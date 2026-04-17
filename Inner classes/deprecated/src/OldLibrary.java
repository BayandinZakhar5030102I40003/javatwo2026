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
        lib.oldMethod();  // Предупреждение компиляции
        lib.newMethod();  // Без предупреждений
    }
}

class Library {
    @Deprecated(since = "2.0", forRemoval = true)
    public void removedMethod() {
        System.out.println("Will be removed in next version");
    }
}