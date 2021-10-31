package oj;

/**
 * 面试题 02.04. 分割链表
 */
public class Num0204 {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(-1);
        ListNode bigHead = new ListNode(-1);
        ListNode smallTail = smallHead;
        ListNode bigTail = bigHead;
        while (head != null) {
            if (head.val < x) {
                smallTail.next = head;
                smallTail = smallTail.next;
            }else {
                bigTail.next = head;
                bigTail = bigTail.next;
            }
            head = head.next;
        }
        bigTail.next = null;
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}
