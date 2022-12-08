package duplicates.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//1.Using Collections.frequency
public class A6 {
    public static void main(String[] args) {
        String infra[] = {"Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "SauceLabs", "Azure", "GCP"};
       List<String> list = Arrays.asList(infra);
       list.stream().filter(e->Collections.frequency(list,e)>1)
               .collect(Collectors.toList())
               .forEach(System.out::println);


    }
}