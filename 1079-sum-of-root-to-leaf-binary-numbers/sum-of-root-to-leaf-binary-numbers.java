// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution 
// {
//     int sum=0;
//     public int sumRootToLeaf(TreeNode root) 
//     {
//         ftol(root,new ArrayList<>());
//         return sum;
//     }
//     private void ftol(TreeNode root,List<Integer> l)
//     {
//         if(root==null)  return ;
//         l.add(root.val);
//         if(root.left==null && root.right==null)
//         {
//             int val=find(l);
//             sum=sum+Integer.parseInt(String.valueOf(val),2);
//         }
//         ftol(root.left,l);
//         ftol(root.right,l);
//         l.remove(l.size()-1);
//     }
//     private int find(List<Integer> l)
//     {
//         int val=0;
//         for(int i=0;i<l.size();i++)
//             val=val*10+l.get(i);
//         return val;
//     }     55/63 failde due to large number of binarynumbers learn hard 
// }


class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int val) {
        if (node == null) return 0;
        val = (val << 1) | node.val; // Shift left and add current node value
        if (node.left == null && node.right == null) {
            return val; // Leaf node, return value
        }
        return dfs(node.left, val) + dfs(node.right, val); // Recur left and right
    }
}
