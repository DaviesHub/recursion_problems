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

    public static int sumToIndex(List<Integer> arr, int idx) {
        // This function returns the sum of items in an integer array up to the given index

        if (arr.size() == 1) {
            return arr.get(0);
        }
        return sumToIndex(arr.subList(0, idx), idx-1) + arr.get(idx);
    }

    public static void main(String[] args) {
        // Test case for sumAll function
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(7);
        arr2.add(1);
        arr2.add(2);
        arr2.add(5);
        System.out.println(sumAll(arr2));

        // Test case for sumToIndex function
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(4);
        arr3.add(7);
        arr3.add(1);
        arr3.add(2);
        arr3.add(5);
        arr3.add(11);
        System.out.println(sumToIndex(arr3, 4));
    }
}
