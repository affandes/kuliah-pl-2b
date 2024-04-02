import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LabrakKpps {
    public static void main(String[] args) {

        String namaFile = "./src/data_labrak_11_1106_110614.csv";

        List<DataKpps> dataKppsList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(";");
                DataKpps r = new DataKpps();
                r.kode = row[0];
                r.label = row[1];
                r.paslon01 = !row[2].equals("-") ? Integer.valueOf(row[2]) : -1;
                r.paslon02 = row[3].equals("-") ? -1 : Integer.valueOf(row[3]);
                r.paslon03 = row[4].equals("-") ? -1 : Integer.valueOf(row[4]);


                dataKppsList.add(r);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        for (int i = 0; i < dataKppsList.size(); i++) {
            //System.out.println(dataKppsList.get(i).label + " " + dataKppsList.get(i).paslon01);

            /*if (dataKppsList.get(i).paslon01 == -1) {
                System.out.println(dataKppsList.get(i).label + " " + dataKppsList.get(i).paslon01);
            }*/

            if (dataKppsList.get(i).paslon01 > dataKppsList.get(i).paslon02
                    && dataKppsList.get(i).paslon01 > dataKppsList.get(i).paslon03) {
                System.out.println(dataKppsList.get(i).label + " " + dataKppsList.get(i).paslon01);
            }
        }

    }
}
