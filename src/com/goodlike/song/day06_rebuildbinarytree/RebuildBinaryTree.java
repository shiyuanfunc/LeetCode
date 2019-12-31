package com.goodlike.song.day06_rebuildbinarytree;

/**
 * @author Song Yinghui
 * @date 2019/1/24
 * @Version 1.0
 * @Desc 根据先序中序重建二叉树
 *
 * 先序 1 2 3 4 5 6
 * 中序 3 2 4 1 6 5
 */
public class RebuildBinaryTree {

    static class Node{
        public Node pre ;
        public Node next;
        public int data;

        public Node(){
        }

        public Node(Node pre, Node next, int data) {
            this.pre = pre;
            this.next = next;
            this.data = data;
        }
    }

    public void def(Node root, Node pre){

    }

    public void rebuild(){

    }
}
