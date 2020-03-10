package com;

/**
 * @author Gamigo
 * @create 2020/3/9 20:56
 * @description 641. Design Circular Deque
 * 解题思路：使用建立双向循环链表，自定义节点Node类，注意头尾指针初始化。
 * 精妙。。。
 */

public class MyCircularDeque {

    private int number;
    private int count;
    private Node front;
    private Node rear;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {

        // 设置容量和计数
        this.number = k;
        this.count = 0;
        // 头尾均初始化为空
        this.front = null;
        this.rear = null;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (this.count == this.number) {
            return false;
        }
        count++;
        Node temp = new Node(value);
        temp.rear = this.front;
        this.front = temp;
        if (count == 1) {
            // 如果是第一个节点，rear指向temp
            this.rear = temp;
        } else {
            // 如果不是第一个节点，将原front的front指向现在的front。
            temp.rear.front = temp;
        }

        return true;

    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (this.count == this.number) {
            return false;
        }
        count++;
        Node temp = new Node(value);
        temp.front = this.rear;
        this.rear = temp;
        if (count == 1) {
            this.front = temp;
        } else {
            temp.front.rear = temp;
        }
        return true;

    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (this. count == 0) {
            return false;
        }
        count--;
        // 如果删除最后一个节点 front == rear == null;
        this.front = this.front.rear;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (this. count == 0) {
            return false;
        }
        count--;
        this.rear = this.rear.front;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (count == 0) {
            return -1;
        }
        return this.front.val;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (count == 0) {
            return -1;
        }
        return this.rear.val;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if (this.count == 0) {
            return true;
        }
        return false;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if (this.number == this.count) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyCircularDeque myCircularDeque = new MyCircularDeque(3);
        System.out.println(myCircularDeque.insertLast(1));
        System.out.println(myCircularDeque.insertLast(2));
        System.out.println(myCircularDeque.insertFront(3));
        System.out.println(myCircularDeque.insertFront(4));
        System.out.println(myCircularDeque.getRear());

    }
}

class Node {
    Node front;
    Node rear;
    int val;
    Node(int n) {
        this.val = n;
    }
}
/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
