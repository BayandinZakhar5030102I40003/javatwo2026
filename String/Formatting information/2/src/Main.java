
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        System.out.printf("Год: %tY%n", now);

        System.out.printf("Месяц: %tB%n", now);

        System.out.printf("День недели: %tA%n", now);

        System.out.printf("Час (24-часовой): %tH%n", now);

        System.out.printf("Минуты: %tM%n", now);

        System.out.printf("Сегодня: %tA, %td %tB %tY%n", now, now, now, now);
        System.out.printf("Время: %tH:%tM:%tS%n", now, now, now);
    }
}