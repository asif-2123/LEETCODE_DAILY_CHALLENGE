package Daily_Challenges;

/*
# Approach
<!-- Storing the key, value pair from knowledge to a HashMap.
Then we traverse the string and check if the character '(' comes,
if not we directly appened in ans.
If found then we extract untill ')' comes.
Then check it on the map if present.
If present then we appened the value otherwise we appened '?'.
Then return the ans as string. -->

# Complexity
- Time complexity:
<!-- O(n+k) -->

- Space complexity:
<!-- O(n+k) -->

# Code
```java [/
*/

// This is the answer -->

import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        StringBuilder ans = new StringBuilder();
        int i=0;
        while (i < s.length()) {

            if (s.charAt(i) != '(') {
                ans.append(s.charAt(i));
                i++;
            } else {
                i++; 
                StringBuilder key = new StringBuilder();
                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }
                ans.append(map.getOrDefault(key.toString(), "?"));
                i++; 
            }
        }
        return ans.toString();
    }
}