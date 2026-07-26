package Daily_Challenges;

/*
# Approach
<!-- Firstly we sort the araay.
Make two variables max1 and max2.
In max1 we get the product of the largest number.
In max2 we store the product of the first two numbers and the last numbers, 
its done because of probability of the two negative number which is abstarctly largest,
but is in the first after sorting so multiplying it with another largest positive number from last.
And later return the max of max1 and max2.
(Even if there is three or more negative it will check by that way vice versa.)-->

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
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max1=nums[n-1]*nums[n-2]*nums[n-3];
        int max2=nums[0]*nums[1]*nums[n-1];

        return Math.max(max1,max2);
    }
}
