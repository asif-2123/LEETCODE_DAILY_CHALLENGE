package Daily_Challenges;

/*
# Approach
<!-- We made a 2D array.
So we create a fuinction helper with parameter like start and etc.
So as base case we  return the start of array nums when start beomes end.
and return the 2Daraays's start and end when they are not equal to null
then we try with cariable picstart and pickend  and return the max of it.
So by check the helper function if it is more than 0 then return true since player 1 wins
and true also if 0 because its tie.
Return false for if it is less than 0.-->

# Complexity
- Time complexity:
<!-- O(n^2) -->

- Space complexity:
<!-- O(n^2) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        Integer dp[][]=new Integer[n][n];
        return helper(nums,0,n-1,dp)>=0;
    }
    private int helper(int[] nums,int start,int end,Integer[][] dp){
        if(start==end) return nums[start];
        if(dp[start][end]!=null) return dp[start][end];
        int pickstart=nums[start]-helper(nums,start+1,end,dp);
        int pickend=nums[end]-helper(nums,start,end-1,dp);
        return dp[start][end]=Math.max(pickstart,pickend);
    }
}