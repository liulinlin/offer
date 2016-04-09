package com.liu.NiuKe;

import java.util.Scanner;

/**
 * Created by 刘林林 on 2016/4/3.
 */
public class PaoTaiDaRen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            double r = in.nextInt();
            long x1 = in.nextInt();
            long y1 = in.nextInt();
            long x2 = in.nextInt();
            long y2 = in.nextInt();
            long x3 = in.nextInt();
            long y3 = in.nextInt();
            long x0 = in.nextInt();
            long y0 = in.nextInt();

            int count = 0;
            if(r>=getDistance(x1,y1,x0,y0))count++;
            if(r>=getDistance(x2,y2,x0,y0))count++;
            if(r>=getDistance(x3,y3,x0,y0))count++;
            System.out.println(count+"x");
        }
    }
    private  static double getDistance(long x1,long y1,long x2, long  y2){
        return  Math.sqrt(Math.abs(x1-x2)*Math.abs(x1-x2)+Math.abs(y1-y2)*Math.abs(y1-y2)) ;
    }
}
