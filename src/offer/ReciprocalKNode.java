package offer;

/**
 * Created by zhaoliang on 2017/12/1.
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class ReciprocalKNode {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode result;
    private int r = 0;
    private int x;

    public ListNode FindKthToTail(ListNode head, int k) {
        if (k == 0 || head == null) return null;
        x = k;
        FindKthToTail(head);
        return result;
    }

    private void FindKthToTail(ListNode root) {
        if (root.next == null) {
            r = 1;
            if (x == r) {
                result = root;
            }
            return;
        }
        FindKthToTail(root.next);
        if (x == r + 1) {
            result = root;
        }
        r++;
    }
}
