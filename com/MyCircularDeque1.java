package com;

/**
 * @author Gamigo
 * @create 2020/3/9 21:11
 * @description
 */
public class MyCircularDeque1 {
    private Node head;
    private Node tail;
    private int size;
    private int cap;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque1(int k) {
        cap = k;
        size = 0;
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        head.prev = tail;
        tail.prev = head;
        tail.next = head;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int val) {
        if (isFull()) {
            return false;
        }
        Node node = new Node(val);
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
        ++size;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int val) {
        if (isFull()) {
            return false;
        }
        Node node = new Node(val);
        node.prev = tail.prev;
        tail.prev.next = node;
        node.next = tail;
        tail.prev = node;
        ++size;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        head.next.next.prev = head;
        head.next = head.next.next;
        --size;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
        --size;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return head.next.val;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return tail.prev.val;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == cap;
    }

    private class Node {
        Node prev;
        Node next;
        int val;

        public Node(int _val) {
            val = _val;
        }
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
