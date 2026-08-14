package Daily_Challenges;

/*
# Approach
<!-- So we chreate HashMap to store the frequency.
Then iterate though nums. ANd start to add teh nums with values or freq.
If the frq pass the given k we add value and decrease the value.
And each step check the maxlen and at last return.-->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(1) -->

# Code
```java [/
*/

// This is the answer -->
import java.util.*;
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            while (freq.get(nums[right]) > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}