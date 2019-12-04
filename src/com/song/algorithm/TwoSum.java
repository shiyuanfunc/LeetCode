package com.song.algorithm;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			int num = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (num == nums[j]) {
					a[0] = i;
					a[1] = j;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		int[] nums = new int[] { 2, 7, 11, 15 } ; 
		int target = 17 ; 
		TwoSum twoSum = new TwoSum() ; 
		int[] a = twoSum.twoSum(nums, target) ; 
		for (int i : a ) {
			System.out.println(i);
		}
	}
}
