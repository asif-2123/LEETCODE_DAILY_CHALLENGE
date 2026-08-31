package Daily_Challenges;

/*
# Approach
<!-- So we initialise local minima and maxima. Then start to traverse the LinkedList
and find then we defien and get the first minimum and last minimum by comparing the curr 
curr.next , prev and its next and update the last critical as index..
Then find the minimum distance which is the smallest gap between the consecutive critical point
and the maximum distance which is the distance between the first and last critical pont.
Then return it as new array [mindist,maxdist]-->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(1) -->

# Code
```java [/
*/
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

// This is the answer -->

class Solution {
    public int[] ListnodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return new int[]{-1, -1};

        int index = 1;
        int first = -1, prev = head.val;
        int minDist = Integer.MAX_VALUE, lastCritical = -1;
        ListNode curr = head.next;

        while (curr.next != null) {
            int nextVal = curr.next.val;
            if ((curr.val > prev && curr.val > nextVal) || 
                (curr.val < prev && curr.val < nextVal)) {
                if (first == -1) first = index;
                if (lastCritical != -1) minDist = Math.min(minDist, index - lastCritical);
                lastCritical = index;
            }
            prev = curr.val;
            curr = curr.next;
            index++;
        }

        if (lastCritical == first) return new int[]{-1, -1};
        return new int[]{minDist, lastCritical - first};
    }
}