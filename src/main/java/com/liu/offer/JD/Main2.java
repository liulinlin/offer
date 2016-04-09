package com.liu.offer.JD;
/**
 * 金融证券行业超好的薪酬待遇，吸引了大批的求职者前往应聘，小东也不例外，准备应聘一家证券公司。
 * 面试官为考察她的数据分析、处理和编码能力，为她准备了以下问题。
 * 股票交易中，委托是指股票交易者在证券公司买卖股票。每手委托包括一个委托单号i、价格pi、买入或卖出标记di及交易数量qi。
 * 交易处理中，需要把同类业务（买入或卖出）中相同价格的所有委托合并起来，形成一个清单。清单的第一部分为按价格降序排列的合并后的卖出委托，
 * 紧随其后的是按相同顺序排列的买入合并委托。证券公司比较关心的是比较抢手的s条合并委托信息，需要得到买入及卖出最抢手的s条合并委托。
 * 对于买入委托，抢手的是指报价高的委托，而卖出委托中报价低的较为抢手。若买或卖的合并委托数小于s条，则全部列入清单中。
 * 现在小东拿到的是n个委托，请你帮忙找出最抢手的s个合并委托。
 输入：
 6 2
 B 10 3
 S 50 2
 S 40 1
 S 50 6
 B 20 4
 B 25 10
 输出：
 S 50 8
 S 40 1
 B 25 10
 B 20 4
 */

import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            Map<Integer,Integer> S = new TreeMap<>(new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            Map<Integer,Integer> B = new TreeMap<>(new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            int n = cin.nextInt();
            int s = cin.nextInt();
            for (int i = 0; i <n; i++) {
                String flagB = cin.next();
                if (flagB.equals("B")){
                    int one = cin.nextInt();
                    int two = cin.nextInt();
                    if (B.containsKey(one)){
                        B.put(one,B.get(one)+two);
                    }else {
                        B.put(one,two);
                    }
                }else {
                    int one = cin.nextInt();
                    int two = cin.nextInt();
                    if (S.containsKey(one)){
                        S.put(one,S.get(one)+two);
                    }else {
                        S.put(one,two);
                    }
                }
            }
            // 显示
            Print(S, s, 0);
            Print(B, s, 0);
        }
    }
    private static void Print(Map<Integer, Integer> s, int s2, int countS) {
        Iterator itS = s.keySet().iterator();
        while (itS.hasNext()&&countS< s2){
            Object key = itS.next();
            Object value = s.get(key);
            System.out.println("S "+key+" "+value);
            countS++;
        }
    }
}
