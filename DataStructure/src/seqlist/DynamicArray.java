package seqlist;

import java.util.Arrays;

public class DynamicArray {
    // elementData是存储元素的数组
    private int[] elementData;
    // size表示数组中存储的元素个数
    private int size;

    public DynamicArray() {
        this.elementData = new int[10];
    }

    public DynamicArray(int size) {
        elementData = new int[size];
    }

    /**
     * 判断index是否合法
     * @param index 索引
     * @return 是否合法
     */
    private boolean rangeCheck(int index) {
        if (index < 0 || index >= size) {
            System.err.println("当前index非法！");
            return false;
        }
        return true;
    }

    /**
     * 头部插入元素
     * @param data 元素的值
     */
    public void addFirst(int data) {
        if (size == elementData.length) {
            grow();
        }
        for (int i = size; i > 0; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[0] = data;
        size++;
    }

    /**
     * 尾部插入元素
     * @param data 元素的值
     */
    public void addLast(int data) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = data;
        size++;
    }

    /**
     * 在数组的index处插入元素
     * @param index 索引
     * @param data 元素的值
     */
    public void addIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("index非法，无法进行插入");
            return;
        }
        // 判断当前数组是否已满
        if (size == elementData.length) {
            grow();
        }
        if (index == 0) {
            addFirst(data);
        }else if (index == size) {
            addLast(data);
        }else {
            for (int i = size; i > index; i--) {
                elementData[i] = elementData[i - 1];
            }
            elementData[index] = data;
            size++;
        }
    }

    /**
     * 扩容数组
     */
    public void grow() {
        int oldLength = elementData.length;
        int newLength = oldLength << 1;
        //将原数组搬到新数组
        Arrays.copyOf(elementData, newLength);
    }

    public int getSize() {
        return size;
    }

    /**
     * 获取索引index对应的值
     * @param index 索引
     * @return 返回索引index对应的值
     */
    public int get(int index) {
        if (rangeCheck(index)) {
            return elementData[index];
        }
        return -1;
    }

    /**
     * 判断数组是否包含data这个值
     * @param data 要判断的值
     * @return 是否包含
     */
    public boolean contains(int data) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == data) {
                return true;
            }
        }
        return false;
    }

    /**
     * 删除索引index的元素
     * @param index 索引
     */
    public void remove(int index) {
        if (rangeCheck(index)) {
            for (int i = index; i < size - 1; i++) {
                elementData[i] = elementData[i + 1];
            }
        }
        size--;
        elementData[size] = 0;
    }

    /**
     * 按值删除线性表中等于value的元素
     * @param value 要删除的值
     */
    public void removeValue(int value) {
        for (int i = 0; i < size; i++) {
            while (elementData[i] == value && i < value) {
                remove(i);
            }
        }
    }

    /**
     * 将索引index处的元素修改为新值newData
     * @param index 索引
     * @param newData 新值
     * @return 修改前的值
     */
    public int set(int index,int newData) {
        if (rangeCheck(index)) {
            int oldValue = elementData[index];
            elementData[index] = newData;
            return oldValue;
        }
        return -1;
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addFirst(4);
        dynamicArray.addFirst(4);
        dynamicArray.addLast(5);
        dynamicArray.addLast(5);
        dynamicArray.addIndex(1, 3);
        //输出[4, 3, 4, 5, 5]
        System.out.println(dynamicArray);
        dynamicArray.remove(1);
        //输出[4, 4, 5, 5]
        System.out.println(dynamicArray);
        dynamicArray.removeValue(4);
        //输出[5, 5]
        System.out.println(dynamicArray);
        dynamicArray.set(0, 6);
        //输出[6, 5]
        System.out.println(dynamicArray);
        //输出true
        System.out.println(dynamicArray.contains(5));
        //输出5
        System.out.println(dynamicArray.get(1));
        //输出2
        System.out.println(dynamicArray.getSize());
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += elementData[i];
            if (i != size - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
