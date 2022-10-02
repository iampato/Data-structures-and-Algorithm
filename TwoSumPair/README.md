# Two sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

Example 2:
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

Example 3:
```
Input: nums = [3,3], target = 6
Output: [0,1]
```

Constraints:

```
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
```

# Solution
## 1 Iteration
item complexity -> O(n2)

space complexity -> O(n)

time(leetcode) -> 138 ms

space(leetcode) -> 45MB

```java
class Main {
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
}
```

## 1 Hashmaps
item complexity -> O(nlog(n))

space complexity -> O(n)

time(leetcode) -> 8 ms

space(leetcode) -> 45.8 MB

```java
class Main {
    public static int[] twoSum(int[] nums, int target) {
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
}
```