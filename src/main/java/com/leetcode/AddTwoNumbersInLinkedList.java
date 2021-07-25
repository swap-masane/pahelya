package com.leetcode;

/**
 * Leetcode Problem : https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbersInLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

        // step 1 define elements to hold results
        ListNode sum = new ListNode(0);
        ListNode head = sum;

        int carry = 0;

        // iterate over the lists and do basic arthmatic
        while (l1!=null && l2!=null){
            int val = l1.val + l2.val + carry;
            carry = val / 10;
            val = val % 10;
            head.next = new ListNode(val);
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        // if list 1 still has elements
        while (l1!=null){
            int val =  l1.val + carry;;
            carry = val / 10;
            val =val %10;
            head.next = new ListNode(val);
            head = head.next;
            l1 = l1.next;
        }

        // if list 2 still has elemenents
        while(l2 !=null){
            int val = l2.val +carry;
            carry = val / 10;
            val = val %10;
            head.next = new ListNode(val);
            head = head.next;
            l2 = l2.next;
        }

        if(carry != 0){
            head.next = new ListNode(carry);
            head = head.next;
        }

        return sum.next;
    }

}
