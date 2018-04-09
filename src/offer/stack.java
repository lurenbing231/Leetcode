package offer;

import java.util.Stack;

public class stack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();
    int tmp = Integer.MAX_VALUE;

    public void push(int node) {
        if (!stack.isEmpty()) {
            if (tmp > node) {
                tmp = node;
                min.push(node);
            }
        } else {
            tmp = node;
            min.push(node);
        }
        stack.push(node);
    }

    public void pop() {
        int p = stack.pop();
        if (p == tmp) {
            min.pop();
            if (!min.isEmpty()) {
                tmp = min.pop();
                min.push(tmp);
            } else {
                tmp = Integer.MAX_VALUE;
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            int p = stack.pop();
            stack.push(p);
            return p;
        }
        return (Integer) null;
    }

    public int min() {
        if (!min.isEmpty()) {
            return tmp;
        }
        return (Integer) null;
    }
}
