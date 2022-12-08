package p1;

public class Count {
    public static void main(String[] args) {
        String s="AkshAY kumar";
        int j=s.length();
        int count=0;
        for (int i = 0; i <j ; i++) {
            if(s.charAt(i)=='a'){
                count++;
                System.out.print(s.charAt(i));
            }

        }


        System.out.println(": "+count);

    }
}
