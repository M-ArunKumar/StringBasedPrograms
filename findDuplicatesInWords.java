package Strings;

public class findDuplicatesInWords {
    static void main(String[] args) {
        String name = "arun kumar kumar arun test";
        String[] word = name.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals("0")){
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])){
                    count++;
                    word[j] = "0";
                }
            }
            if (count > 1){
                System.out.println(word[i] + "-" + count);
            }
        }
    }
}
