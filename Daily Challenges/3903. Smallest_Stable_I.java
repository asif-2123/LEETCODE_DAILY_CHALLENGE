package Daily_Challenges;

/*
# Approach
<!-- First we traverse nums from back, and in every step we find minimum and store it in suffixmin
We initialise a prefixMax to find the maximum element. 
Then we traverse from front and find the maximum element
and check the diff of max and min element is less than or equal to the given K,
if it is then we return the index of the element.
If we didn't fint such element we just return -1.-->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

//This is the answer -->

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }
        int prefixMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, nums[i]);
            if (prefixMax - suffixMin[i] <= k) return i;
        }

        return -1;
    }
}