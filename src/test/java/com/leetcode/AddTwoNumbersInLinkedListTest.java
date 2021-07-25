package com.leetcode;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AddTwoNumbersInLinkedListTest {


    @ParameterizedTest(name = "Reverse sum of {0} , {1} = {2}")
    @CsvSource({
            "001,002,003",
            "123,127,2401",
            "051,051,003",
            "999,100,0001",
    })
    void addTwoNumbers(String first, String second, String expectedResult){
        AddTwoNumbersInLinkedList calculator = new AddTwoNumbersInLinkedList();
        System.out.println(String.format("Running test for {%s}, {%s}, {%s}", first, second, expectedResult));

        char [ ] firstNumberArray = first.toCharArray();
        ListNode l1 = getNumber(first);
        ListNode l2 = getNumber(second);
        ListNode sum = getNumber(expectedResult);
        boolean result  = compareLists(sum, calculator.addTwoNumbers(l1,l2));
        if(!result){
            printList(l1);
            printList(l2);
            printList(calculator.addTwoNumbers(l1,l2));
        }
        assertTrue(result, "sum is incorrect");



    }

    private ListNode getNumber(String s){
        ListNode n = new ListNode();
        ListNode head = new ListNode();
        head = n;
        int i = 0;
        while(i<s.length()){
            head.next = new ListNode(Character.getNumericValue(s.charAt(i)));
            head = head.next;
            i++;
        }
        return n.next;
    }

    @Test
    @DisplayName("Simple Sum - 789 + 211")
    void addTwoNumbers() {
        AddTwoNumbersInLinkedList calculator = new AddTwoNumbersInLinkedList();
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(7);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);

        ListNode sum = new ListNode(0);
        sum.next = new ListNode(0);
        sum.next.next = new ListNode(0);
        sum.next.next.next = new ListNode(1);
        assertTrue(compareLists(sum, calculator.addTwoNumbers(l1,l2)), "sum is incorrect");
    }




    private void printList(ListNode listNode) {
        StringBuffer sb = new StringBuffer();
        while(listNode !=null){
            sb.append(listNode.val);
            listNode = listNode.next;
        }
        System.out.println("number is :"+sb.toString());

    }

    private boolean compareLists(ListNode l1, ListNode l2){

        while(l1 != null && l2 !=null ){
            if(l1.val != l2.val)
                return false;

            l1 = l1.next;
            l2 = l2.next ;
        }

        // If linked lists are identical, then 'a' and 'b' must
        // be null at this point.
        return (l1 == null && l2 == null);
    }

}