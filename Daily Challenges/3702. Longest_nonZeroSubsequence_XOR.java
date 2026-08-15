package Daily_Challenges;

/*
# Approach
<!-- We define xor as zero and a nonzero to trac if all the array contains zero.
Iterating through nums and doing xor with all elements.
If any section all n in nums is zero then we directly return 0.
If xor is non zero any part then return full length of nums because all are the sequence.
If its nonzero is true then returns length of nums-1;-->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(1) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean nonzero=false;
        for (int n : nums) {
            xor ^= n;
            if(n!=0){
                nonzero=true;
            }
        }
         if (xor != 0) 
            return nums.length;
        if (nonzero) 
            return nums.length - 1;
        return 0;
    }
}