package oj;

import java.util.List;

/**
 * 链表的回文结构
 */
public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        ListNode B = A;
        ListNode temp = A;
        while (B.next != null && B.next.next != null) {
            temp = temp.next;
            B =B.next.next;
        }
        B = temp.next;
        ListNode prev = null;
        while (B != null) {
            ListNode node = B.next;
            B.next = prev;
            prev = B;
            B = node;
        }
        while (prev != null) {
            if (prev.val != A.val) {
                return false;
            }else {
                prev = prev.next;
                A = A.next;
            }
        }
        return true;
    }
}
