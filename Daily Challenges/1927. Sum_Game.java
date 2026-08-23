package Daily_Challenges;

/*
# Approach
<!-- So we made variables to calculate sum and ? for both sides.
Then we iterate of the string and calculate the sum and the no. of ?.
Then if the no. of ? is odd then Alice always win,
because he have an extra chance to disturb the sum.
Then  we calculate differance and 
check by formulating if the twice of diff is same of the diff multiply of 9
because Bob has a chance of forced changes and if its equal Bob wins so returns false.
If not equal then Alice wins so it returns true.-->

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
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') leftQ++;
            else leftSum += num.charAt(i) - '0';
        }
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') rightQ++;
            else rightSum += num.charAt(i) - '0';
        }
        if ((leftQ + rightQ) % 2 == 1) return true;
        int diff = leftSum - rightSum;

        return diff * 2 != 9 * (rightQ - leftQ);
    }
}