package Strings;

public class findDuplicatesInString {
    static void main(String[] args) {
        String name = "arun kumar";
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0'){
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    arr[j] = '0';
                }
            }
            if (count > 1){
                System.out.println(arr[i] + "-" + count);
            }
        }
    }
}
