package oj;

/**
 * 环形链表
 */
public class Num141 {
    public boolean hasCycle(ListNode head) {
        ListNode low = head, fast = head;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
            if (low == fast) {
                return true;
            }
        }
        return false;
    }
}
