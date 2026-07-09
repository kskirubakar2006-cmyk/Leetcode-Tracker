// Last updated: 09/07/2026, 15:07:51
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root);
    }

    int helper(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        int a = helper(root.left);
        int b = helper(root.right);

        return sum + a + b;
    }
}
