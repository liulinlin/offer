package com.liu.SwordOffer;

import com.liu.SwordOffer.utils.BinaryTreeNode;

/**
 * Created by liulinlin on 2017/3/13.
 */
public class DepthOfTree {

    public int getDepth(BinaryTreeNode root) {
        if (root != null) {
            int l = getDepth(root.leftNode);
            int r = getDepth(root.rightNode);
            return 1 + (l > r ? l : r);
        }
        return 0;
    }

    private int max = 0;

    public void getDepth(BinaryTreeNode root, int level) {
        if (root != null) {
            if (max < level) max = level;
            getDepth(root.leftNode, level++);
            getDepth(root.rightNode, level++);
        }
    }

}
