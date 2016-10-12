package com.liu.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author liulinlin1 on 2016/9/26.
 */
public class SumOfLeftLeaves {
    public static void main(String[] args) {

    }

    // 层遍历法
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> data = new ArrayDeque<>();
        data.add(root);
        int sum = 0;
        while (!data.isEmpty()) {
            TreeNode node = data.poll();
            if (node != null && node.left != null && node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            }
            if (node.left != null) {
                data.add(node.left);
            }
            if (node.right != null) {
                data.add(node.right);
            }
        }
        return sum;
    }

    // 遍历结束的点不是 叶子节点，而是 叶子节点的父节点
    public static int sumOfLeftLeaves1(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        int l = (root.left != null && root.left.left == null && root.left.right == null) ? root.left.val : sumOfLeftLeaves1(root.left);
        return l + sumOfLeftLeaves1(root.right);
    }
}
