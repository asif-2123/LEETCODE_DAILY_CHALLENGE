package Daily_Challenges;

/*
# Approach
<!-- We start an loop with n to infinite.
Initialise product as 1 and temp as i.
Then start a loop inside which will work till temp has digits.
Then inside it we check product and after that if it divisible by t,
then we return i (the number).-->

# Complexity
- Time complexity:
<!-- O(k*log n) -->

- Space complexity:
<!-- O(1) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; ;i++){
            int prod=1;
            int temp=i;
            while(temp>0){
                prod*=temp%10;
                temp/=10;
            }
            if(prod%t==0) return i;
        }
    }
}