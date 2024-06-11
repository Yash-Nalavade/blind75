//Problem - Contains Duplicate

//Approach 1 - Brute force - time limit exceeds 

class Solution {
    public boolean containsDuplicate(int[] nums) {

        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
        {
            if(nums[i]==nums[j])
            return true;
        }
        }
        return false;
    }
}

//HashMap approach - 11ms 

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> mymap = new HashMap<>();


        for(int i=0; i<nums.length; i++)
        {
              

            if(mymap.containsKey(nums[i]))
            return true;
            mymap.put(nums[i],i);
        
        }
        return false;
    }
}


//another hashmap approach - 11ms

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mymap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mymap.put(nums[i], mymap.getOrDefault(nums[i], 0) + 1);

            if (mymap.get(nums[i]) > 1) {
                return true;
            }
        }
        return false;
    }
}


// Another Hashmap approach - 9 ms 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer i : nums){
            if(set.contains(i))
                return true;
            else
                set.add(i);
        }
        return false;
        
    }
}