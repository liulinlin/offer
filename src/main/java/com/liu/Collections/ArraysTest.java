package com.liu.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

/**
 * @author liulinlin1 on 2016/9/26.
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.toString(data);
//        // 排序 正序
//        Arrays.sort(data);
//        // 异步排序
//        Arrays.parallelSort(data);
//        // 二分法搜索
//        Arrays.binarySearch(data, 3);
        // 可以得到Stream 流 然后使用Java8的特性，
//        Arrays.stream(data).filter(x -> x < 10).parallel().forEach(System.out::println);
//        // 方法会根据提供的计算函数对参数values的每一个值进行计算并更新
//        Arrays.parallelSetAll(data, i -> i % 10);
//        IntBinaryOperator binaryOperator = new IntBinaryOperator() {
//            @Override
//            public int applyAsInt(int left, int right) {
//                return left - right;
//            }
//        };
//        // we can use binary operators as prefix in parallel
//        Arrays.parallelPrefix(data, binaryOperator);
//        // also using lambdas
        Arrays.parallelPrefix(data, (x, y) -> x+y);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+" ");;
        }
        Arrays.toString(data);
//
//        Arrays.asList(data);// 这样得到的结果 是将数组作为list的项，因为List里面不能存基本类型，所以 不能讲int导入到list中
//        String[] strArray = new String[]{"z", "a", "C"};
//        //字符串排序，先大写后小写
//        Arrays.sort(strArray);
//        //严格按字母表顺序排序，也就是忽略大小写排序 Case-insensitive sort
//        Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);
////        反向排序， Reverse-order sort
//        Arrays.sort(strArray, Collections.reverseOrder());
////        忽略大小写反向排序 Case-insensitive reverse-order sort
//        Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);
//        Collections.reverse(Arrays.asList(strArray));


    }
}
