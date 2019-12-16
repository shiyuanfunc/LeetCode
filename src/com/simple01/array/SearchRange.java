package com.simple01.array;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Song Yinghui
 * @date 2019/12/16
 * @Version 1.0
 *
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if (nums.length == 0){
            return result;
        }
        int left = 0 ;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right) / 2 ;
            if (nums[mid] == target){
                if (mid > 0){
                    int max = mid;
                    int min = max;
                    while ((max + 1 < nums.length - 1) && nums[max + 1] == target){
                        max ++;
                    }
                    while (min - 1 >= 0 && nums[min - 1] == target){
                        min -- ;
                    }
                    result[0] = min ;
                    result[1] = max ;
                    return result;
                }
                result[0] = 0;
                while ((mid+1< nums.length -1) && nums[mid + 1] == target){
                    mid++;
                }
                result[1] = mid;
                return result;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,5,7,8,8,9,9,9,10,11};
        int[] ints = new SearchRange().searchRange(nums, 9);
        Arrays.stream(ints).forEach(System.out::println);
    }
}
