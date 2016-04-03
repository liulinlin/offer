package com.liu.NiuKe;

import java.util.Scanner;

public class MoveTable {
    public static void main(String[] args) {
        long r, x, y, x1, y1;
        Scanner cin = new Scanner(System.in);
        String readin;
        String[] canshus = new String[4];
        while (cin.hasNext()) {
            readin = cin.nextLine();
            canshus = readin.split(" ");
            if (canshus.length == 5) {
                r = Integer.valueOf(canshus[0]);
                x = Integer.valueOf(canshus[1]);
                y = Integer.valueOf(canshus[2]);
                x1 = Integer.valueOf(canshus[3]);
                y1 = Integer.valueOf(canshus[4]);
                if (1 <= r && r <= 100000 && -100000 <= x && x <= 100000 && -100000 <= y && y <= 100000 && -100000 <= x1 && x1 <= 100000 && -100000 <= y1 && y1 <= 100000) {
                    Double distance = Math.sqrt(Math.abs(x - x1) * Math.abs(x - x1) + Math.abs(y - y1) * Math.abs(y - y1));
                    System.out.println((int) Math.ceil(distance / (double) (r * 2)));
                } else {
                    System.out.println("请输入规定格式的参数");
                }

            } else {
                System.out.println("请输入规定格式的参数");
            }
        }
    }
}
