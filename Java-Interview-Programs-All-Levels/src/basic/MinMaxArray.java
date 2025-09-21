public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 22, 3, 99, 45};
        int min = arr[0], max = arr[0];
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
