package Daily_Challenges;

/*
# Approach
<!--  First we sort the array.
So we initialise two pointers.
On start with the zero'th element and the first element.
Bothe go one step ahead. When the gap between next element and current element more than on 1.
Then we add the numbers missing upto next after the current element.-->

# Complexity
- Time complexity:
<!-- O(n*log n) -->

- Space complexity:
<!-- O(1) -->

# Code
```java [/
*/

//This is the answer -->

import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> missing=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int current=nums[i];
            int next=nums[i+1];
            if(next>current+1){
                for(int j=current+1;j<next;j++){
                    missing.add(j);
                }
            }
        }
        return missing;
    }
}
