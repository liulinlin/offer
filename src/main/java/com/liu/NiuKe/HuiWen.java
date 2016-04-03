package com.liu.NiuKe;

//参考前辈思路
//既然能通过增加一个字符变成回文串，那一定也可以通过删除一个字符变成回文串。
//用一个循环，每次循环依次删掉一个字符，然后检查新串是否是回文串，看起来简单方便许多。
import java.util.Scanner;
public class HuiWen {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        while (reader.hasNext())
        {
            String string=reader.next();
            boolean s=false;
            for (int i = 0; i < string.length(); i++) {
                StringBuilder builder=new StringBuilder(string).deleteCharAt(i);

                if(isHuiWenChuan(builder.toString())){
                    s=true;
                }
            }
            if(s)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static boolean isHuiWenChuan(String string) {
        char[] cha=string.toCharArray();
        boolean is=true;
        for (int i = 0; i < cha.length/2; i++) {
            if(cha[cha.length-1-i]!=cha[i]){
                is=false;
            }
        }
        return is;

    }
}
