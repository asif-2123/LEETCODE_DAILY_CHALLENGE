package Daily_Challenges;

/*
# Approach
<!-- We make two different List to store elements easily.
Then, we add the first to the arr1 and the secont to the arr2 of the nums array.
Then we compare there last elements of each array and we go on adding it to the list as said.
Then combine two list into an array and return the array. -->

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
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]); arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1))    arr1.add(nums[i]);
            else    arr2.add(nums[i]);
        }

        int[] result = new int[arr1.size() + arr2.size()];
        int idx = 0;
        for (int n : arr1) result[idx++] = n;
        for (int n : arr2) result[idx++] = n;

        return result;
    }
}