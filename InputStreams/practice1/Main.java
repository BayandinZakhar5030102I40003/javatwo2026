import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("test.txt");

            int data;

            while ((data = fis.read()) != -1) {
                System.out.println("Байт: " + data + " -> Символ: " + (char) data);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии потока: " + e.getMessage());
            }
        }
    }
}