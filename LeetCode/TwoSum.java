package leetCode.easy;

import java.util.HashMap;

/**
 * Created by Ahmad Eldefrawy.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] input = {11, 7, 15, 2};
        int[] ouput = twoSum(input, 9);

        System.out.println(ouput[0]);
        System.out.println(ouput[1]);
    }

    // SOLUTION
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> arrayHS = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (arrayHS.containsKey(target - nums[i])) {
                output[0] = arrayHS.get(target - nums[i]);
                output[1] = i;
            }
            arrayHS.put(nums[i], i);
        }
        return output;
    }
}
