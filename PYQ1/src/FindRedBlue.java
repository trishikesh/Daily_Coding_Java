import java.util.*;

public class FindRedBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc = new Scanner(str);
        Map<String,Integer> m = new TreeMap<String,Integer>();
        while (sc.hasNext()){
            String word = sc.next();
            word = word.toLowerCase();
            Integer count = m.get(word);
            if(word.equals("red") || word.equals("blue")) {
                if (count == null) {
                    m.put(word, 1);
                } else {
                    count++;
                    m.put(word, count);
                }
            }

        }

            System.out.println(m);

    }

}
