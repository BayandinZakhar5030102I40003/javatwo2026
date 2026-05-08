import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.txt")) {

            // Записываем массив
            byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            fos.write(data);

            byte[] partial = {10, 11, 12, 13, 14, 15};
            fos.write(partial, 2, 3);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}