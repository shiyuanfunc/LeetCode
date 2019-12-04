package com.song.array;
/**
 *  给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

	设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

	注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）
 * @author Administrator
 *	解题思路： 找局部递增序列 相加 就是结果	
 *
 */
public class MaxProfit {
	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,7,3,9};
		int result = 0 ;
		if (a.length <= 1) return ;
		
		for (int i = 0 ; i < a.length ;) {
			int j = i; 
			while (j+1 < a.length &&( a[j+1] > a[j])) {
				j++;
			}
			if (j == i) {
				i ++ ;
			}else {
				result = result + a[j] - a[i];
				i= j+1;
			}
		}
		
		System.out.println(result);
	}
}
