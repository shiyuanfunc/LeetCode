package com.simple01.tree;

import com.TreeNode;

/**
 * @author Song Yinghui
 * @date 2019/12/19
 * @Version 1.0
 */
public class BinaryTree {


    /**
     * 有序数组构建一个二叉搜索树
     * @param nums
     * @param left
     * @param right
     * @return
     */
    public TreeNode buildTree(int[] nums, int left , int right){
        if (left > right){
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, left, mid -1);
        root.right = buildTree(nums, mid+1, right);
        return root;
    }

    /**
     * 中序遍历
     * @param root
     */
    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    /**
     * 先序遍历
     * @param root
     */
    public void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};

        BinaryTree binaryTree = new BinaryTree();
        TreeNode node = binaryTree.buildTree(nums, 0, nums.length - 1);
        //binaryTree.inOrder(node);
        binaryTree.preOrder(node);
    }
}
