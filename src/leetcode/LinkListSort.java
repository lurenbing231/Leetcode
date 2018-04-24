package leetcode;

import org.junit.Test;

public class LinkListSort {
    private class linkNode {
        int val;
        linkNode next;

        public linkNode(int val) {
            this.val = val;
        }
    }

    private linkNode getsort(linkNode cin) {
        if (cin == null) return null;
        linkNode end = cin;
        while (end.next != null) {
            end = end.next;
        }
        twopoints(cin, end);
        return cin;
    }

    private void twopoints(linkNode begin, linkNode end) {
        if (begin == null || end == null || begin == end) {
            return;
        }
        int flag = begin.val;
        linkNode pre = begin;
        linkNode last = begin.next;
        while (last != end.next && last != null) {
            if (last.val < flag) {
                pre = pre.next;
                int tmp = pre.val;
                pre.val = last.val;
                last.val = tmp;
            }
            last = last.next;
        }
        int tmp = begin.val;
        begin.val = pre.val;
        pre.val = tmp;
        twopoints(begin, pre);
        twopoints(pre.next, end);
    }

    @Test
    public void test() {
        linkNode head = new linkNode(5);
        linkNode l1 = new linkNode(2);
        linkNode l2 = new linkNode(5);
        linkNode l3 = new linkNode(3);
        linkNode l4 = new linkNode(8);
        linkNode l5 = new linkNode(6);
        linkNode l6 = new linkNode(9);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        linkNode res = getsort(head);
        res = null;
    }
}
