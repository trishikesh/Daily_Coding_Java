import java.util.*;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Use LinkedHashMap to maintain insertion order
        Map<Character, List<Integer>> vowelMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); // Convert to lowercase for uniformity

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                List<Integer> indices = vowelMap.get(ch);

                if (indices == null) {
                    indices = new LinkedList<>();
                    vowelMap.put(ch, indices);
                }

                indices.add(i);
            }
        }

        System.out.println(vowelMap);
    }
}
