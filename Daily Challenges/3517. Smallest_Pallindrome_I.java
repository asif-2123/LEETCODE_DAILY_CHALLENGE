package Daily_Challenges;

/*
# Approach
<!-- So first we count the frequency of an array.
Then store it in half and if odd frequency we store as middle.
Then construct a string firsthalf with half and seconfhalf with reverse of half.
Then return the result by concatanating firsthalf, middle and secondhalf.-->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder half=new StringBuilder();
        char middle=0;

        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
                middle=(char)(i+'a');
            }
            for(int j=0;j<freq[i]/2;j++){
                half.append((char)(i+'a'));
            }
        }
        String firsthalf=half.toString();
        String secondhalf=half.reverse().toString();

        return middle==0? firsthalf+secondhalf:firsthalf+middle+secondhalf;
    }
}