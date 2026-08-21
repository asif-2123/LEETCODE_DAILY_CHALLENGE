package Daily_Challenges;

/*
# Approach
<!-- We do a gcd of the two number. Then we start a binary searching.
Then for every mid we count how many number is divisble by c.
To avoid duplication we exclude. 
If the number is even we subtract mid/lcm and for odd we add mid/lcm.
Then we stored and checks the binary serch condition of count(mid)>= mid.
Then check about the answer and return it. -->

# Complexity
- Time complexity:
<!-- O(2^n * n * log m)     m-> coins[k]*k -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public long findKthSmallest(int[] coins, int k) {
        long l = 1, r = (long) coins[0] * k;
        while (l < r) {
            long m = (l + r) / 2;
            long cnt = 0;
            for (int mask = 1; mask < (1 << coins.length); mask++) {
                long lcm = 1;
                int bits = 0;
                for (int i = 0; i < coins.length; i++) {
                    if ((mask & (1 << i)) != 0) {
                        bits++;
                        long g = gcd(lcm, coins[i]);
                        if (lcm / g > m / coins[i]) {
                            lcm = m + 1;
                            break;
                        }
                        lcm = lcm / g * coins[i];
                    }
                }
                if (lcm <= m)
                    cnt += (bits % 2 == 1 ? 1 : -1) * (m / lcm);
            }
            if (cnt >= k)   r = m;
            else    l = m + 1;
        }
        return l;
    }
}