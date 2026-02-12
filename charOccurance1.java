package Strings;

import java.util.*;

// input : arunn
// output: a-1, r-1, u-1, n-2

public class charOccurance1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String name : ");
        String val = sc.nextLine();
        Map<Character,Integer> occ = new HashMap<>();
        for (char c : val.toCharArray()){
            occ.put(c, occ.getOrDefault(c,0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : occ.entrySet()){
            System.out.println("Character " + entry.getKey() + " Occurance " + entry.getValue());
        }
        sc.close();
    }
}
