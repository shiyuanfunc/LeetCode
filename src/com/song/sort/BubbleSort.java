package com.song.sort;
/**
 * 
 * @author Administrator
 *  * 冒泡法排序<br/>
* <li>比较相邻的元素。如果第一个比第二个大，就交换他们两个。</li>
* <li>对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。</li>
* <li>针对所有的元素重复以上的步骤，除了最后一个。</li>
* <li>持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。</li>
 */
public class BubbleSort {
	
	public int[] bubbleSort(int[] a) {
		for (int i = 0 ; i < a.length - 1; i ++) {
			for (int j = i+1 ; j < a.length ; j++){
				if (a[j] < a[i]) {
					int temp = a[i] ; 
					a[i] = a[j] ; 
					a[j] = temp; 
				}
			}
		}
		return a ; 
	}
	
	public static void main(String[] args) {
		
		int[] a = new int[] {1 ,7 ,3 ,5 ,2 ,6};
		int[] bubbleSort = new BubbleSort().bubbleSort(a) ;
		
		for (int i :bubbleSort ) {
			System.out.println(i);
		}
	}
}
