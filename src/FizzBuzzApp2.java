public class FizzBuzzApp2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            System.out.print(i + " ");

            if (i % 3 == 0) {
                System.out.print("Fizz");
            }

            if (i % 5 == 0) {
                System.out.print("Buzz");
            }

            System.out.println();

        }

    }
}
