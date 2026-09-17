package Daily_Challenges;

/*
# Approach
<!-- We check if the given n is larger than 999, so we can get 1 comma.
Then check with the largest number to get 2 commas to check if it is within it and calculate comma.
Like this we do same for more the 6 digits and store comma and all.-->

# Complexity
- Time complexity:
<!-- O(1) -->

- Space complexity:
<!-- O(1) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public int countCommas(int n) {
        int commas = 0;

        if (n > 999) {
            commas += Math.min(n, 999999) - 999;
        }
        if (n > 999999) {
            commas += 2 * (Math.min(n, 999999999) - 999999);
        }
        if (n > 999999999) {
            commas += 3 * (n - 999999999);
        }

        return commas;
    }
}