package p1;

public class ReverseWbyW {
    public static void main(String[] args) {

        System.out.println( reverse("My name is Akshay"));
    }
    public static String reverse(String input){
        String result="";
        int i=input.length()-1;
        while (i>=0){
            while(i>=0&&input.charAt(i)==' ') i--;
            int j=i;

            if(i<0) break;

            while(i>=0&&input.charAt(i)!=' ') i--;
                if(result.isEmpty()){
                    result = result.concat(input.substring(i + 1, j + 1));
                }
                else {
                    result = result.concat(" "+input.substring(i + 1, j + 1));
                }

        }
        return result;
    }
}
