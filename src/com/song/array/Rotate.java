package com.song.array;
/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * @author Administrator
 *
 */
public class Rotate {
	public static void main(String[] args) {
		int k = 3;
		int[] a = new int[] {1,2,3,4,5,6,7,8};
		for (int i = 0 , j = a.length - k ; i < a.length-k && (j < a.length); i++ , j++) {
			a[i] = a[j];
			a[j] = a[j - k];
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
}
