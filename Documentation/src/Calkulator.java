/**
 * Класс {@code Calculator} предоставляет набор базовых арифметических операций.
 * Этот класс демонстрирует использование утилиты Javadoc.
 *
 * @author Ivan Petrov
 * @version 1.0
 * @since 1.0
 */
public class Calkulator {

    /**
     * Хранит результат последней выполненной операции.
     * По умолчанию равен {@code 0}.
     */
    private double lastResult;

    /**
     * Возвращает результат последней операции.
     *
     * @return значение поля {@link #lastResult}
     * @see #lastResult
     */
    public double getLastResult() {
        return lastResult;
    }

    /**
     * Выполняет сложение двух чисел с плавающей точкой.
     * Результат сохраняется в поле {@link #lastResult}.
     *
     * @param a первое слагаемое (double)
     * @param b второе слагаемое (double)
     * @return сумма чисел a и b
     * @throws IllegalArgumentException если аргументы некорректны (в данном примере не реализовано)
     */
    public double add(double a, double b) {
        lastResult = a + b;
        return lastResult;
    }

    /**
     * Выполняет деление двух чисел.
     * Результат сохраняется в поле {@link #lastResult}.
     *
     * @param a делимое (double)
     * @param b делитель (double)
     * @return частное от деления a на b
     * @throws ArithmeticException если делитель {@code b} равен 0
     * @deprecated Этот метод может привести к ошибкам при делении на ноль.
     *             Рекомендуется использовать более безопасную реализацию.
     */
    @Deprecated
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        lastResult = a / b;
        return lastResult;
    }

    /**
     * Точка входа в программу для демонстрации работы калькулятора.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Calkulator calc = new Calkulator();
        System.out.println("Сумма: " + calc.add(10, 5));
    }
}