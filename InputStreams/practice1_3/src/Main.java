import java.io.*;

public class Main {
    public static void main(String[] args) {
        String text = "helo";

        try (FileOutputStream fos = new FileOutputStream("output.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
             BufferedWriter writer = new BufferedWriter(osw)) {

            writer.write(text);
            System.out.println("Файл записан с кодировкой UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("output2.txt"), "UTF-8")) {

            writer.write(text);
            System.out.println("Файл записан");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}