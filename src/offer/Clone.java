package offer;

import org.junit.Test;

/*
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
返回结果为复制后复杂链表的head。
（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
* */
public class Clone {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        CloneNode(pHead);
        CloneRandom(pHead);
        return CloneRandomListNode(pHead);
    }

    //复制节点到每个点后面
    private void CloneNode(RandomListNode pHead) {
        RandomListNode copy = pHead;
        while (copy != null) {
            RandomListNode tmp = new RandomListNode(copy.label);
            tmp.next = copy.next;
            tmp.random = null;
            copy.next = tmp;
            copy = tmp.next;
        }
    }

    private void CloneRandom(RandomListNode pHead) {
        RandomListNode copy = pHead;
        while (copy != null) {
            if (copy.random != null)
                copy.next.random = copy.random.next;
            copy = copy.next.next;
        }
    }

    private RandomListNode CloneRandomListNode(RandomListNode pHead) {
        RandomListNode old = pHead;
        RandomListNode res = null;
        RandomListNode tmp = null;
        if (old != null) {
            res = tmp = old.next;
            old.next = tmp.next;
            old = old.next;
        }
        while (old != null) {
            tmp.next = old.next;
            tmp = tmp.next;
            old.next = tmp.next;
            old = old.next;
        }
        return res;
    }

    @Test
    public void test() {
        RandomListNode pHead = new RandomListNode(1);
        pHead.next = new RandomListNode(2);
        pHead.next.next = new RandomListNode(3);
        pHead.random = pHead.next.next;
        Clone(pHead);
    }
}
