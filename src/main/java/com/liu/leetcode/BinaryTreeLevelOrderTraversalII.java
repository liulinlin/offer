package com.liu.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 *
 * @author liulinlin1
 * @since：2016/10/12
 */
public class BinaryTreeLevelOrderTraversalII {
    /*
    我的解法，比较慢
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List<TreeNode> temp = new ArrayList<>();
        temp.add(root);
        while (temp.size() > 0) {
            List<Integer> add = new ArrayList<>();
            temp.forEach(i -> {
                add.add(i.val);
            });
            if (add.size() > 0) result.add(0, add);
            List<TreeNode> t = new ArrayList<>();
            temp.forEach(i -> {
                if (i.left != null) t.add(i.left);
                if (i.right != null) t.add(i.right);
            });
            temp = t;
        }
        return result;
    }

    /*
    大神解法：DFS
     */
    public static List<List<Integer>> levelOrderBottom1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if (root == null) return wrapList;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            // 这里的处理思想是 一个队列的前levelNum 是上一层的 后来添加的是下一层的。遍历levelNum个就可以了。
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(0, subList);
        }
        return wrapList;
    }

    public static List<List<Integer>> levelOrderBottom3(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }

    /*
    大神解法：BFS
     */
    public static void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) return;
        if (level >= list.size()) {
            list.add(0, new LinkedList<Integer>());
        }
        levelMaker(list, root.left, level + 1);
        levelMaker(list, root.right, level + 1);
        list.get(list.size() - level - 1).add(root.val);
    }
}
