package Daily_Challenges;

/*
# Approach
<!-- Taking twoi different variables as depth just checking the normal depth,
and one as max depth who will check the max nesting in the string.
Then we traverse through the string and strore every character as as char array.
Then check for the '(' character if it is present we simply increase the depth,
and we calculate the max depth by comparing between depth and maxDepth.
If ')' char comes we decrease depth to maintain the loop if that it completes. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(1) -->

# Code
```java 
*/

// This is the answer -->

class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (ch == ')') {
                depth--;
            }
        }
        return maxDepth;
    }
}
