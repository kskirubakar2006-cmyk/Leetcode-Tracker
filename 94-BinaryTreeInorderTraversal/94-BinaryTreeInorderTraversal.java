// Last updated: 09/07/2026, 15:09:13
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    void helper(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;
        helper(root.left, ans);
        ans.add(root.val);
        helper(root.right, ans);

    }
}