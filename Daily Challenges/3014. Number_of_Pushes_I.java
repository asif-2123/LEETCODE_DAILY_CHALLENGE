package Daily_Challenges;

/*
# Approach
<!-- For each character we make differnt between 2-9.
So iterate upto end,
and add into pushes according to their pushes from 2-9 first then second as they are placed.-->

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
    public int minimumPushes(String word) {
        int n=word.length();
        int pushes=0;
        for(int i=0;i<n;i++){
            pushes+=(i/8)+1;
        }
        return pushes;
    }
}