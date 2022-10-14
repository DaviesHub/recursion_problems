import java.util.Collections;
import java.util.List;

public class MaxNum {

    // This function finds the largest number in a list
    public static int largeNum(List<Integer> arr) {
        if (arr.size() == 1) {
            return arr.get(0);
        }
        arr.remove(Collections.min(arr.subList(0, 2)));
        return largeNum(arr);
    }

}
