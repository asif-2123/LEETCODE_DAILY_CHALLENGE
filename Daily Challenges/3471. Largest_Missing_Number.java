package Daily_Challenges;

/*
# Approach
<!-- After creating a HashMap we iterate through the array with the length given.
Then in Set we store the subarrays element, we use set just not for copy number in a subarray
After creating set we iterate inside it put num and its value count in subarrays.
Then we iterate throught the count map and check if any value is 1.
Then check the which is the maximum with 1 value count.
Then return it.-->

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
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> count=new HashMap<>();
        int n = nums.length;

        for (int i = 0; i <= n - k; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                seen.add(nums[j]);
            }
            for (int num : seen) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
        }
        int ans = -1;
        for (int num : count.keySet()) {
            if (count.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }
        return ans;
    
    }
}