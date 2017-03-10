package com.liu.practice.jsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by liulinlin on 2017/1/10.
 */
public class JSONHelper {
    public static JSONObject getJSONObject(String context) {
        if (StringUtils.isBlank(context)) return null;
        else return JSON.parseObject(context);
    }

}
