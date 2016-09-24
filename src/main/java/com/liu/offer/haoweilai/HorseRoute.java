package com.liu.offer.haoweilai;

import java.util.ArrayList;
import java.util.List;

public class HorseRoute {
    public static void main(String[] args) {

    }

    public static List<Node> getRoute(Node P,Node Q) {
        // 用一个list记录经过的点
        List<Node> route = new ArrayList<>(8 * 8);

        // 首先进入Q的范围，即让Q.X-P.X 绝对值 <=2,Q.Y-P.Y 绝对值 <=2,但是两者之差不能都为2，同时为2时 ，将其中之一变为0
        approach(P,Q,route);
        // 然后根据 差值，进行 分情况跳转
        reach(P,Q,route);
        // 返回结果
        return route;
    }
    public static void approach(Node P,Node Q,List<Node> route){

    }
    public static void reach(Node P,Node Q,List<Node> route){

    }

    public static class Node {
        int X;
        int Y;
    }
}
