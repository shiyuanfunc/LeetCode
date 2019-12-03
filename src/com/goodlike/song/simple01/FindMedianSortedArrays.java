package com.goodlike.song.simple01;

/**
 * @author Song Yinghui
 * @date 2019/12/3
 * @Version 1.0
 * 寻找两个有序数组的中位数
 */
public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0; //nums1
        int j = 0; //nums2
        int k = 0 ;
        int[] result = new int[nums1.length+nums2.length];

        while (k < (nums1.length+nums2.length)){
            if (i >= nums1.length){
               result[k] = nums2[j];
               j++;
            }else if (j >= nums2.length){
                result[k] = nums1[i];
                i++;
            }else if (nums1[i] > nums2[j]){
                result[k] = nums2[j];
                j++;
            }else {
                result[k] = nums1[i];
                i++;
            }
            k++;
        }

        if (result.length % 2 == 0){
            return ((double)(result[result.length / 2] + result[(result.length/2) - 1])) / 2;
        }else {
            return (double)result[result.length / 2];
        }
    }

    public static void main(String[] args) {
        int[] a  = {3,4};
        int[] b = {};
        System.out.println(findMedianSortedArrays(a, b));
    }

}
