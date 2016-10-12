package com.liu.leetcode;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    // 双端队列
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        Deque<TreeNode> stack = new LinkedList<TreeNode>();

        stack.push(root);
        int count = 0;

        while (!stack.isEmpty()) {
            int size = stack.size();
            while (size-- > 0) {
                TreeNode cur = stack.pop();
                if (cur.left != null)
                    stack.addLast(cur.left);
                if (cur.right != null)
                    stack.addLast(cur.right);
            }
            count++;
        }
        return count;
    }

    // 递归做法
    public static int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth1(root.left), maxDepth1(root.right));
    }
}
