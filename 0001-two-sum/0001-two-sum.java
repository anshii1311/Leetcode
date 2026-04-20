import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (numMap.containsKey(complement)) {
                // If found, return the indices of the complement and the current number
                return new int[] { numMap.get(complement), i };
            }

            // If the complement is not found, add the current number and its index to the HashMap
            numMap.put(nums[i], i);
        }

        // This line should ideally not be reached as the problem guarantees exactly one solution
        return new int[] {}; 
    }
}