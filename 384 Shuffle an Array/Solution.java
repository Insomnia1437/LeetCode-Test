import java.util.Random;

/**
 Shuffle a set of numbers without duplicates.

 Example:

 // Init an array with set 1, 2, and 3.
 int[] nums = {1,2,3};
 Solution solution = new Solution(nums);

 // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 solution.shuffle();

 // Resets the array back to its original configuration [1,2,3].
 solution.reset();

 // Returns the random shuffling of array [1,2,3].
 solution.shuffle();
 */
public class Solution {
    private int current[];
    Random random = new Random();
    public Solution(int[] nums) {
        this.current = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return current;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int rand[] = new int[current.length];
        int ran;
        for (int i = 0; i < current.length ; i++) {
            ran = random.nextInt(i+1);
            rand[i] = rand[ran];
            rand[ran] = current[i];
        }
        return rand;

    }


    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        Solution solution = new Solution(a);
        System.out.println(solution.shuffle()[0]);
        System.out.println(solution.reset()[0]);
    }
}
