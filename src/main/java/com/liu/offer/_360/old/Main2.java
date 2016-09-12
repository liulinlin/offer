package com.liu.offer._360.old;

import java.util.*;

/**
 * Created by 刘林林 on 2016/3/29.
 */
public class Main2 {
    public static void main(String[] args) {
        int n,m;
        String s;
        Scanner scanner = new Scanner(System.in);
        Map<Integer,String> inputList = new TreeMap<Integer, String>();

        String getString = scanner.nextLine();
        String[] ss = getString.split(" ");
        n =  Integer.parseInt(ss[0].trim());
        m =  Integer.parseInt(ss[1].trim());
        s= scanner.nextLine();
        int count = 0;
        while(count <m)
        {
            getString = scanner.nextLine();
            if(getString.trim().length()==0)
            {
                break;
            }
            ss = getString.split(" ");
            inputList.put(Integer.parseInt(ss[0].trim()),ss[1].trim());
            count++;
        }
        for(int i = 0;i<m;i++){
            f(s);
        }

    }

    static  void f(String s){
        int count = 0;

        while (s.indexOf("..")<0){
            char [] ss = s.toCharArray();
            int i = 1;
            while (i<ss.length){
                if(ss[i] == '.' && ss[i-1]=='.'){

                }
            }

        }


    }
}
