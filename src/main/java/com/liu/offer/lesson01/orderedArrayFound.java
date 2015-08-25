package com.liu.offer.lesson01;

public class orderedArrayFound 
{
	public boolean Find(int [][] array ,int rows ,int colums,int number){
		boolean found = false;
		while(array != null && rows >0 && colums >0){
			int row = 0;
			int colum = colums-1;
			while(row < rows && colum >= 0){
				if(array[row][colum] == number){
					found = true;
					break;
				}
				if(array[row][colum] > number){
					row++;
				}else{
					colum--;
				}
			}
		}
		return found;
	}
}
