package com.liu.practice.base.serializable;

import java.io.*;

/**
 * Created by 刘林林 on 2016/3/18.
 */
public class PersonTest {
    public static void  main(String [] args) {
        Person p = new Person("张三","11111",12);
        String file = "d://data.txt";
        // 1 序列化 对象
        try {
            File f = new File(file);
            if(!f.exists()){
                f.createNewFile();
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
            out.writeObject(p);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2 反序列化
        try {
            File fi = new File(file);
            if(!fi.exists()){
                System.out.print("没有指定的文件");
                return;
            }
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fi));
            Person t = (Person) in.readObject();
            System.out.print(t.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
