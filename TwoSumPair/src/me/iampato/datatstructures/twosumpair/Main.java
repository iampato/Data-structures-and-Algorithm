package me.iampato.datatstructures.twosumpair;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    // O(n2)
    // bad time complexity
    public static int[] twoSum(int[] nums, int target) {
        int[] pairs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && (nums[i] + nums[j]) == target) {
                    pairs[0] = j;
                    pairs[1] = i;
                }
            }
        }
        return pairs;
    }

    // O(n)
    // linear time complexity
    public static int[] twoSum2(int[] nums, int target) {
        var pairs = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(nums[i])) {
                return new int[]{pairs.get(nums[i]), i};
            } else {
                pairs.put(target - nums[i], i);
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int[] res = twoSum2(input, 9);
        System.out.println(Arrays.toString(res));
    }
}
