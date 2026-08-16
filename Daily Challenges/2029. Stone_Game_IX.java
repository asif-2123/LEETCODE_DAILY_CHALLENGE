package Daily_Challenges;

/*
# Approach
<!-- First we make a count arr.
Where we store remainder count.
If the remainder 0 count is divisibe by 2 then,
we check if both the count of 1 & 2 is non-zero then return true because if it is then 
after bob picks it will be divisible by 3 so it will be his loss.
if the count of  0 is non zero then we check the count diff of count 1 and 2,
if its more than 2 then return true.-->

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
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];
        for (int stone : stones) {
            count[stone % 3]++;
        }
        if (count[0] % 2 == 0) 
            return count[1] > 0 && count[2] > 0;

        return Math.abs(count[1] - count[2]) > 2;
    }
}