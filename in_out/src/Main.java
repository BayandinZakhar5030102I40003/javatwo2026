import java.util.Scanner;

void main() {
    System.out.println(String.format("Введите имя:"));
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println(String.format("Привет, %s", name));
}
