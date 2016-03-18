package com.liu.pattern.template;

import java.util.Arrays;

/**
 * Created by 刘林林 on 2016/3/12.
 */
public class ConcreteTemplate extends AbstractTemplate {
    //基本方法的实现
    @Override
    public void sortArray(int[] array) {
        // 升序
        Arrays.sort(array);
    }
}
