package com.simple01;

import java.util.Arrays;

/**
 * @author Song Yinghui
 * @date 2019/12/4
 * @Version 1.0
 */
public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i< nums.length-1; i++){
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R ){
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == target){
                    return sum;
                }
                if (min > Math.abs(sum - target)){
                    min = Math.abs(sum - target);
                    result = sum;
                }
                while (L<R && nums[L] == nums[L+1]) L++;
                while (L<R && nums[R] == nums[R-1] ) R--;
                L++;
                R--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{0,2,1,-3}, 1));
    }
}
