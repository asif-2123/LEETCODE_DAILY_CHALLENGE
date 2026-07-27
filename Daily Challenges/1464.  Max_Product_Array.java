package Daily_Challenges;

/*
# Approach
<!-- SO we initialise two variable naming max1 and max2 to store the two largest number in array.
Then traverse and see the max numbers.
Check it with max1 value if it's larger than max1,
then assign the max1 value in max2 and the digit in max1 and go on.
Then if the max1 is not large but max2 is, then assign max2 the value in the number.
And return the product of max1-1 and max2-1. -->

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
    public int maxProduct(int[] nums) {
        int max1=0,max2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
                max2=nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}