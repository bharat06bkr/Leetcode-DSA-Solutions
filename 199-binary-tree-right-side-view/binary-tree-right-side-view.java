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
class Solution 
{
    List<Integer> result=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) 
    {
        if(root==null)  return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        result.add(root.val);
        while(!q.isEmpty())
        {
            int n=q.size();
            boolean b=true;
            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.poll();
                if(curr.right!=null)
                    q.add(curr.right);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null && b)
                {
                    result.add(curr.right.val);
                    b=false;
                }
                else if(curr.left!=null && b)
                {
                    result.add(curr.left.val);
                    b=false;
                }
            }
        }
        return result;
    }
}