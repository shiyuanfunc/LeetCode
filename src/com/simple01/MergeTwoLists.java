package com.simple01;


/**
 * @author Song Yinghui
 * @date 2019/12/5
 * @Version 1.0
 *
 * . 合并两个有序链表
 */
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tmp = null;
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        if (l1.val > l2.val){
            tmp = new ListNode(l2.val);
            l2 = l2.next;
        }else {
            tmp = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode result = tmp;
        while (l1 != null || l2 != null ){

            while (l1 == null && l2 != null){
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }
            while (l2 == null && l1 != null){
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            }

            if (l1 != null && l2 != null){
                if (l1.val > l2.val){
                    tmp.next = new ListNode(l2.val);
                    l2 = l2.next;
                }else {
                    tmp.next = new ListNode(l1.val);
                    l1 = l1.next;
                }
                tmp = tmp.next;
            }
        }
        return result;
    }

    /**
     * 别人的答案
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }


    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
//        listNode.next = new AddTwoNumber.ListNode(2);
//        listNode.next.next = new AddTwoNumber.ListNode(3);
//        listNode.next.next.next = new AddTwoNumber.ListNode(4);
//        listNode.next.next.next.next = new AddTwoNumber.ListNode(5);

        ListNode listNode2 = new ListNode(2);
//        listNode2.next = new AddTwoNumber.ListNode(2);
//        listNode2.next.next = new AddTwoNumber.ListNode(3);
//        listNode2.next.next.next = new AddTwoNumber.ListNode(5);
//        listNode2.next.next.next.next = new AddTwoNumber.ListNode(6);

        ListNode listNode1 = mergeTwoLists(listNode, listNode2);
        while (listNode1 != null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }
}
