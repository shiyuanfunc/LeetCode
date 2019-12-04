package com.song.array;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {-1,0,0,1,1,2,3,4,5,5,6,7,7};
		
		int[] b = new int[nums.length];
		int p = 0 ;
		boolean flag1 = false ; 
		for (int i : nums) {
			if (i == 0 && !flag1) {
				b[p] = i ;
				p ++ ;
				flag1 = true ; 
				continue ;
			}
			boolean flag = false ; 
			for (int j : b) {
				if (j == i) {
					flag = true ;  //已存在
				}
			}
			
			if (!flag) {
			b[p] = i  ;
			p ++ ;
			}
		}
		
		int[] qq = new int[p];
		System.out.println("----------");
		for (int i = 0 ; i < p; i++) {
			qq[i] = b[i];
			System.out.println(qq[i]);
		}
		
	}
}
