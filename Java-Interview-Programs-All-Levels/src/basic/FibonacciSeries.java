public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i==n-1?"":" "));
            int c = a + b; a = b; b = c;
        }
        System.out.println();
    }
}
