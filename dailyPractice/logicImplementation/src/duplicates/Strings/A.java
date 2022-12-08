package duplicates.Strings;
//1.Using brute force
public class A {
    public static void main(String[] args) {
        String infra[]={"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};

        for (int i = 0; i < infra.length; i++) {
            for (int j = i+1; j < infra.length ; j++) {
                if(infra[i].equals(infra[j]))
                    System.out.println(infra[i]);
            }
        }
    }
}
