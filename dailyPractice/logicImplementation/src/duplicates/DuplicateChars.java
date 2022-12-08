package duplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChars {
    public static void main(String[] args) {
        System.out.println("Enter the String for the Output: \n");
        Scanner s = new Scanner(System.in);
        print(s.nextLine());

    }
    public static void print(String str){
        if(str==null){
            System.out.println("null string ");
            return;
        }
        if (str.isEmpty()){
            System.out.println("Empty String");
            return;
        }
        if (str.length()==1) {
            System.out.println("Only character in the string");
            return;
        }

       // char[] words = str.toCharArray();
        char words[] = str.toCharArray();

        Map<Character,Integer> x=new HashMap<Character,Integer>();

        for (Character ch:words) {
            if(x.containsKey(ch)){
                x.put(ch,x.get(ch)+1);
            }
            else {
                x.put(ch,1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = x.entrySet();
        for (Map.Entry<Character,Integer> e:entrySet) {
            if(e.getValue()> 1)
                System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
