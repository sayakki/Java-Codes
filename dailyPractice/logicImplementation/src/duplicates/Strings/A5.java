package duplicates.Strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//1.Using Map and lambda
public class A5 {
    public static void main(String[] args) {
        String infra[]={"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP","Amazon"};

        Arrays.asList(infra).stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
                    }

}
