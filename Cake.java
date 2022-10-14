public class Cake {
    /* Do you want to cut a cake into a number of slices for your friends at a birthday party?
       This class holds a simulation to this activity using recursion
     */

     public static int sliceCake(int numFriends, int numSlices) {
        if (numSlices >= numFriends) {
            return numSlices;
        }
        numSlices *= 2;

        return sliceCake(numFriends, numSlices);
    }

    public static void main(String[] args) {
        int cakeSlices = sliceCake(13, 1);
        System.out.println(cakeSlices + " slices of cake.");
    }
}
