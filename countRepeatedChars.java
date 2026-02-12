package Strings;

import java.util.Scanner;

public class countRepeatedChars {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();
        int count = 1;
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == input.charAt(i+1)){
                count++;
            }else {
                System.out.print(input.charAt(i)+ "" +count);
                count = 1;
            }
        }
        System.out.print(input.charAt(input.length()-1)+ "" +count);
    }
}
