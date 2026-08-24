package Daily_Challenges;

/*
# Approach
<!-- Assigning a new array prefix to store the stones sum upto which someone took.
Then we put the sum valuein the first of an array.
If the array is less than two then the last to will be given to teh one whose turn is this.
And in dp we store the difference and return it.-->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;

        // Build prefix sums
        int[] prefix = new int[n];
        prefix[0] = stones[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + stones[i];
        }

        // Base case:
        // When two stones are left, current player takes both.
        int dp = prefix[n - 1];

        // Work backwards
        for (int i = n - 3; i >= 0; i--) {
            dp = Math.max(dp, prefix[i + 1] - dp);
        }

        return dp;
    }
}