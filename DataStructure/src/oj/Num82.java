package oj;

/**
 * 删除排序链表中的重复元素 II
 */
public class Num82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(101);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode cur = prev.next;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                return dummyHead.next;
            }
            if (cur.val != next.val) {
                prev = prev.next;
                cur = cur.next;
            }else {
                while (next != null && cur.val == next.val) {
                    next = next.next;
                }
                prev.next = next;
                cur = next;
            }
        }
        return dummyHead.next;
    }
}
