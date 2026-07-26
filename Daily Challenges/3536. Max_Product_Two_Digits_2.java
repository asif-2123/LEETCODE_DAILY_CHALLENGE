package Daily_Challenges;

/*
# Approach
<!-- We create an Priority Queue in descending order.
We traverse the digits where we add the last digits in priority queue.
After that we remove the first two digits which are the largest and return their product. -->

# Complexity
- Time complexity:
<!-- O(d*log d) -->

- Space complexity:
<!-- O(d) -->

# Code
```java [/
*/

//This is the answer -->

import java.util.*;
class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(n>0){
            int d=n%10;
            pq.add(d);
            n/=10;
        }
        int first=pq.poll();
        int second=pq.poll();
        return first*second;
    }
}