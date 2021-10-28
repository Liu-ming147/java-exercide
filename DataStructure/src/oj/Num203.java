package oj;

/**
 * 移除链表元素
 */
public class Num203 {

//    public ListNode removeElements(ListNode head, int val) {
//        // 不带头节点方法
//        while (head != null && head.val == val) {
//            ListNode node = head;
//            head = head.next;
//            node.next = null;
//        }
//        if (head == null) {
//            return null;
//        }else {
//            ListNode prev = head;
//            while (prev.next != null) {
//                if (prev.next.val == val) {
//                    ListNode listNode = prev.next;
//                    prev.next = listNode.next;
//                    listNode.next = null;
//                }else {
//                    prev = prev.next;
//                }
//            }
//        }
//        return head;
//    }


//    public ListNode removeElements(ListNode head, int val) {
//        // 带头结点方法
//        ListNode dummyHead = new ListNode(-1);
//        dummyHead.next = head;
//        ListNode prev = dummyHead;
//        if (prev.next == null) {
//            return null;
//        }
//        while (prev.next != null) {
//            if (prev.next.val == val) {
//                prev.next = prev.next.next;
//            }else {
//                prev = prev.next;
//            }
//        }
//        return dummyHead.next;
//    }

    // 递归方法
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
