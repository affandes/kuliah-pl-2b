import java.util.Scanner;

public class Output3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Maks = ");
        int maks = input.nextInt();

        for(int i = 0; i <= maks; i++) {
            System.out.println("A " + i + "-" + "B " + (maks-i));
        }

    }
}
