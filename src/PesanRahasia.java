import java.util.StringTokenizer;

public class PesanRahasia {
    public static void main(String[] args) {

        String pesan = "Algoritma";

        char plain[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char chipper[] = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};

        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < pesan.length(); i++) {
            char currentChar = Character.toLowerCase(pesan.charAt(i));
            boolean found = false;

            for (int j = 0; j < plain.length; j++) {
                if (currentChar == plain[j]) {
                    encryptedMessage.append(chipper[j]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                encryptedMessage.append(currentChar);
            }

        }

        System.out.println("Pesan Asli: " + pesan);
        System.out.println("Pesan Rahasia: " + encryptedMessage.toString());


    }
}
