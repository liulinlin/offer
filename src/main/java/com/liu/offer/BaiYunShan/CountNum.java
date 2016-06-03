package com.liu.offer.BaiYunShan;

import java.io.*;

/**
 * <p>User: Liu Linlin
 * <p>Date: 2016/5/20 21:46.
 * <p>Version: 1.0
 */
public class CountNum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);
        int Allcount = Integer.parseInt(reader.readLine());
        while (Allcount>0) {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int d = Integer.parseInt(reader.readLine());
            long n = Long.parseLong(reader.readLine());

            writer.write(getNum(a,b,d,n)+ "\r\n");
            Allcount--;
        }
        writer.flush();
    }

    private static long getNum(int a,int b,int d,long n){
        int abResult = a*b;
        if(abResult<10){
            if(abResult==d){
                return n;
            }
        }else {
            int geWei = abResult %10;
            int shiWei = (abResult-geWei)/10;

            if(geWei +shiWei <10){
                long    count = 0;
                if(geWei +shiWei == d){
                    count =   n-1;
                }
                if(geWei == d){
                    count++;
                }
                if(shiWei == d){
                    count++;
                }
                return  count;
            }else {
                int gegeWei = geWei +shiWei-10;
                int shishiWei = shiWei+1;
                long count = 0;
                if(geWei == d){
                    count++;
                }
                if (shishiWei == d){
                    count++;
                }
                if(gegeWei+1 == d){
                    count = n-1;
                }
                return count;
            }
        }
        return 0;
    }
}
