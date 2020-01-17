package com.normal.tree;

import com.common.TreeNode;
import com.simple01.tree.BinaryTree;

/**
 * @author Song Yinghui
 * @date 2020/1/17
 * @Version 1.0
 *
 *  判断两个数是否为相同的树
 */
public class SameTree {

    public static boolean isSameTree(TreeNode p , TreeNode q){

        if (p == null && q == null ){
            return true;
        }
        /**
         * 若 p q 其中一个为空，则判定为不等
         */
        if (p == null || q == null ){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,4,6,7,9};
        TreeNode treeNode = BinaryTree.buildTree(nums1, 0, nums1.length - 1);
        int[] nums2 = new int[]{1,2,4,6,8,9};
        TreeNode sourceTreeNode = BinaryTree.buildTree(nums2, 0, nums2.length - 1);

        System.out.println(isSameTree(treeNode, sourceTreeNode));

    }

}
