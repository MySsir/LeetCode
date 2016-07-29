public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0) {
            root = (root.val > p.val) ? root.left : root.right;
        }
        return root;

        /*
        if (root == null)
            return null;
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        else if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
        */

        /*
        //我的AC解法
        if (root == null)
            return null;
        TreeNode smallOne = null;
        TreeNode bigOne = null;
        if (p.val >= q.val) {
            bigOne = p;
            smallOne = q;
        }
        else {
            bigOne = q;
            smallOne = p;
        }
        if (smallOne.val < root.val) {
            if (root.val < bigOne.val)
                return root;
            else if (root.val == bigOne.val)
                return bigOne;
            else
                return lowestCommonAncestor(root.left, p, q);
        }
        else if (smallOne.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        else
            return smallOne;
        */
    }
}