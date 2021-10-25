package oj;

public class ListSegmentation {
    // 链表分割(牛客）
    public ListNode partition(ListNode pHead, int x) {
        // 新建两个链表，less存放比x小的节点，more存放不小于的节点
        ListNode less = new ListNode(-1);
        ListNode more = new ListNode(-1);
        ListNode lessHead = less;
        ListNode moreHead = more;
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        while (pHead != null) {
            if (pHead.val < x) {
                lessHead.next = new ListNode(pHead.val);
                lessHead = lessHead.next;
            }else {
                more.next = new ListNode(pHead.val);
                more = more.next;
            }
            pHead = pHead.next;
        }
        // 将两个链表进行拼接
        lessHead.next = moreHead.next;
        // 返回less链表
        return less.next;
    }
}
