package duplicates.removingElements;
//using HashSet
import java.util.HashSet;

public class A3 {
    public static void main(String[] args) {
        int[] x = {10, 10, 11, 12, 12, 13, 13, 14, 15, 16, 16, 16, 17};

        HashSet<Integer> temp = new HashSet<>();

        for (Integer e:x
             ) {
            if(temp.add(e)==true)
                System.out.print(e+"  ");
        }
    }
}