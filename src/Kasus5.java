import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kasus5 {
    public static void main(String[] args) {

        // Load semua nilai dan masukkan ke dalam Class PersegiPanjang
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

        // Cari PersegiPanjang yang Luasnya paling besar
        int index = 0;
        for (int i = 0; i < persegiPanjang.size(); i++) {
            if (persegiPanjang.get(i).luas() < persegiPanjang.get(index).luas()) {
                index = i;
            }
        }

        System.out.println("Luas paling luas " + persegiPanjang.get(index).luas());
        System.out.println("index " + index);

    }
}
