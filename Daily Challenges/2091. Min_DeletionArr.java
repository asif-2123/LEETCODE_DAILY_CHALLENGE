package Daily_Challenges;

/*
# Approach
<!-- We have taken two minIndex and maxIndex variable to store the the maximum element
and minimum element indexes after checking while traversing through the array.
Then if the maxIndex is before the minIndex then we swap it for easy calculation.
Then we checks the deletion process which are of three types -
From FRONT so we go to the maxIndex and delete so the deletion is of maxIndex's index+1
Then BACK where we delete upto minIndex from back so it's the total length of array-minIndex's index,
Then middle where we we delete from both sides so we delete upto the minIndex from front 
which is minIndex+1 deletion and upto maxIndex from back which is array length-maxIndex deletion
Then we compare them and return which is minimum among them. -->

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
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0, maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIndex]) minIndex = i;
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }

        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        int front = maxIndex + 1;
        int back = n - minIndex;
        int mixed = (minIndex + 1) + (n - maxIndex);

        return Math.min(front, Math.min(back, mixed));
    }
}