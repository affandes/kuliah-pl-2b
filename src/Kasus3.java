import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kasus3 {
    public static void main(String[] args) {

        int nilai = -1;
        for ( ; nilai < 0 || nilai > 100; ) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Inputkan Nilai : ");
            nilai = sc.nextInt();
        }

        List<Integer> hasil = CariIndex("src/data.txt", nilai);
        if (!hasil.isEmpty()){
            System.out.println("Index ke-" + hasil);
        }else {
            System.out.println("elemen " + nilai + " tidak ditemukan");
        }
    }

    private static List<Integer> CariIndex(String nama, int inputNilai) {
        List<Integer> index = new ArrayList<>();
        int nilai= 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(nama));
            String line;
            while((line = br.readLine()) != null){
                String[] nomor = line.trim().split("\\s+");
                for (String num : nomor) {
                    int numur = Integer.parseInt(num);
                    if (numur == inputNilai) {
                        index.add(nilai);
                    }
                    nilai++;
                }
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        return index;
    }
}
