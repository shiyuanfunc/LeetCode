package com.simple01;

import com.goodlike.song.AddTwoNumber;

/**
 * @author Song Yinghui
 * @date 2019/12/4
 * @Version 1.0
 *  删除链表的倒数第N个节点
 */
public class RemoveNthFromEnd {
    public static AddTwoNumber.ListNode removeNthFromEnd(AddTwoNumber.ListNode head, int n) {
        if (head == null ) return null;
        AddTwoNumber.ListNode tmp = head;
        AddTwoNumber.ListNode tmp2 = head;
        int count = 0;
        int size = 0;
        while (tmp2 != null){
            size ++;
            tmp2 = tmp2.next;
        }
        if (size == n){
            return head.next;
        }
        while (tmp != null ){
            count++;
            if (count == (size - n)){
                if (tmp.next != null){
                    tmp.next = tmp.next.next;
                }else {
                    tmp.next = null;
                }
                break;
            }else
                tmp = tmp.next;
        }
        return head;
    }

    public static void main(String[] args) {

        AddTwoNumber addTwoNumber = new AddTwoNumber();
        AddTwoNumber.ListNode listNode = new AddTwoNumber.ListNode(1);
        /*listNode.next = new AddTwoNumber.ListNode(2);
        listNode.next.next = new AddTwoNumber.ListNode(3);
        listNode.next.next.next = new AddTwoNumber.ListNode(4);
        listNode.next.next.next.next = new AddTwoNumber.ListNode(5);*/

        AddTwoNumber.ListNode listNode1 = removeNthFromEnd(listNode, 1);
        while (listNode1 != null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }
}
