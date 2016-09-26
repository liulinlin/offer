package com.liu.leetcode;

/**
 * @author liulinlin1 on 2016/9/26.
 *         <p>
 *         Given two binary trees, write a function to check if they are equal or not.
 *         <p>
 *         Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) return false;
        if (p == null && q == null) return true;
        if (p.val != q.val) return false;
        if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
            return true;
        else
            return false;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
