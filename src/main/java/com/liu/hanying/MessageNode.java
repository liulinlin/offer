package com.liu.hanying;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by liulinlin on 2017/3/17.
 */
public class MessageNode {
    /**
     * 全局节点个数
     */
    private volatile int wholeSize = 50;
    /**
     * 全局黑名单
     * 需要记录 那些节点对B进行了恶意性评定
     * 如何去评定 时间的新旧。
     */
    ConcurrentHashMap<String,Set<String>> wholeBlackList = new ConcurrentHashMap<>();
    /**
     * 私人黑名单
     * 需要记录 对B的收的信息总数，恶意消息数，判定为恶意节点的时间
     *
     * 需要过一定时间进行清除黑名单 同时从全局里把自己的记录清除
     */
    ConcurrentHashMap<String,Describe> privateBlackList =  new ConcurrentHashMap();


}
