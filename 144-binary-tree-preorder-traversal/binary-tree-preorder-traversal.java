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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode> st=new Stack<>();
        List<Integer> arr=new ArrayList<>();
        if(root==null)
            return arr;
        TreeNode node=root;
        st.push(node);

        while(!st.isEmpty())
        {
            node=st.pop();
            arr.add(node.val);

            if(node.right!=null)
                st.push(node.right);
            
            if(node.left!=null)
                st.push(node.left);
        }
        return arr;
        
        
    }

    
}