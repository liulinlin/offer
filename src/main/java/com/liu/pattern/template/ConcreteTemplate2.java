package com.liu.pattern.template;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 刘林林 on 2016/3/12.
 */
public class ConcreteTemplate2 extends AbstractTemplate {

    @Override
    protected void sortArray(int[] args) {
        // 降序
        for(int i=0;i<args.length-1;i++){
            for(int j=i+1;j<args.length;j++){
                if (args[i]<args[j]){
                    int temp=args[i];
                    args[i]=args[j];
                    args[j]=temp;
                }
            }
        }
    }
}
