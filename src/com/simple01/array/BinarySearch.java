package com.simple01.array;

public class BinarySearch {

    public int findIndex(int left , int right, int target , int[] nums){

        int mid = (left + right) / 2 ;

        if (nums[mid] == target){
            return mid;
        }
        if (left == right){
            return -1;
        }
        if (nums[mid] > target){
            return findIndex(left,mid-1,target,nums);
        }
        if (nums[mid] < target){
            return findIndex(mid+1,right,target,nums);
        }
        return -1;
    }

    public int findIndexWhile(int[] nums, int n,int target){
        int left = 0 ;
        int right = n ;
        while (left <= right){
            int mid = (left + right) / 2 ;
            if (nums[mid] == target ){
                return mid;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,6,8,9,10,11};
        BinarySearch binarySearch = new BinarySearch();
//        System.out.println(binarySearch.findIndex(0, nums.length-1, 11, nums));

        System.out.println(binarySearch.findIndexWhile(nums, nums.length-1, 8));
    }
}
