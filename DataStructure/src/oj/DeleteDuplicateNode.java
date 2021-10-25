package oj;

public class DeleteDuplicateNode {
    // 删除链表中重复的节点（牛客）
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        // 设置一个头结点
        ListNode head = new ListNode(0);
        head.next = pHead;
        // prev指向当前确定的不重复的节点
        ListNode prev = head;
        // last向后搜索重复节点
        ListNode last = head.next;
        while (last != null) {
            if (last.next != null && last.val == last.next.val) {
                while (last.next != null && last.val == last.next.val) {
                    last = last.next;
                }
                // 连接下一个不重复的节点
                prev.next = last.next;
            }else {
                prev = prev.next;
            }
            last = last.next;
        }
        return head.next;
    }
}
