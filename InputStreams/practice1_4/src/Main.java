import java.io.*;

class FileProcessor implements AutoCloseable {
    private BufferedReader reader;
    private String fileName;

    public FileProcessor(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.reader = new BufferedReader(new FileReader(fileName));
    }

    public String readFirstLine() throws IOException {
        return reader.readLine();
    }

    @Override
    public void close() {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при закрытии: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data.txt")) {
            fw.write("Hello World!\nЭто тестовый файл");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileProcessor fp = new FileProcessor("data.txt")) {
            String firstLine = fp.readFirstLine();
            System.out.println("Первая строка: " + firstLine);


        } catch (IOException | RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try (FileProcessor fp2 = new FileProcessor("data.txt")) {
            String line = fp2.readFirstLine();
            System.out.println("Снова читаем: " + line);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}