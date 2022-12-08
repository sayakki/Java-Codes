package Vowels;

public class Vowels {
    public static void main(String[] args) {
        String s="Akshay I love You";
        s.toLowerCase();

        long count = s.chars().filter(e -> {
            return ((char) e == 'a'||(char) e == 'e'||(char) e == 'i'||(char) e == 'o'||(char) e == 'u');
        }).count();

        System.out.println(count);
    }
}
