package com.liu.SwordOffer;

public class quickSortClass {

    public static Integer[] quickSort(Integer[] list, int low, int high) {
        if (list == null) {
            return list;
        }
        if (low < high) {
            int middle = getMiddle(list, low, high);  //将list数组进行一分为二  
            quickSort(list, low, middle - 1);        //对低字表进行递归排序  
            quickSort(list, middle + 1, high);       //对高字表进行递归排序  
        }
        return list;
    }

    public static int getMiddle(Integer[] list, int low, int high) {
        int tmp = list[low];    //数组的第一个作为中轴    ,也可以在low  跟 high 中间随机一个数字作为 起始 数据。
        while (low < high) {
            while (low < high && list[high] > tmp)
                high--;
            list[low] = list[high];   //比中轴小的记录移到低端
            while (low < high && list[low] < tmp)
                low++;
            list[high] = list[low];   //比中轴大的记录移到高端
        }
        list[low] = tmp;              //中轴记录到尾  
        return low;                   //返回中轴的位置  
    }


    public static void main(String[] args) {
        Integer[] list = {34, 3, 53, 2, 23, 7, 14, 10};
        list = quickSortClass.quickSort(list, 0, list.length - 1);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}
