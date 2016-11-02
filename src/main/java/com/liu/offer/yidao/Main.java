package com.liu.offer.yidao;


import java.util.*;

/**
 * 苹果游戏
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 小切和小麟是好朋友。有一天他们在玩一个游戏。最开始有N个苹果，两个人不断重复下面的操作：
 * 1.把苹果分成两堆，并且保证两堆苹果的数量不一样。
 * 2.另一个人选择其中一堆苹果，把另一堆苹果扔掉，然后作为操作者跳到第一步。
 * 如果有人不能完成自己的操作，就算输了。游戏由小切开始操作，他想知道自己是否有必胜策略。
 * 输入
 * 输入有多组数据，不超过1000组。
 * 每组数据只有一个整数N(1<=N<=10^9)
 * 输出
 * 每组数据的结果单独输出一行。如果小切有必胜策略，输出"Yes",否则输出"No".
 * <p>
 * 样例输入
 * 2
 * 3
 * 4
 * 样例输出
 * No
 * Yes
 * No
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int data = in.nextInt();
            if (getResult(data))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    private static boolean getResult(int num) {
        if (num < 0) return false;
        if (num == 1 || num == 2) return false;
        if (num == 3) return true;
        if (num % 3 == 1)
            return false;
        else
            return true;
    }
}
