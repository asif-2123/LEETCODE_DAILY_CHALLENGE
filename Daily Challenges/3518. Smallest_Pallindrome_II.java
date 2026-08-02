package Daily_Challenges;

/*
# Approach
<!-- So first we count the frequency of an array.
Then split the frequencies in half.
Compute the number of distinct palindrome arrangements possible using countWays.
Then iteratively build the left half of pallindrome.
Then return the result by concatanating left, middle and reverse of left.-->

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
    static final long LIMIT = 1_000_001L;
    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        int[] half = new int[26];
        int halfLen = 0;
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            halfLen += half[i];
            if ((freq[i] & 1) == 1)
                mid = (char) ('a' + i);
        }

        if (countWays(half, halfLen) < k)
            return "";
        StringBuilder left = new StringBuilder();

        while (halfLen > 0) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0)
                    continue;
                half[c]--;
                long ways = countWays(half, halfLen - 1);
                if (ways >= k) {
                    left.append((char) ('a' + c));
                    halfLen--;
                    break;
                }
                k -= ways;
                half[c]++;
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(left);
        if (mid != 0)
            ans.append(mid);
        ans.append(new StringBuilder(left).reverse());
        return ans.toString();
    }
    private long countWays(int[] cnt, int total) {
        long res = 1;
        int rem = total;
        for (int i = 0; i < 26; i++) {
            int c = cnt[i];
            if (c == 0)
                continue;
            res *= comb(rem, c);
            if (res >= LIMIT)
                return LIMIT;
            rem -= c;
        }
        return res;
    }
    private long comb(int n, int r) {
        if (r > n)
            return 0;
        r = Math.min(r, n - r);
        long ans = 1;
        for (int i = 1; i <= r; i++) {
            ans = ans * (n - r + i) / i;
            if (ans >= LIMIT)
                return LIMIT;
        }
        return ans;
    }
}