package com.liu.leetcode;

/**
 * Created by 刘林林 on 2016/2/25.
 */
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                }else{
                    if(i==0&&j==0)obstacleGrid[i][j]=1;
                    else if(i==0&& j>0)obstacleGrid[i][j]=obstacleGrid[i][j-1];
                    else if(i>0&& j==0)obstacleGrid[i][j]=obstacleGrid[i-1][j];
                    else obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}
