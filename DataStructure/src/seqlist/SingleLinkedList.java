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
    //头部添加元素
    public void addFirst (int data) {
        Node node = new Node(data);
        if (size != 0) {
            //已存在节点
            node.next = head;
        }
        head = node;
        size++;
    }
    //尾部添加元素
    public void addLast(int data) {

    }
    //在任意位置添加元素
    public void addIndex(int index, int data) {

    }

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

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(4);
        singleLinkedList.addLast(5);
        System.out.println(singleLinkedList);
    }
}
