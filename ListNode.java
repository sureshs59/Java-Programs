package com.example.stream;

/**
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode(){

    }
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public ListNode addTwoNumbers(
            ListNode l1,
            ListNode l2
    ) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
               int x = l1 != null ? l1.val : 0;
               int y = l2 != null ? l2.val : 0;

               int sum = x +y + carry;
               carry = sum / 10;

               curr.next = new ListNode(sum % 10);
               curr = curr.next;
               l1 = l1 != null ? l1.next : null;
               l2 = l2 != null ? l2.next : null;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);

        ListNode l2 = new ListNode(2);

    }

}
