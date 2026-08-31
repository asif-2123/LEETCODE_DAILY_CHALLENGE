package Daily_Challenges;

/*
# Approach
<!-- -->

# Complexity
- Time complexity:
<!-- O(n^2) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int[] ones = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones[count++] = i;
            }
        }
        if (count < k) {
            return "";
        }
        String ans = "";
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < count; i++) {
            int start = ones[i];
            int end = ones[i + k - 1];
            int len = end - start + 1;
            String candidate = s.substring(start, end + 1);

            if (len < minLen) {
                minLen = len;
                ans = candidate;
            } 
            else if (len == minLen && candidate.compareTo(ans) < 0) {
                ans = candidate;
            }
        }
        return ans;
    }
}