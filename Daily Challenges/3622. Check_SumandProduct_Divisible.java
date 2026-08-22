package Daily_Challenges;

/*
# Approach
<!-- Initialising variable as sum and product to calculate.
Then we get into a loop where the digit of the given n doesn't become zero.
In this we take out the final digit and we add in sum and multiply in product.
Then in divisior we add the sum and product of the digits.
Then return if the given n is completely divisible by divisor or not. -->

# Complexity
- Time complexity:
<!-- O(log n) -->

- Space complexity:
<!-- O(1) -->

# Code
```java [/
*/

//This is the answer -->

class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0, product = 1;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        int divisor = sum + product;
        return n % divisor == 0;
    }
}