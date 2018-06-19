package com.song.sort;
/**
 *  
 * @author Administrator
 *
 * 如果碰见一个和插入元素相等的，那么插入元素把想插入的元素放在相等元素的后面。
 * 所以，相等元素的前后顺序没有改变，从原无序序列出去的顺序就是排好序后的顺序，所以插入排序是稳定的。
 */
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
