package com.normal.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Song Yinghui
 * @date 2020/1/18
 * @Version 1.0
 *  求两个数组的交集
 *  输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * nums1 = [1,2,2,1], nums2 = [2]   nums1 = [1,2,1], nums2 = [2,2]
 *  先将两个数组排序 ，然后两个从前到后 走一遍就可
 *
 */
public class Intersect {

    public static void resolve(int[] nums1, int[] nums2){

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0 ;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,1};
        int[] nums2 = new int[]{2,2};

        resolve(nums1,nums2);
    }
}
