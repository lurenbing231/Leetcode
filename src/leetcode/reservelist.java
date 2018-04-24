package leetcode;

import org.junit.Test;

public class reservelist {
    public class Node {
        String val = "";
        Node next = null;

        public Node(String val) {
            this.val = val;
        }
    }

    private Node getservelist(Node cin) {
        if (cin == null || cin.next == null) {
            return cin;
        }
        Node pre = cin;
        Node cur = pre.next;
        while (cur != null) {
            pre = cur.next;
            cur.next = cin;
            cin = cur;
            cur = pre;
        }
        return cin;
    }

    @Test
    public void test() {
        Node cin = new Node("1");
        cin.next = new Node("2");
        cin.next.next = new Node("3");
        cin.next.next.next = new Node("4");
        Node res = getservelist(cin);
        res = null;
    }
}
