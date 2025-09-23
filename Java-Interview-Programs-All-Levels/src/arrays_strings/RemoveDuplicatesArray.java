import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,1,5};
        Set<Integer> set = new LinkedHashSet<>();
        for (int v : arr) set.add(v);
        int[] res = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(res));
    }
}
