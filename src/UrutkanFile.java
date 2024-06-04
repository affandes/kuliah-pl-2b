import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UrutkanFile {
    public static void main(String[] args) {

        // 1. Baca file sisi.txt
        String namaFile = "src/sisi.txt";
        List<PersegiPanjang> persegiPanjang = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                PersegiPanjang p = new PersegiPanjang(data[0], data[1]);
                persegiPanjang.add(p);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(persegiPanjang);

        // 3. Urutkan dari kecil ke besar

        // 4. Tulis sisi-sisinya ke file output.txt

    }
}
