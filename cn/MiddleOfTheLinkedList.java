package cn;

/**
 * @author Gamigo
 * @create 2020/3/23 20:59
 * @description 876. 链表的中间结点
 * 注：传入参数head指向链表中第一个节点
 * 解题思路：快慢指针，快指针一次走两步，慢指针一次走一步。
 * 快指针走到头==null或者next==null，慢指针位置为中间节点
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }
}
