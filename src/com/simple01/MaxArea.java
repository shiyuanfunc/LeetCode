package com.simple01;

/**
 * @author Song Yinghui
 * @date 2019/12/4
 * @Version 1.0
 * 给定坐标间最大面积
 * 假定两端所围成的面积是最大的，然后依次移动较短者  左-->右  右-->左
 * （移动较长者也会局限于目前的短者，高度上最多持平，而宽度则会减少，因此移动较短者，以便让高者再与高者计算）
 */
public class MaxArea {

    public static int maxArea(int[] height) {
        int left = 0 ;
        int r = height.length -1;
        int max  =0 ;
        while (left < r){
            max = Math.max(max,(r - left)*Math.min(height[left],height[r]));
            if (height[left] > height[r]){
                r --;
            }else {
                left ++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
}
