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
