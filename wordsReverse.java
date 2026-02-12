package Strings;

import java.util.Scanner;

public class wordsReverse {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.nextLine();
        String[] words = input.split("");
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        for (int i = words.length-1; i >= 0 ; i--) {
            System.out.print(words[i]);
        }
        sc.close();
    }
}
