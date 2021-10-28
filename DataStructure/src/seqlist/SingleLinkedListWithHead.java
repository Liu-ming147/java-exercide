package seqlist;

/**
 * 带头的单链表
 */
public class SingleLinkedListWithHead {
    private Node dummyHead = new Node(-1);
    private int size;
    //判断index的合法性
    private boolean rangeCheck(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        return true;
    }

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

    /**
     * 删除尾部元素
     */
    public void removeLast() {
        removeIndex(size);
    }

    /**
     * 删除链表中指定元素的第一个节点
     * @param data 待删除元素值
     */
    public void removeValueOnce(int data) {
        Node prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.data == data) {
                prev.next = prev.next.next;
                size--;
                break;
            }
            prev = prev.next;
        }
    }

    /**
     * 删除值为data的所有节点
     * @param data 待删除元素的值
     */
    public void removeAllValue(int data) {
        Node prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.data == data) {
                prev.next = prev.next.next;
                size--;
            }else {
                prev = prev.next;
            }
        }
    }

    /**
     * 查询index位置节点处的数据
     * @param index 索引
     * @return index处的数据值
     */
    public int get(int index) {
        if (!rangeCheck(index)) {
            System.err.println("index illegal!");
            return -1;
        }
        Node head = dummyHead.next;
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        return head.data;
    }

    /**
     * 修改index位置处的元素
     * @param index 索引
     * @param data 修改后的值
     * @return 修改前的值
     */
    public int set(int index, int data) {
        if (!rangeCheck(index)) {
            System.err.println("index illegal!");
            return -1;
        }
        Node node = dummyHead.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        int oldData = node.data;
        node.data = data;
        return oldData;
    }

    /**
     * 判断链表中是否包含data
     * @param data 要判断的值
     * @return 是否包含
     */
    public boolean contains(int data) {
        Node node = dummyHead.next;
        while (node != null) {
            if (node.data == data) {
                return true;
            }
            node = node.next;
        }
        return false;
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
        System.out.println(withHead.get(0));
        System.out.println(withHead.set(0, 2));
        // 2, 3
        System.out.println(withHead);
        withHead.addLast(2);
        withHead.addLast(2);
        withHead.addLast(4);
        withHead.addLast(2);
        // 2, 3, 2, 2, 4, 2
        System.out.println(withHead);
        withHead.removeValueOnce(2);
        // 3, 2, 2, 4, 2
        System.out.println(withHead);
        withHead.removeAllValue(2);
        // 3, 4
        System.out.println(withHead);
    }
}
