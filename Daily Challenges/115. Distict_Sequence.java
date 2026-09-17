package Daily_Challenges;

/*
# Approach
<!-- We use single array dp[n+1] where inside dp[j] we store the number of sequence of current prefix.
Then we start by initialize the first element with 0.
Then we traverse s charachter by each character.
For each s[i] we update the dp[j].
And to ensure not overwriting we chech if s[i]==t[j-1].
Then return the dp[n].-->

# Complexity
- Time complexity:
<!-- O(n*m) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = n; j >= 1; j--) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return (int) dp[n];
    }
}