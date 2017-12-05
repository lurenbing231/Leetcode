package offer;

/**
 * Created by zhaoliang on 2017/12/1.
 * 两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，
 * 到达第k个节点。然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了。
 */
public class ReciprocalKNode_2 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) return null;
        ListNode first = head;
        ListNode last = head;
        for (int i = 0; i < k; i++) {
            if (last.next == null) {
                return null;
            } else {
                last = last.next;
            }
        }
        while (last.next != null) {
            first = first.next;
            last = last.next;
        }
        return first;
    }
}
