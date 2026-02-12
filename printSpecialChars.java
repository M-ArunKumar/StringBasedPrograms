package Strings;

public class printSpecialChars {
    static void main(String[] args) {
        String name = "Ar@un is good boy#";
        String[] words = name.split(" ");
        for(String word : words){
            boolean hasSpecial = false;
            for(int i = 0 ; i < word.length(); i++){
                if(!Character.isLetter(word.charAt(i))){
                    hasSpecial = true;
                    break;
                }
            }
            if (hasSpecial){
                word = word.replace('b', 'B');
                System.out.print(word + " ");
            }
        }
    }
}
