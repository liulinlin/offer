package com.liu.leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * @author liulinlin1 on 2016/9/26.
 */
public class InvertBinaryTree {

    //后序遍历 解决方法
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = null, right = null;
        if (root.left != null) {
            left = invertTree(root.left);
        }
        if (root.right != null) {
            right = invertTree(root.right);
        }
        root.left = right;
        root.right = left;
        return root;
    }

    // 先序遍历解决方案
    public TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree1(root.left);
        invertTree1(root.right);

        return root;
    }
}
