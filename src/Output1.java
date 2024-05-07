public class Output1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            System.out.print(i + " ");

            if (i % 2 == 0) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }

            System.out.println();
        }
    }
}
