package Strings;

public class printAlphNumsSpecial {
    static void main(String[] args) {
        String name = "A1!R2#U3$N4@";
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder specials = new StringBuilder();
        for(char ch : name.toCharArray()){
            if (Character.isLetter(ch)){
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }else specials.append(ch);
        }
        System.out.println("Alphabets: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special: " + specials);
    }
}
