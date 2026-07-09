// Last updated: 09/07/2026, 15:09:11

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q== null) return true;
        if(p==null || q == null || q.val != p.val) return false;
        boolean l = isSameTree (q.left,p.left);
        boolean r = isSameTree(q.right,p.right);
        return l&r;
        
    }
}