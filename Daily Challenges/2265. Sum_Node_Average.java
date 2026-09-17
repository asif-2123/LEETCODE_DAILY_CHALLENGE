package Daily_Challenges;

/*
# Approach
<!-- We made int array function to calculate average and return.
Where we traverse left and right to store their node.
Then we use their node calculate sum and count of nodes present.
Then check if their average is same as the node's value.
If it is then we increase ans count.
And return anarray which gives sum , count. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(h) -->

# Code
```java [/
*/

// Definition for a binary tree node. public class TreeNode {
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

 // This is the answer ->

class Solution {
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }
    public int[] dfs(TreeNode node){
        if(node==null) return new int[]{0,0};

        int[] left=dfs(node.left);
        int[] right=dfs(node.right);

        int sum=left[0]+right[0]+node.val;
        int count=left[1]+right[1]+1;
        if(sum/count==node.val) ans++;
        return new int[]{sum,count};

    }
}