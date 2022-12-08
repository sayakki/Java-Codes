package duplicates.removingElements;

public class A {
    public static void main(String[] args) {
        int[] x={10,10,11,12,12,13,13,14,15,16,16,16,17};
        int count=0;
        int distinct=0;
        for (int i = 0; i <x.length ; i++) {
            for (int j = i+1; j <x.length ; j++) {
                if (x[i]==x[j]){
                    x[i]=0;
                    count++;
                }
            }
        }

        for (int i = 0; i <x.length ; i++) {
            if (x[i]!=0){
                distinct++;
                System.out.print(x[i]+" ");
            }
        }
        System.out.println("\ntotal duplicates are : "+count);
        System.out.println("distict elements are : "+distinct);
    }
}