public class AddNums {

    public static int addNums(int n) {
        // This function returns the sum of numbers up to n recursively

        if (n == 1) {
            return 1;
        }
        return addNums(n-1) + n;
    }

    public static void main(String[] args) {
        int sum = addNums(10);
        System.out.println("The sum of the numbers is " + sum);
    }
}
