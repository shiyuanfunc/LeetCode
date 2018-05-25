package com.song.sort;

public class InsertSort {
	
	public int[] insertSort(int[] a) {
		int j   ; 
		for (int i = 1 ; i < a.length ; i++) {
			int x = a[i] ;
			for (j = i ; j > 0 && x < a[j-1] ; j --) {
				a[j] = a[j - 1] ; 
			}
			a[j] = x; 	
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		InsertSort insertSort = new InsertSort() ;
		
		int[] a = new int[] {1 ,7 ,3 ,5 ,2 ,6};
		int[] insertSort2 = insertSort.insertSort(a);
		for (int i : insertSort2) {
			System.out.println(i);
		}
	}
}
