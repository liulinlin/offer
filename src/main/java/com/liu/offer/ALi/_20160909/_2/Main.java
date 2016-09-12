package com.liu.offer.ALi._20160909._2;

/**
 * Created by Administrator on 2016/9/9.
 */
public interface Main {
    /**
     * 根据名字下载文件
     * @param name  文件名数组
     */
    public void DownLoad(String ... name) throws Exception;

    /**
     * 分片下载
     * @param name  文件名
     * @param PagerStart 开始为止
     * @param PagerEnd  结束为止
     */
    public void DownLoadPager(String name,int PagerStart,int PagerEnd) throws Exception;

}
