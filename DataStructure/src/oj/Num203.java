package oj;

public class Num203 {
    //移除链表元素
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            ListNode node = head;
            head = head.next;
            node.next = null;
        }
        if (head == null) {
            return null;
        }else {
            ListNode prev = head;
            while (prev.next != null) {
                if (prev.next.val == val) {
                    ListNode listNode = prev.next;
                    prev.next = listNode.next;
                    listNode.next = null;
                }else {
                    prev = prev.next;
                }
            }
        }
        return head;
    }
}
