package com.liu.offer.qunaer01;

import java.util.Scanner;

/**
 * Created by liulinlin on 2016/10/11.
 */
public class Main {

    /**
     * filename extension
     * 时间限制：C/C++语言 1000MS；其他语言 3000MS
     * 内存限制：C/C++语言 65536KB；其他语言 589824KB
     * 题目描述：
     * Please create a  function to extract the filename extension from the given path,
     * return the extracted filename extension or null  if none.
     * 输入
     * 输入数据为一个文件路径
     * 输出
     * 对于每个测试实例，要求输出对应的filename extension
     * <p>
     * 样例输入
     * Abc/file.txt
     * 样例输出
     * txt
     */
    public static void test1() {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String filepath = scan.nextLine();
            int index = filepath.lastIndexOf(".");
            System.out.println(filepath.substring(index + 1));
        }
        scan.close();
    }

    /**
     * 统计字符
     * 时间限制：C/C++语言 1000MS；其他语言 3000MS
     * 内存限制：C/C++语言 65536KB；其他语言 589824KB
     * 题目描述：
     * 给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符。
     * 输入
     * "qywyery23tdd"
     * 输出
     * y
     * <p>
     * 样例输入
     * Have you ever gone shopping and
     */
    public static void test2() {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String word = scan.nextLine();
            if (word == null || word.length() < 3) {
                System.out.println("");
            }
            int[] count = new int[256];
            boolean flag = false;
            for (int i = 0, len = word.length(); i < len; i++) {
                if (++count[word.charAt(i)] == 3) {
                    char ch = word.charAt(i);
                    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                        System.out.println(ch);
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                System.out.println("");
            }
        }
        scan.close();
    }

    /*酒店价格
    时间限制：C/C++语言 1000MS；其他语言 3000MS
    内存限制：C/C++语言 65536KB；其他语言 589824KB
    题目描述：
    酒店房间的价格录入是通过时间段来录入的，比如10月1日至10月7日800元，10月8日至10月20日500元，请实现以下函数int[][] merge(int[][] dateRangePrices)，输入是某个酒店多个日期段的价格，每个日期段（终止日期大于等于起始日期）和对应的价格使用长度为3的数组来表示，比如[0, 19, 300], [10, 40, 250]分别表示从某天开始第1天到第20天价格都是300，第11天到第41天价格都是250，这些日期端有可能重复，重复的日期的价格以后面的为准，
    请以以下规则合并并输出合并结果：
    1.相邻两天的价格如果相同，那么这两个日期段应该合并
    2.合并的结果应该以起始日期从小到大排序
    输入
    [0, 100, 300], [40, 50, 350]
    输出
    [0, 39, 300], [40, 50, 350], [51, 100, 300]

    样例输入
    1 1 100
    2 3 100
    4 5 110
    样例输出
    [1, 3, 100],[4, 5, 110]
    按start从小到大排序，遍历，prices[start...end] = price，输出价格不一样的区间即可。
    */
    public static void test3() {

    }
}
