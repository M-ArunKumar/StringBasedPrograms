package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class charOccurance2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String name = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : name.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        System.out.println("Enter the char to search its occurance : ");
        char search = sc.next().charAt(0);

        if (map.containsKey(search)){
            System.out.println("The char " + search + " It occured " + map.get(search) + " times");
        }else System.out.println("The char " + search + " is not found");
    }
}
