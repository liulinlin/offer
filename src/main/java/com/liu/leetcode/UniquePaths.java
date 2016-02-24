package com.liu.leetcode;

/**
 * Created by 刘林林 on 2016/2/24.
 */
public class UniquePaths {


    public int uniquePaths(int m, int n) {

//        方法1  可行 但是计算时间比较长
//        if(m<=1 || n<=1) return 1;
//        return uniquePaths(m-1,n)+uniquePaths(m,n-1);

//        方法2
//        if(m<=1 || n<=1) return 1;
//        int [] [] temp = new int[m][n];
//        temp[0][0] = 1;
//        int i =0;int j=0;
//        for(;i<m;i++){
//            temp[i][0]=1;
//        }
//        for(;j<n;j++){
//            temp[0][j]=1;
//        }
//        for( i =1;i<m;i++){
//            for( j=1;j<n;j++){
//                temp[i][j] = temp[i-1][j]+temp[i][j-1];
//            }
//        }
//        return temp[m-1][n-1];


//        方法3
        if(m<=1 || n<=1) return 1;
        int [] temp = new int[n];
        for(int j=0;j<n;j++){
            temp[j]=1;
        }
        for(int i =1;i<m;i++){
            for(int j=1;j<n;j++){
                temp[j]+=temp[j-1];
            }
        }
        return temp[n-1];
    }
}
