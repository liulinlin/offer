package com.liu.SwordOffer.lesson02;

public class Min {
	public static int FoundMinInt(int [] numbers){
		if(numbers.length == 0){
			return -1;
		}
		int index1 = 0;
		int index2 = numbers.length-1;
		int indexMid = 0;
		
		while(numbers[index1] >= numbers[index2]){
			if (index2 - index1 == 1) {
				indexMid = index2;
				break;
			}
			indexMid = (index1 + index2)/2;
			// 如果下标index1 index2 indexMId 指向的三个数字相等，则只能利用顺序查找
			if(numbers[index1] == numbers[index2] && numbers[index1] == numbers[indexMid]){
				return MinInOlder(numbers,index1,index2);
			}
			if (numbers[indexMid]>numbers[index2]) {
				index1 = indexMid;
			} else {
				index2 = indexMid;
			}
		}
		return numbers[indexMid];
	}

	private static int MinInOlder(int[] numbers, int index1, int index2) {
		int result = numbers[index1];
		for (int i = index1+1; i <= index2; i++) {
			if(result > numbers[i])
				result = numbers[i];
		}
		return result;
	}
}
