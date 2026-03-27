class Container<T> {
    private T content;

    public Container(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

class NumberContainer<N extends Number> extends Container<N> {
    public NumberContainer(N content) {
        super(content);
    }
}

public class Main {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Text");
        NumberContainer<Integer> intContainer = new NumberContainer<>(100);

        // Проверка на суперкласс
        if (intContainer instanceof Container) {
            System.out.println("intContainer is instance of Container (raw type)");
        }

        // Проверка на параметризованный суперкласс с wildcard
        if (intContainer instanceof Container<?>) {
            System.out.println("intContainer is instance of Container<?>");
        }

        // Проверка конкретного типа с wildcard
        if (stringContainer instanceof Container<?>) {
            System.out.println("stringContainer is instance of Container<?>");
        }
    }
}