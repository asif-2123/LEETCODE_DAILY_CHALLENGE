package Daily_Challenges;

/*
# Approach
<!--So first we iterate and check from element 1 if it sequential or not.
If it is we will add it sum. 
We defined sum=nums[0] since its mentioned as sequential prefix.
After iteration we create Set where we add elements,
If the value sum is already present we increment sum by 1,
Then return sum when it's not present in the set.-->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

// This is the answer -->
import java.util.*;
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) sum += nums[i];
            else break;
        }

        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        while (set.contains(sum)) sum++;
        return sum;
    }
}