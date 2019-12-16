package com.simple01.array;

/**
 * @author Song Yinghui
 * @date 2019/12/16
 * @Version 1.0
 *
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 */
public class SearchTarget {

    public int search(int[] nums, int target) {
        if (nums.length == 0){
            return -1;
        }
        int left = 0 ;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[left] <= nums[mid]){  // 说明左边  left->mid 是升序，即旋转点是在mid右侧
                if (nums[mid] > target && nums[left] <= target){ //
                    right = mid - 1;
                }else {
                    left = mid+1;
                }
            } else if(nums[right] >= target && nums[mid] < target){ // 说明左边 left->mid 中间存在转折点
                left = mid +1;
            }else {
                right = mid - 1;
            }

        }

        return -1 ;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,7,9,10};
        System.out.println(new SearchTarget().search(nums, 7));
    }
}
