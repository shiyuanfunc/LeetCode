package com.goodlike.song.day03;

/**
 * @author Song Yinghui
 * @date 2019/1/21
 * @Version 1.0
 * @Desc 从规则的二维数组中检索数字
 * 左到右 数值递增
 * 上到下 数值递增
 */
public class FindNumber {
    /**
     *  从0，0开始检索
     */
    public Boolean findNumber(int[][] a , int target){
        int row = a.length ;
        int column = a[0].length;
        for (int start_row = 0;start_row < row;start_row ++ ){
            for (int start_column = 0;start_column < column;start_column++){
                if (a[start_row][start_column] == target){
                    System.out.println(start_row+"   "+ start_column);
                    return true ;
                }
                if (target < a[start_row][start_column]){
                    column = start_column ;
                    break;
                }
            }
        }
        return false ;
    }

    /**
     * 从右上角开始检索
     * @param a
     * @param target
     */
    public void findNumber2(int[][]a ,int target){
        int row = a.length ;
        int column = a[0].length;

        for (int start_row = 0 ; start_row < row ; start_row ++){
            for ( int start_column = column-1 ; start_column >= 0 ; start_column --){
                if (target == a[start_row][start_column]){
                    System.out.println(start_row+"  "+start_column);
                    return;
                }
                if (target < a[start_row][start_column]){
                    column = start_column ;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,3,5,7},{3,5,7,9},{5,7,9,11},{7,9,11,13}};
        FindNumber findNumber = new FindNumber();
        findNumber.findNumber2(a, 1);
    }
}
