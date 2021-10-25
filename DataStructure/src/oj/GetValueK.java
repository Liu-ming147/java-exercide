package oj;

public class GetValueK {
    // 链表中倒数第k个结点(牛客)
    public ListNode FindKthToTail(ListNode head,int k) {
        int length = 0;
        ListNode listNode = head;
        while (listNode != null) {
            listNode = listNode.next;
            length++;
        }
        if (length < k) {
            return null;
        }
        for (int i = 0; i < length - k; i++) {
            head = head.next;
        }
        return head;
    }
}
