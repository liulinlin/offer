package com.liu.jdCase.housingfund;

/**
 * @author: liulinlin@jd.com
 * @since: 2017/1/10
 */
public class Main {
    private static final String[] CITYS = {
            "北京", "上海","深圳", "广州","天津",
            "重庆", "南京","杭州", "厦门","宁波",
            "苏州", "大连","沈阳", "武汉","济南",
            "成都", "青岛","南昌", "合肥","福州",
            "石家庄", "西安","长春", "哈尔滨","昆明",
            "贵阳", "郑州","长沙", "南宁","太原",
            "中山", "佛山","顺德", "东莞","惠州",
            "扬州", "绍兴","嘉兴", "南通","潍坊",
            "常州", "无锡","湖州", "温州","盐城",
            "连云港", "镇江","烟台", "唐山","秦皇岛"};
    public static void main(String[] args) {
        for (int i = 0; i <CITYS.length; i++) {
            String result = JSONHelper.getResult(getCityPath(i));
            FileHelper.writeToTxt(result);
        }
    }
    private static String getCityPath(int i) {
        return CITYS[i] + "公积金/";
    }
}
