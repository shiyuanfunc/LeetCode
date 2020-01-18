package com.normal.array;

/**
 * @author Song Yinghui
 * @date 2020/1/18
 * @Version 1.0
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
 *
 * 定义两个指针，一个指向0元素的位置，一个指向下一次非0元素的位置，然后交换位置
 * 找到第一0元素i后，依次i++ 就可以了
 */
public class MoveZores {

    static int[] resolve(int[] nums){

        int i = 0, j = 0 ;
        while (j < nums.length){
            while (i <nums.length && nums[i] != 0){
                i++;
            }
            if (i == nums.length){
                return nums;
            }
            j = i+1 ;
            while (j < nums.length && nums[j] == 0){
                j ++ ;
            }
            if ( j < nums.length) {
                swap(nums, i, j);
                i++;
                j++;
            }
        }

        return nums ;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i] ;
        nums[i] = nums[j];
        nums[j] = tmp ;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{0,1,2,3,0,5,0,5};
        int[] nums = new int[]{0};
        int[] resolve = resolve(nums);
        for (int i : resolve){
            System.out.println(i);
        }
    }
}
