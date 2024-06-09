// Approach 1 brute Force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++)
        {
        for(int j = i+1; j<nums.length; j++)
            {
            if(nums[i]+nums[j]==target)
            return new int[] {i,j}; }
        
    }
    return nums;
    } 
    }


//Approach 2 - Brute force - by comparing compliments 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++)
        {
        for(int j = i+1; j<nums.length; j++)
            {
            int comp = target - nums[i];
            if(comp == nums[j])
            return new int[] {i,j}; }
        
    }
    return nums;
    } 
    }



//Approach 3- Hash Map

import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> keyvalmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (keyvalmap.containsKey(complement)) {
                return new int[] { keyvalmap.get(complement), i };
            }
            keyvalmap.put(nums[i], i);
        }
        return null;
    }
}