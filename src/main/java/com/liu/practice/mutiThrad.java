package com.liu.practice;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Created by 刘林林 on 2016/3/30.
 */
public class mutiThrad {
    public static void main(String[] args) {
        // 获取java 线程管理 MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的monitor 和 synchronizer信息，仅获取线程和线程堆栈信息
        ThreadInfo [] threadInfos = threadMXBean.dumpAllThreads(false,false);
        // 打印线程信息，打印 id 和 名字
        for (ThreadInfo t:threadInfos){
            System.out.println(t.getThreadId()+"   "+ t.getThreadName());
        }
    }
}
