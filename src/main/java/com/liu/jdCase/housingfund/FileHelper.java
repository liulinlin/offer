package com.liu.jdCase.housingfund;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

/**
 * @author: liulinlin@jd.com
 * @since: 2017/1/10
 */
public class FileHelper {
    private static final String PATH = "C:\\Users\\liulinlin1\\Desktop\\公积金统计\\公积金数据-每个地区10份\\";

    private static final String[] FILE_NAMES = {"sample.1.json",
            "sample.2.json", "sample.3.json",
            "sample.4.json", "sample.5.json",
            "sample.6.json", "sample.7.json",
            "sample.8.json", "sample.9.json","sample.10.json"
    };

    public static JSONObject getContextByFileName(final String cityNum,final int fileNum) {
        String filepath = PATH + cityNum +"\\" +FILE_NAMES[fileNum];
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
