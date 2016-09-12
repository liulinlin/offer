package com.liu.offer.Meituan;

/**
 * Created by Administrator on 2016/9/10.
 */
public class Main1 {
    public static void main(String[] args) {

    }
    // 构建树 传入数组
    public static BinaryTreeNode createTree(final int data []){
        int start = data.length/2;
        BinaryTreeNode root = new BinaryTreeNode();
        root.data = data[start];
        root.leftNode = createTree(data,root,0,start-1);
        root.rightNode = createTree(data,root,start+1,data.length-1);
        return  root;
    }
    // 构建树 传入数组
    public static BinaryTreeNode createTree(final int data [],BinaryTreeNode root,int start,int end){
        int mid = (end-start+1)/2;
        BinaryTreeNode node = new BinaryTreeNode();
        node.data = data[mid];
        node.leftNode = createTree(data,node,start,mid-1);
        node.rightNode = createTree(data,node,mid+1,end);
        return  node;
    }

    // 删除指定节点 ，并且 打印
    public static void  midDeleteAndPrintTree(){

    }

    public  static void midPrintTree(BinaryTreeNode root){
        midPrintTree(root.leftNode);
        if (root != null)
            System.out.print(root.data+" ");
        midPrintTree(root.rightNode);
    }

    static class BinaryTreeNode {
        public int data;
        public BinaryTreeNode leftNode;
        public BinaryTreeNode rightNode;
    }
}
