package com.liu.acmcoder.algorithm;

import java.util.Scanner;

/**
 * Bob和Alice有个约会，一大早Bob就从点(0,0)出发，前往约会地点(a,b)。Bob没有一点方向感，
 * 因此他每次都随机的向上下左右四个方向走一步。简而言之，如果Bob当前在(x,y)，那么下一步
 * 他有可能到达(x+1,y), (x-1,y), (x,y+1), (x,y-1)。很显然，当他到达目的地的时候，已经很晚了，
 * Alice早已离去。第二天，Alice质问Bob为什么放她鸽子，Bob说他昨天花了s步到达了约会地点。
 * Alice怀疑Bob是不是说谎了。你能否帮她验证一下？
 *
 * 输入
 输入三个整数a,b,s (-109
 样例输入
 5 5 11
 输出
 输出“Yes”，如果Bob可能用s步到达(a,b)；否则输出“No”，不需要输出引号。
 样例输出
 No
 */

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            //输入
            int a = input.nextInt();
            int b = input.nextInt();
            int s = input.nextInt();
            //如何坐标为负数，需要取绝对值
            a = Math.abs(a);
            b = Math.abs(b);

            if (a + b == s) {
                System.out.println("Yes");
            } else if (a + b < s) {
                int i = (s - (a + b)) % 2;
                if (i == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
        input.close();
    }
}
