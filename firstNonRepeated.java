package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeated {
    static void main(String[] args) {
        String name = "SWISS";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.println("First non-repeated char is : " + entry.getKey());
                break;
            }
        }
    }
}
