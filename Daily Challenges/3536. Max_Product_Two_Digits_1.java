package Daily_Challenges;
/*
# Approach
<!-- SO we initialise two variable naming max1 and max2 to store the two largest digit.
Then traverse and see the last digit.
Check it with max1 value if it's larger than max1,
then assign the max1 value in max2 and the digit in max1 and go on.
Then if the max1 is not large but max2 is, then assign max2 the value ofdigit.
And return the product of max1 and max2. -->

# Complexity
- Time complexity:
<!-- O(d) -->

- Space complexity:
<!-- O(1) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public int maxProduct(int n) {
        int max1=0,max2=0;
        while(n>0){
            int d=n%10;
            if(d>max1){
                max2=max1;
                max1=d;
            }else if(d>max2){
                max2=d;
            }
            n/=10;
        }
        return max1*max2;
    }
}