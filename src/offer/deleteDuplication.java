package offer;

import org.junit.Test;

public class deleteDuplication {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) return pHead;
        ListNode last = pHead;
        ListNode start = new ListNode(-1);
        start.next=pHead;
        int cns = 0;
        ListNode tmp = start;
        while (last.next != null) {
            if (last.next.val == tmp.next.val) {
                cns++;
            } else if (cns > 0) {
                cns=0;
                tmp.next = last.next;
            } else {
                tmp = last;
            }
            last=last.next;
        }
        if(cns>0) tmp.next=null;
        return start.next;
    }

    @Test
    public void test() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(1);
        listNode.next.next.next.next = new ListNode(1);
        listNode.next.next.next.next.next = new ListNode(1);
        listNode.next.next.next.next.next.next = new ListNode(1);
        deleteDuplication(listNode);
    }
}
