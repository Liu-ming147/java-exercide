package oj;

/**
 * 链表中倒数第k个结点(牛客)
 */
public class GetValueK {
//    // 方法1
//    public ListNode FindKthToTail(ListNode head,int k) {
//        int length = 0;
//        ListNode listNode = head;
//        while (listNode != null) {
//            listNode = listNode.next;
//            length++;
//        }
//        if (length < k) {
//            return null;
//        }
//        for (int i = 0; i < length - k; i++) {
//            head = head.next;
//        }
//        return head;
//    }
    // 方法2：快慢指针
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode low = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            low = low.next;
            fast = fast.next;
        }
        return low;
    }
}
