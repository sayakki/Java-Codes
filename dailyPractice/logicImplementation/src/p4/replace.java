package p4;

public class replace {
    public static void main(String[] args) {
        String s="Cloud Tech";
        String s1 = s.toLowerCase();
        remove(s1,'c');

    }
    public static void remove(String str,char c){
        int n=str.length();
        String result="";
        for (int i = 0; i <n ; i++) {
            if(str.charAt(i)!=c){
                result=result+str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
