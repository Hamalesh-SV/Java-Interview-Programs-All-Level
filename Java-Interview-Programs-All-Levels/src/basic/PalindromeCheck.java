public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        System.out.println(str + " -> " + (cleaned.equals(reversed) ? "Palindrome" : "Not Palindrome"));
    }
}
