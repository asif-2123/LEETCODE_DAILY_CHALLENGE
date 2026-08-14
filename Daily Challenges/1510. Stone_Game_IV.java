package Daily_Challenges;

/*
# Approach
<!-- Let dp[i] be true if the curr player win with i stone left.
Then check every possible k*k <=i number from i to 1,
Then if opponent loses dp[i] is assigned as true.
Then return dp[n]-->

# Complexity
- Time complexity:
<!-- O(n^3/2) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k * k <= i; k++) {
                if (!dp[i - k * k]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
    

