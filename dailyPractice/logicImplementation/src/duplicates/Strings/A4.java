package duplicates.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

//1.Using HashSet and lambda function
public class A4 {
    public static void main(String[] args) {
        String infra[]={"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP","Amazon","GCP"};
        HashSet<String> data = new HashSet<>();
        Arrays.asList(infra).stream().filter(e->!data.add(e)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
