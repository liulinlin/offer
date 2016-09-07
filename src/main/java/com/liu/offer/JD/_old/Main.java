package com.liu.offer.JD._old;
/**
 * 临近期末，让小东头疼的考试又即将到来了，而且是小东最不喜欢的科目。遗憾的是，小东得知d天后她必须参加此次考试。
 * 小东的父亲对她要求非常严格，要求她立即开始复习功课。为照顾她的情绪，父亲要求她每天该科目的学习时间在iminTime到imaxTime之间，
 * 并计划在考前检查小东是否按要求做了。若未能完成，小东将会受到惩罚。
 * 现在小东的父亲要求检查小东的备考情况。遗憾的是，由于专注于备考，小东只是记录了自己备考的总时间sumTime，并没有记录每天复习所用的时间，
 * 也不知道准备情况是否符合父亲的要求。她想知道是否能够制作一个满足要求的时间表以应付父亲的检查。
 * 小东希望你能够帮到她，你是否愿意？
 * 输入 ：
 * 1 48
 * 5 7
 * 2 5
 * 0 1
 * 3 5​
 * 输出：
 * No
 * Yes
 * 1 4
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int d = cin.nextInt();
            int sumTime = cin.nextInt();
            int request[][] = new int[d][2];
            int sumRequestMin = 0;
            for (int i = 0; i < d; i++) {
                request[i][0] = cin.nextInt();
                request[i][1] = cin.nextInt();
                sumRequestMin += request[i][0];
            }
            ReviewPlan(d, sumTime, request, sumRequestMin);
        }
        cin.close();
    }

    private static void ReviewPlan(int d, int sumTime, int[][] request, int sumRequestMin) {
        if (sumRequestMin > sumTime || sumTime / d > 24) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            String result = "";
            int yonggong = sumTime - sumRequestMin;
            for (int i = 0; i < d; i++) {
                if (yonggong != 0) {
                    if(i == d-1){
                        result = result + " " + (request[i][0] + yonggong);
                    }else {
                        if (request[i][1] - request[i][0] <= yonggong) {
                            result = result + " " + request[i][1];
                            yonggong = yonggong - (request[i][1] - request[i][0]);
                        } else {
                            result = result + " " + (request[i][0] + yonggong);
                            yonggong = 0;
                        }
                    }
                } else {
                    result = result + " " + request[i][0];
                }
            }
            System.out.println(result.substring(1));
        }
    }


}
