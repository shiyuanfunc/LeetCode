package com.normal.array;

import com.common.TreeNode;

/**
 * @author Song Yinghui
 * @date 2020/1/18
 * @Version 1.0
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNum {

    static TreeNode resolve(TreeNode num1, TreeNode num2){
        int carry = (num1.val + num2.val) / 10 ;
        int temp = (num1.val + num2.val) % 10 ;
        TreeNode head = new TreeNode(temp);
        TreeNode result = head ;
        num1 = num1.left ;
        num2 = num2.left ;
        while (num1 != null && num2!= null){
            int tmp = (num1.val + num2.val + carry) % 10 ;
            carry = (num1.val + num2.val + carry) / 10 ;
            result.left = new TreeNode(tmp);
            result = result.left ;
            num1 = num1.left ;
            num2 = num2.left ;
        }
        while (num1 != null ){
            int tmp = (carry + num1.val) % 10 ;
            carry = (carry+num1.val) / 10 ;
            result.left = new TreeNode(tmp);
            num1 = num1.left ;
        }
        while (num2 != null ){
            int tmp = (carry + num2.val) % 10 ;
            carry = (carry+num2.val) / 10 ;
            result.left = new TreeNode(tmp);
            num2 = num2.left ;
        }
        if (carry != 0){
            result.left = new TreeNode(1);
        }
        return head ;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        TreeNode head1 = root1;
        head1.left = new TreeNode(4);
        head1.left.left = new TreeNode(3);

        TreeNode root2 = new TreeNode(5);
        TreeNode root = root2 ;
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(4);
        TreeNode resolve = resolve(root1, root2);
        while (resolve != null ){
            System.out.println(resolve.val);
            resolve = resolve.left ;
        }
    }
}
