import java.util.ArrayList;
import java.util.List;

public class ArrSum {

    public static int sumAll(List<Integer> arr) {
        // This function returns the sum of items in an integer array

        if (arr.size() == 1) {
            return arr.get(0);
        }
        return sumAll(arr.subList(0, arr.size() - 1)) + arr.get(arr.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(7);
        arr2.add(1);
        arr2.add(2);
        arr2.add(5);
        System.out.println(sumAll(arr2));
    }
}
