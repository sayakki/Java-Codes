package duplicates.Strings;

import java.util.HashSet;

//1.Using HashSet
public class A2 {
    public static void main(String[] args) {
        String infra[]={"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP",};
//when occurence of string is greater than 1 than program fails and prints again same element
        HashSet<String> data = new HashSet<>();
        for (String e:infra
             ) {
            if(data.add(e)==false) {
                System.out.println(e);
            }
        }

    }
}
