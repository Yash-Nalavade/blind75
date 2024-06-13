//Longest Substring Without Repeating Characters - Best Solution - imp is indexof() function - 2ms time

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxlen = 0, left =0,right;

        for(right =0; right<s.length(); right++)
        {
          int indexoffirstseen = s.indexOf(s.charAt(right),left);
          if(indexoffirstseen != right)
          {
            left = indexoffirstseen +1;
          }
          maxlen = Math.max(maxlen, right - left +1);
        }
        return maxlen;
    }
}




// Also can use sliding window algorithm
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
Map<Character, Integer> charset = new HashMap<>();

int maxlen = 0;

for (int left =0,right = 0; right<s.length(); right++)
{
 if(charset.containsKey(s.charAt(right)) 
  && charset.get(s.charAt(right)) >= left)
   {
    left = charset.get(s.charAt(right))+1;
    }

 maxlen = Math.max(maxlen , right - left+1);
 charset.put(s.charAt(right), right);
}
return maxlen;
}

}











