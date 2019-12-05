package com.goodlike.song.day06_rebuildbinarytree;

/**
 * @author Song Yinghui
 * @date 2019/1/24
 * @Version 1.0
 * @Desc 根据先序中序重建二叉树
 */
public class RebuildBinaryTree {

    class BinaryTree{
        public BinaryTree(int data , BinaryTree leftChild , BinaryTree rightChild){
            this.data = data ;
            this.leftChild = leftChild ;
            this.rightChild = rightChild ;
        }
        private int data;
        private BinaryTree leftChild ;
        private BinaryTree rightChild ;
    }

    public void rebuildBinaryTree(int[] preList , int[] centerList){
        if (preList != null && preList.length > 0){
            BinaryTree root = new BinaryTree(preList[0], null , null);

        }
    }
    public static void main(String[] args) {

    }
}
