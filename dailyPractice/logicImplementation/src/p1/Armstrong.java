package p1;

public class Armstrong {
    public static void main(String[] args) {

        for (int i = 0; i <400 ; i++) {
            if(isArmstrong(i)){
                System.out.println(i+" is Armstrong");
            }
        }
    }
    public static boolean isArmstrong(int input){
        int sum=0;
        int j=input;
        int digit=0;
        while(j>0){
            digit=j%10;
            j=j/10;
            sum=sum+digit*digit*digit;
        }
        return input==sum;
    }
}
