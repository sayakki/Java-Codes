package Vowels;

public class VowelsPrinting {
    public static void main(String[] args) {
        String s="Akshay Bhai i love you";
        String str = s.toLowerCase();
        occurence(str,"a"); occurence(str,"e");occurence(str,"i");occurence(str,"o"); occurence(str,"u");

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)==' '||str.charAt(i)=='e'||
                    str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.print(str.charAt(i));
            }
            else System.out.print("*");
        }

    }

    public static void occurence(String str, String a) {
        long count = str.chars().mapToObj(e -> {
            return String.valueOf((char) e);
        }).filter(e -> {
            return e.equalsIgnoreCase(a);
        }).count();
        System.out.println(count+":"+a);
    }

}
