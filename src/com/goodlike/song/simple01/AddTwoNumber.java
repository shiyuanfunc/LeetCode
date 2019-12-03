package com.goodlike.song.simple01;

/**
 * @author Song Yinghui
 * @date 2019/11/28
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumber {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;
        List<Integer> list = new ArrayList<>();
        int a = 0;
        while (l1 != null || l2 != null) {
            int num = a;
            if (l1 != null) {
                num += l1.val;
            }
            if (l2 != null) {
                num += l2.val;
            }
            list.add(num % 10);
            a = num / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (a > 0){
            list.add(a);
        }
        ListNode result = null;
        for (int i= 0; i < list.size(); i++) {
            if (result == null) {
                result = new ListNode(list.get(i));
                continue;
            }
            ListNode tmp = result;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new ListNode(list.get(i));
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);


        ListNode node = addTwoNumbers(node1, node2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
