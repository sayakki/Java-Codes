package p1;

public class PalindromeNumber {
    public static void main(String[] args) {
       int a=12144121;
       System.out.println(isPalindrome(a));
       if(isPalindrome(a))
           System.out.println(a+" is palindrome number");
    }

    public static boolean isPalindrome(int input) {
        int j=input;
        int sum=0;
        int digit=0;
        while(j>0){
            digit=j%10;
            sum=sum*10+digit;
            j=j/10;
        }
        return input==sum;
    }
}


