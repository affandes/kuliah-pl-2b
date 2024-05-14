import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kasus1 {
    public static void main(String[] args) {

        /**
         * Kasus:
         * 1. Program mencari angka berdasarkan nilai yang diinputkan
         *    kemudian hasilkan nilai indeksnya
         * 2. Program mencari angka berdasarkan nilai yang dimasukkan
         *    kemudian hasilkan beberapa nilai indeksnya dalam bentuk
         *    array.
         */

        String namaFile = "Src/Data.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("Inputkan Nilai : ");
        int inputNilai = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                index++;
                int value = Integer.parseInt(line);
                if (inputNilai == value) {
                    arr.add(index);
                }
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        if(!arr.isEmpty()){
            System.out.println("Nilai : " + inputNilai + " Di index : " + arr);
        }
    }
}
