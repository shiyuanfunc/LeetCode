package com.simple01.array;

/**
 * @author Song Yinghui
 * @date 2019/12/16
 * @Version 1.0
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] == target){
                return i ;
            }
            if (nums[i] > target){
                return i;
            }
        }
        return nums.length ;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(new SearchInsert().searchInsert(nums, 4));
    }
}
