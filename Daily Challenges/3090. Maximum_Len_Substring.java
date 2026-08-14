package Daily_Challenges;

/*
# Approach
<!--We make a freq array to store count.
Then iterate through string ang count freq with max len.
If some letters freq increases than 2 then we move window and diminishes it.
Then calculate maxlen and return.-->

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
    public int maximumLengthSubstring(String s) {
        int left=0, maxlen=0;
        int[] freq=new int[26];

        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'a']++;

            while(freq[s.charAt(right)-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
