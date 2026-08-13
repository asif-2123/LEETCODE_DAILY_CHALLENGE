package Daily_Challenges;

/*
# Approach
<!-- -->

# Complexity
- Time complexity:
<!-- O() -->

- Space complexity:
<!-- O() -->

# Code
```java [/
*/

// This is the answer -->
import java.util.*;
import java.util.stream.*;


class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int[] e : invocations) g.get(e[0]).add(e[1]);

        boolean[] bad = new boolean[n];
        dfs(k, g, bad);

        for (int[] e : invocations)
            if (!bad[e[0]] && bad[e[1]])
                return IntStream.range(0, n).boxed().collect(Collectors.toList());

        return IntStream.range(0, n).filter(i -> !bad[i]).boxed().collect(Collectors.toList());
    }

    void dfs(int u, List<List<Integer>> g, boolean[] bad) {
        if (bad[u]) return;
        bad[u] = true;
        for (int v : g.get(u)) dfs(v, g, bad);
    }
    
}