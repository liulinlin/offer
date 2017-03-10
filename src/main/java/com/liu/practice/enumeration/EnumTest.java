package com.liu.practice.enumeration;

/**
 * @author liulinlin1
 * @since：2016/9/27
 */
public enum EnumTest {
    /**
     * 客服系统
     */
    CSA,
    /**
     * TMS系统
     */
    TMS,
    /**
     * WMS系统
     */
    WMS,
    /**
     * OMS系统
     */
    OMS;

    /**
     * 这个方法感觉没必要 因为有 EnumTest.values() 方法的存在 直接就是对那个方法的重写。
     * @param str
     * @return
     */
    public static EnumTest getByString(String str) {
        if (str != null) {
            try {
                return Enum.valueOf(EnumTest.class, str.trim());
            } catch (IllegalArgumentException ex) {
            }
        }
        return null;
    }
}
