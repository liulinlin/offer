package com.liu.offer.ALi;

import java.util.Collections;
import java.util.List;

/**
 * <p>User: Liu Linlin
 * <p>Date: 2016/4/20 20:18.
 * <p>Version: 1.0
 */
public class Main {

    public  Discount Recommend(List<Discount> Discounts ,int UserBugCount) {
        Discount result = null;
        if(Discounts.size()==0) return  result;
        Collections.sort(Discounts); // 排序
        for (Discount d:Discounts) {
            if (d.getCondition()<=UserBugCount)
            {
                result = d;
                break;
            }
        }
        return  result;
    }
    public class Discount implements Comparable<Discount> {
        private int Condition = 0;
        private int Preferential = 0;

        public int getCondition() {
            return Condition;
        }

        public void setCondition(int condition) {
            Condition = condition;
        }

        public int getPreferential() {
            return Preferential;
        }

        public void setPreferential(int preferential) {
            Preferential = preferential;
        }

        @Override
        public int compareTo(Discount o) {
            if (this.getPreferential() > o.getPreferential())
                return -1; //由高到底排序
            else if (this.getPreferential() < o.getPreferential())
                return 1;
            else {
                if (this.getCondition() > o.getCondition())
                    return 1; //由低到高排序
                else if (this.getCondition() < o.getCondition())
                    return -1;
                else
                    return 0;
            }
        }
    }
}
