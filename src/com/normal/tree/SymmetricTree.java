package com.normal.tree;

import com.common.TreeNode;
import com.simple01.tree.BinaryTree;

/**
 * @author Song Yinghui
 * @date 2020/1/17
 * @Version 1.0
 *
 *  判断一个树是否为镜像对称
 */
public class SymmetricTree {

    public static boolean symmetricTree(TreeNode root){
        return isMirror(root,root);
    }

    public static boolean isMirror(TreeNode node1 , TreeNode node2){
        if (node1 == null && node2 == null ){
            return true;
        }
        if (node1 == null || node2 == null){
            return false;
        }
        return (node1.val == node2.val) && isMirror(node1.left, node2.right) && isMirror(node1.right,node2.left);
    }

    public static void main(String[] args) {

//        int[] nums = new int[]{1,2,2,3,4,4,3};
//        TreeNode treeNode = BinaryTree.buildTree(nums, 0, nums.length - 1);
//        System.out.println(symmetricTree(treeNode));
    }
}
