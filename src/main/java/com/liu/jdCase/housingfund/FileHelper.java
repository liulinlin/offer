package com.liu.jdCase.housingfund;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

/**
 * @author: liulinlin@jd.com
 * @since: 2017/1/10
 */
public class FileHelper {

    private static final String saveFilePath = "D:\\result.txt";
    public static void  writeToTxt(String context){
        File myFilePath = new File(saveFilePath);
        BufferedWriter bw = null;
        if (!myFilePath.exists()){
            try {
                myFilePath.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bw = new BufferedWriter(new FileWriter(saveFilePath,true));
            bw.write(context+"\t\n");
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void write(){

    }


    public static JSONObject getContextByFileName(final String filepath) {
        File myFilePath = new File(filepath);
        StringBuilder result = new StringBuilder();
        if (myFilePath.exists()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(filepath));
                String s = "";
                while ((s = br.readLine()) != null) {
                    result.append(s);
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return stringToJSONObject(result.toString());
        }
        return null;
    }
    private static JSONObject stringToJSONObject(String context) {
        if (context != null)
            return JSON.parseObject(context).getJSONArray("transactions").getJSONObject(0);
        else return null;
    }


}
