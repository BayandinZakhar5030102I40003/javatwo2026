public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello"); //StringBuffer

        // 1. append() - добавляет строку в конец
        sb.append(" World");
        System.out.println("append: " + sb);

        // 2. insert() - вставляет строку в указанную позицию
        sb.insert(5, " Java");
        System.out.println("insert: " + sb);

        // 3. delete() - удаляет символы с start до end
        sb.delete(5, 10);
        System.out.println("delete: " + sb);

        // 4. deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt: " + sb);

        // 5. replace() - заменяет часть строки
        sb.replace(6, 11, "Java");
        System.out.println("replace: " + sb);

        // 6. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("reverse: " + sb);
        sb.reverse();

        // 7. length() - возвращает длину
        System.out.println("length: " + sb.length());

        // 8. charAt() - возвращает символ по индексу
        System.out.println("charAt(0): " + sb.charAt(0));

        // 9. setCharAt() - заменяет символ по индексу
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt: " + sb);

        // 10. substring() - возвращает подстроку
        System.out.println("substring(0, 5): " + sb.substring(0, 5));
    }
}
