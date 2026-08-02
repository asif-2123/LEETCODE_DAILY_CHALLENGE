package Daily_Challenges;

/*
# Approach
<!-- We sort the array, and add the frequency.
Initialises pos as 0, 
Then we start the frequency from the end.
Add it in the push by multiplying their positioned value with their no. of push. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(1) -->

# Code
```java [/
*/

// This is the answer -->

import java.util.*;
class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];

        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int pushes=0; int pos=0;

        for(int i=25;i>=0;i--){
            if(freq[i]==0) break;
            pushes+=freq[i]*((pos/8)+1);
            pos++;
        }
        return pushes;
    }
}