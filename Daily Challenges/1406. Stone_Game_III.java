package Daily_Challenges;


/*
# Approach
<!-- We define dp as the maximum score difference starting from index i.
So then we add the stones Alice took 1 or 2 or 3.
Then subtract it from the optimal result.
So after dp[n]=0, means no stone left.
If the dp[0] is more than 0 then Alice wins or is 0 then tie otherwise Bob wins.-->

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
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int[] dp=new int[n+1];
        for(int i=n-1;i>=0;i--){
            int take=0;
            dp[i]=Integer.MIN_VALUE;
            for(int k=0;k<3 && i+k<n;k++){
                take+=stoneValue[i+k];
                dp[i]=Math.max(dp[i],take-dp[i+k+1]);
            }
        }
        if(dp[0]>0) return "Alice";
        if(dp[0]<0) return "Bob";
        return "Tie";
    }
}