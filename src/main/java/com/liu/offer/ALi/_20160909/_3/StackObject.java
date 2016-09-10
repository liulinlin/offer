package com.liu.offer.ALi._20160909._3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/9.
 */
public class StackObject {

    public static final int EdenLength = 4;
    public static final int FromSurivivorLength = 8;
    public static final int ToSurivivorLength = 8;
    public static final int OldLength = 8;


    public static List<Object> Eden;
    public static List<Object> FromSurivivor;
    public static List<Object> ToSurivivor;
    public static List<Object> Old;

    // 创建堆
    public StackObject() {
        Eden = new ArrayList<Object>(EdenLength);
        FromSurivivor = new ArrayList<Object>(FromSurivivorLength);
        ToSurivivor = new ArrayList<Object>(ToSurivivorLength);
        Old = new ArrayList<Object>(OldLength);
    }

    // 新增对象
    public static void addObject(Object o, int objectSize) {
        // 1 先判断Eden 是否有足够空间 如果没有 空间 就 将Eden 往 Surivivor 区复制
        if (isEden(objectSize)) {
            // 将 Eden 复制到 Surivivor 区
            EdenToSurivivor();
        }
    }

    /**
     * 先判断Eden 是否有足够空间
     */
    public static boolean isEden(int size) {
        if (Eden.size() + size >= EdenLength) {
            return false;
        }
        return true;
    }

    /*
     将Eden 往 Surivivor 区复制
     */
    public static void EdenToSurivivor() {
        // 先将 一个 Surivivor  复制到另外一个 Surivivor
        MintorGC();
        // 如果 新的 加入后 放不下 ，则放到 old中
        if (Eden.size() + ToSurivivor.size() >= ToSurivivorLength) {
            EdenSurivivorToOld();
        } else {
            ToSurivivor.addAll(Eden);
        }
    }
    //      先将 一个 Surivivor  复制到另外一个 Surivivor ，
    public static void MintorGC() {
        // 简单模拟一下
        FromSurivivor.clear();
    }

    public static void EdenSurivivorToOld() {
        // 整个内存放不下去的时候 引起 FullGC
        if (Old.size() + Eden.size() + ToSurivivor.size() >= OldLength) {
            FullGC();
        } else {
            // 将 ToSurivivor Eden 放到 Old中
        }
    }

    public static void FullGC() {
        Old.clear();
        System.out.println("Full GC");
    }
}
