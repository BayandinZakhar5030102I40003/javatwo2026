public class Main {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = "java";
        System.out.println("Длина строки: " + str.length());
        String trimmed = str.trim();
        System.out.println("После trim(): '" + trimmed + "'");
        System.out.println("Нижний регистр: " + str.toLowerCase());
        System.out.println("Верхний регистр: " + str.toUpperCase());
        System.out.println("equalsIgnoreCase: " + trimmed.equalsIgnoreCase(str2));
        System.out.println("substring(4, 8): " + trimmed.substring(4, 8));
        System.out.println("contains('Java'): " + trimmed.contains("Java"));
        System.out.println("replace('a', 'o'): " + trimmed.replace('a', 'o'));
        String[] words = trimmed.split(" ");
        System.out.println("split(' '): " + java.util.Arrays.toString(words));
        System.out.println("charAt(0): " + trimmed.charAt(0));
    }
}