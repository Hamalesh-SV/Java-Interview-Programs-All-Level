import java.util.Arrays;
public class RotateArray {
    public static void rotate(int[] a, int k){
        int n=a.length; k = k % n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
    }
    static void reverse(int[] a,int i,int j){
        while(i<j){ int t=a[i]; a[i]=a[j]; a[j]=t; i++; j--; }
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        rotate(a,2);
        System.out.println(Arrays.toString(a));
    }
}
