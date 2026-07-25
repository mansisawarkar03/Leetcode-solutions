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
    public int kthSmallest(TreeNode root, int k) {

        return inorder(root,k);
        
    }

    public int inorder(TreeNode root, int k)
    {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        
        TreeNode cur=root;
        
        while(true)
        {
            if(cur!=null)
            {
                st.push(cur);
                cur=cur.left;
            }
            else //cur.letf==null
            {
                if(st.isEmpty())
                    break;
                
                cur=st.pop();
                ans.add(cur.val);
                cur=cur.right;
            }
        }
        
        return ans.get(k-1);
        
    }
}