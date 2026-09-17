package Daily_Challenges;

/*
# Approach
<!-- We simply start by traversing the array.
Then taking an element i giving making it the first element, continue only if it is 0.
Then check a nested loop j to give second digit and again if same as i continue.
Then for third digit again same and check if it is same as i and j then continue.
Also check if the k is even or odd.
Then add them into the set and return it's size.-->

# Complexity
- Time complexity:
<!-- O(n^3) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

// This is the answer -->

import java.util.*;
class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> map=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(k==i || k==j) continue;
                    if(digits[k]%2!=0) continue;

                    int num=digits[i]*100+digits[j]*10+digits[k];
                    map.add(num);
                }
            }
        }
        return map.size();
    }
}