public class MissingNumber {
    public static int missing(int[] arr, int n) { // arr contains numbers from 1..n with one missing, length n-1
        int expected = n*(n+1)/2;
        int sum=0; for(int v:arr) sum+=v;
        return expected - sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println("Missing: " + missing(arr,6));
    }
}
