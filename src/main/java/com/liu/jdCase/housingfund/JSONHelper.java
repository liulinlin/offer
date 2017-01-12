package com.liu.jdCase.housingfund;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: liulinlin@jd.com
 * @since: 2017/1/10
 */
public class JSONHelper {
    private static final String[] PROPS = {"data_source", "housing_fund_status",
            "fund_num", "fund_amt", "balance", "company", "update_time", "pay_base_amount",
            "deposit_ratio_personal", "deposit_ratio_company", "trading_date", "company",
            "note", "trading_amt", "balance"};

    private static final String[] FILE_NAMES = {"sample.1.json",
            "sample.2.json", "sample.3.json",
            "sample.4.json", "sample.5.json",
            "sample.6.json", "sample.7.json",
            "sample.8.json", "sample.9.json", "sample.10.json"
    };
    private static final String PATH = "C:\\Users\\liulinlin1\\Desktop\\公积金统计\\公积金数据-每个地区10份\\";

    public static String getResult(String city) {

        JSONObject file_one = null;
        JSONObject file_two = null;
        // FileHelper.getContextByFileName(filepath)
        int i = 0;
        while ((file_one == null || file_two == null) && i < FILE_NAMES.length) {
            String filepath = PATH + city + "\\" + FILE_NAMES[i];
            if (file_one == null) {
                file_one = FileHelper.getContextByFileName(filepath);
                i++;
            } else {
                if (file_two == null) {
                    file_two = FileHelper.getContextByFileName(filepath);
                }
                i++;
            }
        }
        return getString(city, file_one, file_two);
    }

    private static String getString(String city, JSONObject file_one, JSONObject file_two) {
        StringBuilder result = new StringBuilder(city.substring(0, city.length() - 1) + "{");
        int i = 0;
        for (; i < 10; i++) {
            result.append(PROPS[i]).append(":");
            if (getProResult(file_one, PROPS[i])) {
                result.append("1");
            } else {
                result.append("0");
            }
            result.append(",");
        }
        JSONArray array_one = file_one.getJSONArray("details");
        JSONArray array_two = file_two.getJSONArray("details");
        if (array_one != null && array_one.size() > 0) {
            JSONObject object = array_one.getJSONObject(0);
            for (; i < PROPS.length; i++) {
                result.append(PROPS[i]).append(":");
                if (getProResult(object, PROPS[i])) {
                    result.append("1");
                } else {
                    // 需要去另一个文件里 查看一下是否也是 空的 两个空来来确定
                    if (array_two != null && array_two.size() > 0) {
                        JSONObject two = array_two.getJSONObject(0);
                        if (getProResult(two, PROPS[i]))
                            result.append("1");
                        else
                            result.append("0");
                    } else {
                        result.append("0");
                    }
                }
                result.append(",");
            }
        }else {
            if (array_two != null && array_two.size() > 0){
                JSONObject object = array_two.getJSONObject(0);
                for (; i < PROPS.length; i++) {
                    result.append(PROPS[i]).append(":");
                    if (getProResult(object, PROPS[i])) {
                        result.append("1");
                    }else {
                        result.append("0");
                    }
                    result.append(",");
                }
            }
        }
        if (array_one.size() == 0 && array_two.size() == 0) {
            for (; i < PROPS.length; i++) {
                result.append(PROPS[i]).append(":1,");
            }
        }
        result.replace(result.length() - 1, result.length(), "}");
        System.out.println(result.toString());
        return result.toString();
    }

    private static boolean getProResult(JSONObject file, String pro) {
        if (StringUtils.isBlank(file.getString(pro))) {
            return false;
        } else
            return true;
    }


}
