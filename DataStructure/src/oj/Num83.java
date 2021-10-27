package oj;

/**
 * 删除排序链表中的重复元素
 */
public class Num83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(101);
        prev.next = head;
        ListNode cur = prev.next;
        while (cur != null) {
            if (prev.val != cur.val) {
                prev = prev.next;
            }else {
                prev.next = cur.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
