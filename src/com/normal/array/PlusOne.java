package com.normal.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Song Yinghui
 * @date 2020/1/18
 * @Version 1.0
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头
 */
public interface PlusOne {

    public static int[] resolve(int[] nums){
        int carry = 1 ;
        for (int i = nums.length - 1 ; i >= 0 ; i--){
            if (carry == 0){
                return nums;
            }
            int tmp = nums[i] + 1 ;
            carry = tmp / 10 ;
            nums[i] = tmp % 10 ;
        }
        if (carry != 0 ){
            int[] result = new int[nums.length + 1];
            result[0] = 1 ;
            int j = 0 ;
            while ( j < nums.length){
                result[j+1] = nums[j];
                j++;
            }
            return result ;
        }
        return nums ;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,9,9,9,9,9,9,9,9,9,9,9};
        int[] resolve = resolve(nums);
        for (Integer i :resolve){
            System.out.println(i);
        }
    }
}
