package com.liu.NiuKe;

public class Finder {

    public int findKth(int[] a, int n, int K) {
        return quickSort(a, 0, n - 1, n - K);
    }

    //      快速排序 每一次排序都能将 一个数 放在该数组排好序后的正确位置。
//      找第K大的数，即找 插入 n-k 位置的数。
//      每次插入的位置为i,若 i= n-k ,返回
//      若 i< n-k ,说明 需要排后面部分的数据
//      若 i>n-k , 说明 需要排前面部分的数据
    public static int quickSort(int s[], int l, int r, int K) {
        if (l <= r) {
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    s[i++] = s[j];

                while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            if (i == K) {
                return x;
            } else if (i < K) {
                return quickSort(s, i + 1, r, K);
            } else {
                return quickSort(s, l, i - 1, K); // 递归调用
            }
        } else {
            return -1;
        }
    }
}
