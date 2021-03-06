import java.util.Scanner;



public class CipherCaesar {


    public static final int ALPHABET_LENTH = 26;


    public static void main(String[] args) {

        String plainText = getInputText();


        final int shift = 3;

        String encriptedText = encrypt(plainText, shift);

        String decryptedText = decrypt(plainText, shift);


        System.out.println("encriptedText: " + encriptedText);
        System.out.println("decriptedText: " + decryptedText);

    }


    private static String getInputText() {

        System.out.println("Podaj text do zakodowania: ");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }


    private static String encrypt(String text, int shift) {


        String result = "";

        for (int i = 0; i < text.length(); i++) {

            result += getShiftedChar(text.charAt(i), shift);

        }

        return result;

    }


    private static char getShiftedChar(char cipherChar, int shift) {

        int charValue = (int) cipherChar;


        if (cipherChar == ' ') {

            return ' ';

        }


        if (cipherChar <= 'A' + ALPHABET_LENTH - shift) {

            return (char) (charValue + shift);

        } else {

            return (char)((int)charValue - ALPHABET_LENTH + shift);

        }


  //      return (char) (((charValue + shift - 'A') % ALPHABET_LENTH) + 'A');


    }


    private static String decrypt(String text, int shift) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            result += getShiftedChar2(text.charAt(i), shift);

        }

        return result;

    }

    private static char getShiftedChar2(char cipherChar, int shift) {

        int charValue = (int) cipherChar;


        if (cipherChar == ' ') {

            return ' ';

        }

        if (cipherChar <= 'A' + ALPHABET_LENTH - shift) {

            return (char) (charValue + shift - 'A');

        } else {

            return (char) ((int) charValue - ALPHABET_LENTH + shift);

        }


        //      return (char) (((charValue + shift -'A') % ALPHABET_LENTH) + 'A');}


    }
}

