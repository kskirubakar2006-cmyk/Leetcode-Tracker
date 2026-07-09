// Last updated: 09/07/2026, 15:08:12

class Solution {
    public int countNodes(TreeNode root) {
        if(root ==null) return 0;
        int a = countNodes (root.left);
        int b = countNodes (root.right);
        return a+b+1;
        
    }
}