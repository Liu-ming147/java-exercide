package seqlist;

class Node {
    //存储元素
    int data;
    //存储下一个节点地址
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class SingleLinkedList {
    //存储的元素个数
    private int size;
    //头结点
    private Node head;
    //判断index的合法性
    private boolean rangeCheck(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        return true;
    }

    /**
     * 在头部添加元素
     * @param data 元素值
     */
    public void addFirst (int data) {
        Node node = new Node(data);
        if (size != 0) {
            //已存在节点
            node.next = head;
        }
        head = node;
        size++;
    }

    /**
     * 在index处添加元素
     * @param index 索引
     * @param data 元素值
     */
    public void addIndex(int index, int data) {
        //判断index的合法性
        if (index < 0 || index > size) {
            System.err.println("add index illegal!");
            return;
        }
        if (index == 0) {
            //在头部插入
            addFirst(data);
            return;
        }
        //说明此时index在中间位置
        Node node = new Node(data);
        //prev为待插入元素的前驱结点
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        node.next = prev.next;
        prev.next = node;
        size++;
    }
    /**
     * 在尾部添加元素
     * @param data 元素值
     */
    public void addLast(int data) {
        //即在末尾size处添加元素，直接调用addIndex
        addIndex(size, data);
    }

    /**
     * 查询index位置节点处的数据
     * @param index 索引
     * @return index出的数据值
     */
    public int get(int index) {
        if (rangeCheck(index)) {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            int data = node.data;
            return data;
        }else {
            System.err.println("get index illegal!");
            return -1;
        }
    }

    /**
     * 修改index位置处的元素
     * @param index 索引
     * @param data 修改后的值
     * @return 修改前的值
     */
    public int set(int index, int data) {
        if (rangeCheck(index)) {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            int oldValue = node.data;
            node.data = data;
            return oldValue;
        }else {
            System.err.println("set index illegal!");
            return -1;
        }
    }

    /**
     * 判断链表中是否包含data
     * @param data 要判断的值
     * @return 是否包含
     */
    public boolean contains(int data) {
        Node node = head;
        while (node != null) {
            if (node.data == data) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /**
     * 删除第一个节点
     */
    public void removeFirst() {
        Node node = head;
        head = head.next;
        node.next = null;
        size--;
    }

    /**
     * 删除index位置处的节点
     * @param index 索引
     */
    public void removeIndex(int index) {
        if (rangeCheck(index)) {
            if (index == 0) {
                removeFirst();
            }else {
                // prev为待删除元素的前驱结点
                Node prev = head;
                for (int i = 0; i < index - 1; i++) {
                    prev = prev.next;
                }
                // node即为待删除节点
                Node node = prev.next;
                // 链接前驱结点和后继节点
                prev.next = node.next;
                // 将当前节点的next引用置为空
                node.next = null;
                size--;
            }
        }
    }

    /**
     * 删除链表中指定元素的第一个节点
     * @param data 待删除元素值
     */
    public void removeValueOnce(int data) {
        //先找到待删除元素的节点
        //先判断是不是头结点
        if (head.data == data) {
            //删除头结点
            removeFirst();
        } else {
            //此时要删除的节点就不是头结点
            //prev为待删除节点的前驱节点
            Node prev = head;
            while (prev.next != null) {
                if (prev.next.data == data) {
                    //node为待删除节点
                    Node node = prev.next;
                    prev.next = node.next;
                    node.next = null;
                    size --;
                    break;
                }else {
                    //此时prev不是待删除节点的前驱结点，继续寻找下一个
                    prev = prev.next;
                }
            }
        }
    }

    /**
     * 删除值为data的所有节点
     * @param data 待删除元素的值
     */
    public void removeAllValue(int data) {
        //先判断待删除节点是不是第头节点
        while (head != null && head.data == data) {
            Node node = head;
            head = head.next;
            node.next = null;
            size--;

        }
        //此时待删除节点不是头结点
        if (head == null) {
            // 此时链表中全是带删除的节点，已全部删除
            return;
        }else {
            // 此时头结点处理完毕，且链表不为空，判断后续节点
            // prev为待删除元素的前驱结点
            Node prev = head;
            while (prev.next != null) {
                if (prev.next.data == data) {
                    //node为待删除节点
                    Node node = prev.next;
                    prev.next = node.next;
                    node.next = null;
                    size--;
                }else {
                    //此时prev不是待删除元素的前驱结点
                    prev = prev.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addLast(5);
        singleLinkedList.addIndex(2, 1);
        // 2, 2, 1, 1, 2, 5
        System.out.println(singleLinkedList);
        singleLinkedList.removeAllValue(2);
        // 1, 1, 5
        System.out.println(singleLinkedList);
    }

    @Override
    public String toString() {
        String ret = "";
        Node node = head;
        while (node != null) {
            ret += node.data + "->";
            //继续访问下一个节点
            node = node.next;
        }
        ret += "NULL";
        return ret;
    }
}
