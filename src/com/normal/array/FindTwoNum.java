package com.normal.array;

import java.util.Arrays;

/**
 * @author Song Yinghui
 * @date 2020/1/18
 * @Version 1.0
 */
public class FindTwoNum {

    static int[] resolve(int[] nums, int target){
        Arrays.sort(nums);
        // nums 有序的话可以这样  或者不需要返回下标值得
        int i = 0 ;
        int j = nums.length - 1 ;
        int[] result = new int[2];
        while (i < j ){
            if (nums[i] + nums[j] == target){
                result[0] = i ;
                result[1] = j ;
                return result ;
            }else if (nums[i] + nums[j] > target){
                j -- ;
            }else {
                i++;
            }

        }
        return result ;
    }

    static int[] resolve2(int[] nums, int target ){

        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i+1 ; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int[] result = new int[2];
                    result[0] = i ;
                    result[1] = j ;
                    return result;
                }
            }
        }
        return null ;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int[] resolve = resolve2(nums, 6);
        Arrays.stream(resolve).forEach(System.out::println);
    }

}
