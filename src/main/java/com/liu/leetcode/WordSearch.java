package com.liu.leetcode;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/2/25.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        HashMap<String,Integer> temp = new HashMap<String, Integer>();
        int m = board.length;
        int n = board[0].length;
        int count = 0;
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(temp.containsKey(board[i][j])){
                    count = temp.get(board[i][j]);
                    count++;
                    temp.remove(board[i][j]);
                    temp.put(String.valueOf(board[i][j]),count);
                }else{
                    temp.put(String.valueOf(board[i][j]),1);
                }
            }
        }
        char[] tt = word.toCharArray();
        for(int k= 0;k<tt.length;k++){
            if(!temp.containsKey(tt[k]) && (temp.get(tt[k])<=0))return false;
            count = temp.get(tt[k]);
            count--;
            temp.remove(tt[k]);
            temp.put(String.valueOf(tt[k]),count);
        }
        return true;
    }
}
