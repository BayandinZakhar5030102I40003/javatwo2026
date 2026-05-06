interface Printable {
    default void print() {
        System.out.println("Printable");
    }
}

interface Showable {
    default void print() {
        System.out.println("Showable");
    }
}

class Document implements Printable, Showable {
    @Override
    public void print() {
        Printable.super.print();
    }
}

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
    }
}