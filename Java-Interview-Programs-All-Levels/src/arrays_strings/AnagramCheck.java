import java.util.Arrays;
public class AnagramCheck {
    public static boolean isAnagram(String a, String b){
        a = a.replaceAll("\\s+", "").toLowerCase();
        b = b.replaceAll("\\s+", "").toLowerCase();
        if(a.length() != b.length()) return false;
        char[] ac = a.toCharArray(), bc = b.toCharArray();
        Arrays.sort(ac); Arrays.sort(bc);
        return Arrays.equals(ac, bc);
    }
    public static void main(String[] args){
        System.out.println(isAnagram("listen","silent")); // true
        System.out.println(isAnagram("hello","bello")); // false
    }
}
