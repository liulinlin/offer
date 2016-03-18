package com.liu.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 刘林林 on 2016/3/1.
 */
public class CalculatePath {
    public  static int getPath(List<Obstacle> obs,Point start,Point end){
        int sum = 0;
        if (obs.size() ==0 ) return end.X - start.X;
        if (start == null || end == null ) return 0;
        sum = end.X - start.X;
        int [] higs = new int[sum];
        for(int i=0;i<higs.length;i++){
            higs[i] = 0;
        }
        for (int i = 0;i<obs.size();i++){
            if (i ==0 ){
//                for (int j = obs.get(0).X;j<obs.get(0).Y;j++){
//                    higs[j] = obs.get(0).Z;
//                }
                higs[obs.get(0).X] = obs.get(0).Z;
                higs[obs.get(0).Y] = obs.get(0).Z;
            }else {
                for (int j = obs.get(i).X;j<obs.get(i).Y;j++){
                    higs[j] = obs.get(0).Z;
                }
            }
        }

        return  sum;
    }

    public static  void  main  (String [] args){
        List<Obstacle> obs = new ArrayList<>();
        obs.add(new Obstacle(2,4,2));
        obs.add(new Obstacle(9,11,2));
        obs.add(new Obstacle(5,8,2));
        obs.add(new Obstacle(6,9,2));
        Point start = new Point(0,0);
        Point end = new Point(14,0);
        getPath(obs,start,end);
    }

    static class Point {
        int X;
        int Y;
        public Point(int x,int y){
            X = x;
            Y = y;
        }
    }
    static class Obstacle {
        int X;
        int Y;
        int Z;
        public Obstacle(int x,int y,int z){
            X = x;
            Y = y;
            Z = z;
        }
    }
}

