package duplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStrings {
    public static void main(String[] args) {
        String infra[]={"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};

        HashMap<String, Integer> x = new HashMap<>();

        for (String str:infra) 
        {
            if(x.containsKey(str))
                x.put(str,x.get(str)+1);
            else
                x.put(str,1);
        }
        Set<Map.Entry<String, Integer>> entrySet = x.entrySet();
        for (Map.Entry<String, Integer> e:entrySet)
        {
            if (e.getValue()>1)
                System.out.println(e.getKey()+":"+e.getValue());


        }
    }
}
