package com.goodlike.song.simple01;

/**
 * @author Song Yinghui
 * @date 2019/12/4
 * @Version 1.0
 * 给定坐标间最大面积
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
