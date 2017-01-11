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


    public static void getResult(String city) {
        JSONObject file_one = FileHelper.getContextByFileName(city, 0);
        JSONObject file_two = FileHelper.getContextByFileName(city, 1);
        if (file_one != null) {
            StringBuilder result = new StringBuilder(city.substring(0,city.length()-1) + "{");
            int i = 0;
            for (; i < 10; i++) {
                result.append(PROPS[i]).append(":");
                if (getProResult(file_one, PROPS[i])) {
                    result.append("1");
                } else {
                    result.append("0");
                }
                result.append("|");
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
                            JSONObject two = array_one.getJSONObject(0);
                            if (getProResult(two, PROPS[i]))
                                result.append("1");
                            else
                                result.append("0");
                        } else {
                            result.append("0");
                        }
                    }
                    result.append("|");
                }
            }
            if (array_one.size()==0 && array_two.size() == 0) {
                for (; i < PROPS.length; i++) {
                    result.append(PROPS[i]).append(":1|");
                }
            }
            result.replace(result.length() - 1, result.length(), "}");
            System.out.println(result.toString());
        }
    }

    private static boolean getProResult(JSONObject file, String pro) {
        if (StringUtils.isBlank(file.getString(pro))) {
            return false;
        } else
            return true;
    }


}
