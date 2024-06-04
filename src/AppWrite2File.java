import java.io.FileWriter;
import java.io.IOException;

public class AppWrite2File {
    public static void main(String[] args) {

        // Write hello world 10 lines
        String filename = "src/output.txt";
        String teks = "Hello World";

        try {
            FileWriter fw = new FileWriter(filename);
            for (int i = 0; i < 10; i++) {
                fw.write(teks + "\n");
            }
            fw.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
