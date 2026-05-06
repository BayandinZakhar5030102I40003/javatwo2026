import java.util.StringJoiner;
public class string2 {
    public static void main(String[] args) {
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Апельсин");
        System.out.println(joiner1);
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Красный");
        joiner2.add("Синий");
        joiner2.add("Зеленый");
        System.out.println(joiner2);
        StringJoiner joiner3 = new StringJoiner(" | ");
        System.out.println("Пустой joiner: " + joiner3);
        StringJoiner joiner4 = new StringJoiner("-");
        joiner4.add("2024");
        joiner4.add("12");
        StringJoiner joiner5 = new StringJoiner("-");
        joiner5.add("31");
        joiner4.merge(joiner5);
        System.out.println("После merge: " + joiner4);
        StringJoiner joiner6 = new StringJoiner(", ");
        joiner6.setEmptyValue("Пусто");
        System.out.println("Пустой с setEmptyValue: " + joiner6);
        joiner6.add("Значение");
        System.out.println("Не пустой: " + joiner6);
    }
}