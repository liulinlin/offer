package com.liu.SwordOffer;

import java.util.Arrays;

/**
 * Created by liulinlin on 2017/3/13.
 * 构建小顶堆 ，得到从大到小的排序，
 * 构建大顶堆，得到从小到达的排序。
 */
public class HeapSort {


    public void heapSort(int[] data) {
        this.data = data;
        // 构建堆
        for (int i = (data.length - 1) / 2; i >= 0; i--) {
            shif(i, data.length);
        }
        // 排序
        for (int i = data.length - 1; i > 0; i--) {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            shif(0, i);
        }
    }

    int[] data;

    private void shif(int low, int high) {
        int i = low;
        int j = 2 * i + 1;
        int temp = data[low];
        while (j < high) {
            if (j < high - 1 && data[j] > data[j + 1]) j = j + 1;
            if (temp > data[j]) {
                data[i] = data[j];
                i = j;
                j = 2 * i + 1;
            } else {
                break;
            }
        }
        data[i] = temp;
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] data = {9, 2, 4, 1, 8, 3, 7};
        heapSort.heapSort(data);
        System.out.println(Arrays.toString(data));
    }
}
