package Strings;

import java.util.LinkedHashMap;

public class lastNonRepeated {
    static void main(String[] args) {
        String name = "SWISS";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = name.length() - 1; i > 0 ; i--) {
            char ch = name.charAt(i);
            if (map.get(ch) == 1){
                System.out.println("last non-repeated char : " + ch);
                break;
            }
        }
    }
}
