package pl.sda;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String text = getInputText("Podaj tekst: ");
        printAll(text);


    }

    private static void printAll (String text) {

        for (int i=1; i < text.length(); i++) {
            boolean result = true;
            for (int j=0; k=i; k>=0 && j<=i; k--) {
                if(text.charAt(j) != text.charAt(i+j)){
                    result = false;
                    break;
                }
                System.out.println(text.substring(i-j,i+j+1));
            }
        }
    }

    private static String getInputText(String message) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextLine();

    }

    private static String ifDoublePalindrome (String  ) {


    }

    private static String




}
