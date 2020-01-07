package com.simple01.array;

/**
 * @author Song Yinghui
 * @date 2020/1/7
 * @Version 1.0
 *
 *  给定一个升序数组和一个目标值target， 从中找到p和q 使p+q == target
 */
public class SearchPAndQ {

    public void findTarget(int[] nums, int target){

        if (nums.length == 0){
            return;
        }
        int left = 0 ;
        int right = nums.length - 1 ;

        while (left < right){
            if (nums[left] + nums[right] == target){
                System.out.println(nums[left]+", "+nums[right]);
                return;
            }else if (nums[left] + nums[right] > target){
                right -- ;
            }else {
                left ++ ;
            }
        }
    }

    public static void main(String[] args) {
        SearchPAndQ test = new SearchPAndQ();
        int[] nums = new int[]{-3,-2,-1,1,2,4,5,7,9,10};
        test.findTarget(nums,6);
    }
}
