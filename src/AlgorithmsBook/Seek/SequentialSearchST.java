package AlgorithmsBook.Seek;


import java.util.*;

/**
 * Created by zhaoliang on 2017/11/13.
 */
public class SequentialSearchST<Key, Value> {
    private Node first;
    private int n = 0;

    private class Node {
        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }


    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {//查询给定的key值
            if (key.equals(x.key)) {
                return x.val;//如果存在，返回key值
            }
        }
        return null;//如果不存在，返回null
    }

    public void put(Key key, Value val) {
        for (Node x = first; x != null; x = x.next) {//查询链表中是否有key值
            if (key.equals(x.key)) {//如果存在key值，更改val
                x.val = val;
                return;
            }
        }
        first = new Node(key, val, first);//如果不存在key值，将该值出入第一个节点
        n++;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Iterable<Key> keys() {
        List<Key> list = new ArrayList<>();
        for (Node x = first; x != null; x = x.next) {
            list.add(x.key);
        }
        return list;
    }

    public void delete(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("不能删除空值！");
        }
        first = delete(key, first);
    }

    private Node delete(Key key, Node x) {
        if (x == null) {
            return null;
        }
        if (key.equals(x.key)) {
            n--;
            return x.next;
        }
        x.next = delete(key, x.next);
        return x;
    }
}
