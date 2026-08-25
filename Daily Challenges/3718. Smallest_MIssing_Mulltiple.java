package Daily_Challenges;

/*
# Approach
<!-- We add all elements which are divisible by k into an hashset.
Then we assign a variable with k.
Then we start a loop bu checking that the set contails the multiple or not.
It checks out that in numerical order.
So if it contains we add k in multiple which means it moves to the next multiple.
Return multiple when it doesn't contain.-->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

//This is the answer -->
import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num % k == 0) set.add(num);
        }

        int multiple = k;
        while (set.contains(multiple)) {
            multiple += k;
        }
        return multiple;
    }
}