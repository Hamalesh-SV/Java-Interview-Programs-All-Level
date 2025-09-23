import java.util.Arrays;
public class MoveZerosEnd {
    public static void moveZeros(int[] a){
        int idx=0;
        for(int v:a) if(v!=0) a[idx++]=v;
        while(idx<a.length) a[idx++]=0;
    }
    public static void main(String[] args){
        int[] a = {0,1,0,3,12};
        moveZeros(a);
        System.out.println(Arrays.toString(a));
    }
}
