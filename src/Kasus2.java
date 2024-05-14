import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kasus2 {
    public static void main(String[] args) {
        String nama ="Src/Data.txt";
        Scanner sc = new Scanner(System.in);
        System.out.print("Inputkan Nilai : ");
        int inputNilai = sc.nextInt();
        if(inputNilai <= 100){
            List<Integer> index = CariIndex(nama,inputNilai);
            if (!index.isEmpty()){
                System.out.println("Index ke-" + index);
            }else {
                System.out.println("elemen " + inputNilai + " tidak ditemukan");
            }
        }else {
            for (int i = 0; i < 3; i++) {
                System.out.print("Masukkan nilai baru: ");
                int baru = sc.nextInt();
                if (baru <= 100){
                    List<Integer> index = CariIndex(nama,baru);
                    if (!index.isEmpty()){
                        System.out.println("Index ke-" + index);
                    }else {
                        System.out.println("elemen " + inputNilai + " tidak ditemukan");
                    }
                    break;
                }
            }
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
