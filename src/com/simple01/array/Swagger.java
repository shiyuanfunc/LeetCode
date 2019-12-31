package com.simple01.array;

/**
 * 糖果贪心
 * 有一些糖果包，有一些孩子， 每个孩子都有期望的糖果数量，只有当糖果包里面的数量大于孩子的需求时，才算可以
 *  一个孩子只能拥有一个糖果包
 */
public class Swagger {

    /**
     *
     * @param swa  糖果包数组
     * @param child   孩子需求数组
     */
    public void soult(int[] swa, int[] child){
        int childNum = 0 ;
        int cookie = 0 ;
        int count = 0;

        while (childNum < child.length && cookie < swa.length){
            if (swa[cookie] >= child[childNum]){
                childNum++;
            }
            cookie++;
        }

        System.out.println(childNum);

    }
    public static void main(String[] args) {
        int[] cookie = new int[]{1,2,5,6,8,12};
        int[] child = new int[]{14,19,30,80,150,200};
        new Swagger().soult(cookie,child);
    }
}
