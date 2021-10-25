package oj;

public class Num206 {
    //反转链表
    public ListNode reverseList(ListNode head) {
        // prev为当前节点的前驱结点
        ListNode prev = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }
}
