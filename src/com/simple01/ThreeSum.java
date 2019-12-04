package com.simple01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Song Yinghui
 * @date 2019/12/4
 * @Version 1.0
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i-1] == nums[i]) continue;
            int L = i+1;
            int R = nums.length - 1;
            while (L < R){
                int sum = nums[i] + nums[L] +nums[R];
                if (sum == 0){
                    result.add(Arrays.asList(nums[i] ,nums[L] ,nums[R]));
                    while (L<R && nums[L] == nums[L+1] ) L++;
                    while (L<R && nums[R] == nums[R-1] ) R--;
                    L++;
                    R--;
                }else if (sum>0){
                    R--;
                }else if (sum < 0){
                    L++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        threeSum(a).forEach(System.out::println);
    }
}
