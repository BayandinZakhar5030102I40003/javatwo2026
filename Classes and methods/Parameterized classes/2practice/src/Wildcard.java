import java.util.*;

public class Wildcard {

    // Примеры <? extends T>
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Примеры <? super T>
    public static void addIntegers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
        list.add(300);
    }

    public static void fillList(List<? super Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
    }

    // PECS: Producer Extends, Consumer Super
    public static <T> void copy(
            List<? extends T> source,
            List<? super T> destination) {
        for (T item : source) {
            destination.add(item);
        }
    }

    public static void main(String[] args) {
        // <? extends T> - чтение
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.1, 2.2);

        printNumbers(integers);
        printNumbers(doubles);
        System.out.println(sumNumbers(integers));

        // <? super T> - запись
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addIntegers(numbers);
        addIntegers(objects);
        fillList(numbers, 5);

        // PECS
        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Number> dest = new ArrayList<>();
        copy(src, dest);
    }
}