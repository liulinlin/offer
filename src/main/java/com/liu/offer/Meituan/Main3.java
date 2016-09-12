package com.liu.offer.Meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Main3 {
    private static Queue<Node> queue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        Node root = create(first);
        Node parent = root;
        while (true) {
            String data = in.nextLine();
            if (data.trim().equals("")){
                break;
            }else {
                Node child = create(data);
                parent = linkNode(parent,child);
            }
        }
        queue.add(root);
        printNode(queue);
    }
    public static Node create(String data){
        String [] dataRrray = data.split(" ");
        Node parent = new Node(Integer.parseInt(dataRrray[0]));
        for (int i = 1; i <dataRrray.length; i++) {
            create(parent,Integer.parseInt(dataRrray[i]));
        }
        return  parent;
    }
    public static Node linkNode(Node root,Node child){
        for (int i = 0; i <root.children.size(); i++) {
            if (root.children.get(i).data == child.data){
                root.children.set(i,child);
                break;
            }
        }
        return  child;
    }
    public static void create(Node root, int value) {
        root.addChild(new Node(value));
    }

    public static void printNode(Queue queue) {
        Node node ;
        if (queue.size() !=0){
            node = (Node) queue.poll();
            System.out.print(node.data+" ");
            for (int i = 0; i < node.children.size(); i++) {
                queue.add(node.children.get(i));
            }
            printNode(queue);
        }
    }

    static class Node {
        int data;
        List<Node> children = new ArrayList<>();

        public Node(int value) {
            data = value;
        }

        public void addChild(Node node) {
            children.add(node);
        }
    }
}
