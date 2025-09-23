import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "swiss";
        LinkedHashMap<Character, Integer> cnt = new LinkedHashMap<>();
        for (char c : s.toCharArray()) cnt.put(c, cnt.getOrDefault(c,0)+1);
        char ans = 0;
        for (Map.Entry<Character,Integer> e : cnt.entrySet()) {
            if (e.getValue() == 1) { ans = e.getKey(); break; }
        }
        System.out.println("First non-repeating: " + (ans==0?"none":ans));
    }
}
