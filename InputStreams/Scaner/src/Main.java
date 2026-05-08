import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("scaner.txt");

        try {
            // Создаем Scanner для чтения из файла
            Scanner scanner = new Scanner(file);

            // Читаем файл построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close(); // Закрываем сканер

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}