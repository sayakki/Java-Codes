package p1;

import java.util.regex.Pattern;

public class Reverse {
    public static void main(String[] args) {

        System.out.println( reverse("My name is Akshay"));
    }
    public static String reverse(String input){
        Pattern pattern = Pattern.compile(" ");
        String[] temp = pattern.split(input);

        String result="";

        for (int i=0;i<temp.length;i++)
        {
            if(i==temp.length-1){
                result=temp[i]+result;
            }
            else
                result=" "+temp[i]+result;
        }

        return result;
    }
}
