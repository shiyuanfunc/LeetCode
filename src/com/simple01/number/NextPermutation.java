package com.simple01.number;

/**
 * @author Song Yinghui
 * @date 2019/12/10
 * @Version 1.0
 * <p>
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * <p>
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * <p>
 * 必须原地修改，只允许使用额外常数空间。
 * <p>
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class NextPermutation {


    public static void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0) {
                reverse(nums, 0, nums.length - 1);
                printArray(nums);
                return;
            }
            if (nums[i] > nums[i - 1]) {
                // 将递增序列逆序
                reverse(nums, i, nums.length - 1);
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > nums[i - 1]) {
                        swap(nums, j, i - 1);
                        printArray(nums);
                        return;
                    }
                }
            }
        }
    }

    // 数组反转
    private static void reverse(int[] nums, int begin, int end) {
        while (begin < end) {
            swap(nums, begin++, end--);
        }
    }

    // 交换
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void printArray(int[] nums){
        for(int i: nums){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        nextPermutation(new int[]{1, 3, 2});
    }
}
