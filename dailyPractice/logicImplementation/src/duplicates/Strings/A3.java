package duplicates.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//1.Using HashMap
public class A3 {
    public static void main(String[] args) {
        String infra[]={"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};

        HashMap<String, Integer> x = new HashMap<>();

        for (String e:infra) 
        {
 //           Integer count = x.get(e);
            if(x.get(e)==null)
                x.put(e,1);
            else
                x.put(e,x.get(e)+1);
        }
        Set<Map.Entry<String, Integer>> entrySet = x.entrySet();
        for (Map.Entry<String, Integer> entry:entrySet)
        {
            if (entry.getValue()>1)
                System.out.println(entry.getKey()+":"+entry.getValue());


        }
    }
}
