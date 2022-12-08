package p1;

public class Prime {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            if(isPrime(i)){
                System.out.println("prime no "+i);
            }
        }

    }
    public static boolean isPrime(int n){
        while(n<2)
            return false;

        for (int i =2; i <=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
