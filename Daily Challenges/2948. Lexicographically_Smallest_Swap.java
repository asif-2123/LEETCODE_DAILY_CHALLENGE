package Daily_Challenges;

/*
# Approach
<!-- We create pair of arrays to track original positions and sort it.
Then we iterate it to find if it is of same group and if it's not then start a new group.
Then we collect indexes and itl's values and sort it and put back into the sorted indexes.
Then return it.-->

# Complexity
- Time complexity:
<!-- O(n*log n) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

// This is the answer -->

import java.util.*;
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> groups = new ArrayList<>();
        groups.add(new ArrayList<>());
        groups.get(0).add(arr[0][1]);

        for (int i = 1; i < n; i++) {
            if (arr[i][0] - arr[i - 1][0] <= limit) {
                groups.get(groups.size() - 1).add(arr[i][1]);
            } else {
                groups.add(new ArrayList<>());
                groups.get(groups.size() - 1).add(arr[i][1]);
            }
        }

        for (List<Integer> g : groups) {
            Collections.sort(g);
            List<Integer> vals = new ArrayList<>();
            for (int idx : g) vals.add(nums[idx]);
            Collections.sort(vals);
            for (int i = 0; i < g.size(); i++) nums[g.get(i)] = vals.get(i);
        }

        return nums;
    }
}