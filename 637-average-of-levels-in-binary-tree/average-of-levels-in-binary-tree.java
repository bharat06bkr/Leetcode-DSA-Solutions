/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>k=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            double sum=0.0;
            double c=0.0;
            for(int i=0;i<size;i++){
                 TreeNode curr=q.poll();
                 sum+=curr.val;
                 if(curr.left!=null)
                 q.add(curr.left);
                 if(curr.right!=null)
                 q.add(curr.right);
                 c+=1;
            }
            sum=sum/(c);
            k.add(sum);

        }
        return k;
    }
}