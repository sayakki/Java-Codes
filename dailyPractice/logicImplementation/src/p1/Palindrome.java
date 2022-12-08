package p1;

public class Palindrome {
    public static void main(String[] args) {
        String input="nitin is malayalam";
        String[] s = input.split(" ");
        for (String word:s) {
            if(isPalindrome(word))
            System.out.println(word);
        }

    }
    public static boolean isPalindrome(String input){
        int i=0;
        int j=input.length()-1;
        while(j>i){
            if(input.charAt(i)!=input.charAt(j)){
                return false;
            }else {
                i++;
                j--;
            }
        }

        return true;
    }
}


