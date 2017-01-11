package com.liu.jdCase;

import javax.tools.ToolProvider;
import java.beans.PropertyEditorSupport;
import java.lang.reflect.Field;
import java.util.BitSet;

/**
 * @author: liulinlin@jd.com
 * @date: 2016/12/28
 */
public class LittleCaseMain {
    public static void main(String[] args) {
        String[] strings = {"1","2","3"};
        BitSet bm = new BitSet();
        Field field;
        PropertyEditorSupport propertyEditorSupport;
        ToolProvider.getSystemJavaCompiler();
    }
}
