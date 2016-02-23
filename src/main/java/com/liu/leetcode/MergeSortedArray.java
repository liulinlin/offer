package com.liu.leetcode;

/**
 * Created by Administrator on 2016/2/23.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // my practice
        int [] temp = new int[m+n];
        int i=0 ,j=0,k=0;
        while (i<m&&j<n){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                i++;
            }else{
                temp[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(i<m){
            for(;i<m;i++){
                temp[k] = nums1[i];
                k++;
            }
        }
        if(j<n){
            for(;j<n;j++){
                temp[k] = nums2[j];
                k++;
            }
        }


        // Best1
        int l = m+n; int ii = l-1; m--;  n--;
        while(m >= 0 && n >= 0) nums1[ii--] = nums1[m] > nums2[n]? nums1[m--]: nums2[n--];   //当nums1和nums2都有数据时
        while( n>=0)nums1[ii--] = nums2[n--];
        // Best2
        int h = m-- + n-- - 1;
        while (m >= 0 && n >= 0)
            nums1[h--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        while (n >= 0)
            nums1[h--] = nums2[n--];
    }
}
