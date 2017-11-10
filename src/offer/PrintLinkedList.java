package offer;

/**
 * Created by zhaoliang on 2017/11/10.
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */

import java.util.ArrayList;

public class PrintLinkedList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    ArrayList<Integer> lists = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            lists.add(listNode.val);
        }
        return lists;
    }
}
