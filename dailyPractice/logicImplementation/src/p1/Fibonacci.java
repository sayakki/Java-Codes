package p1;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.isFibonacci();
    }
    public static int isFibonacci(){
        int n1=0;
        int n2=1;
        int n3=0;
        System.out.print(n1+" "+n2);
        for (int i = 0; i < 10; i++) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    return n3;
    }
}
