package com.liu.NiuKe;

import java.util.ArrayList;
import java.util.List;

// TODO:  http://www.nowcoder.com/questionTerminal/ac27e60e63b549d6a9b59f815d9bc6e2  需要用到java 中森林的概念
public class Cmp {
    public static void main(String[] args) {

    }
    public int cmp  (int g1, int g2, int[][] records, int n){
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(records[i][0],new Node(records[i][1])));
        }

        return  0;
    }
    class Node {
        private int Name ;
        private Node Next ;

        public int getName() {
            return Name;
        }

        public void setName(int name) {
            Name = name;
        }

        public Node getNext() {
            return Next;
        }

        public void setNext(Node next) {
            Next = next;
        }

        Node(int name){
            this.Name = name;
        }
        Node(int name ,Node next){
            this.Name = name;
            this.Next = next;
        }

    }
}
