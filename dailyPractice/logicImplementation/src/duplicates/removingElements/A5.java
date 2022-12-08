package duplicates.removingElements;

import java.util.HashMap;

public class A5 {
    public static void main(String[] args) {
        int[] x = {10, 10, 11, 12, 12, 13, 13, 14, 15, 16, 16, 16, 17};
        int n = x.length;

        HashMap<Integer, Boolean> temp = new HashMap<>();

        for (Integer e:x
             ) {
            if(temp.get(e)==null){
                System.out.print(e+" ");
                temp.put(e,true);
            }
        }
    }
}