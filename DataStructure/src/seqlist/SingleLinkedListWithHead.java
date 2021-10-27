package seqlist;

/**
 * 带头的单链表
 */
public class SingleLinkedListWithHead {
    private Node dummyHead = new Node(-1);
    private int size;

    /**
     * 在index处添加元素
     * @param index 索引
     */
    public void addIndex(int index, int data) {
        if (index <0 || index > size) {
            System.err.println("index illegal!");
            return;
        }
        Node node = new Node(data);
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    /**
     * 头部添加元素
     * @param data 待插入元素的值
     */
    public void addFirst(int data) {
        addIndex(0, data);
    }

    /**
     * 尾部插入元素
     * @param data 待插入元素的值
     */
    public void addLast(int data) {
        addIndex(size, data);
    }

    /**
     * 删除index位置处的元素
     * @param index 索引
     */
    public void removeIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("index illegal!");
            return;
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }

    /**
     * 删除头部元素
     */
    public void removeFirst() {
        removeIndex(0);
    }

    /**:
     * 删除尾部元素
     */
    public void removeLast() {
        removeIndex(size);
    }

    @Override
    public String toString() {
        String ret = "";
        Node node = dummyHead.next;
        for (int i = 0; i < size; i++) {
            ret += node.data + "->";
            node = node.next;
        }
        ret += "NULL";
        return ret;
    }

    public static void main(String[] args) {
        SingleLinkedListWithHead withHead = new SingleLinkedListWithHead();
        withHead.addFirst(1);
        withHead.addLast(2);
        withHead.addLast(3);
        withHead.addIndex(0, 4);
        // 4, 1, 2, 3
        System.out.println(withHead);
        withHead.removeIndex(0);
        withHead.removeIndex(1);
        // 1, 3
        System.out.println(withHead);
    }
}
