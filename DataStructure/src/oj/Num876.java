package oj;

public class Num876 {
    // 链表的中间结点
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode listNode = head;
        while (listNode != null) {
            listNode = listNode.next;
            count++;
        }
        int mid = count / 2;
        for (int i = 0; i < mid; i++) {
            head = head.next;
        }
        return head;
    }
}
