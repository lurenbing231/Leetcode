package offer;

import java.util.Stack;

public class StackImQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack2.push(node);
    }

    public int pop() {
        int re = im();
        return re;
    }

    private Integer im() {
        int re = 0;
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        if (!stack1.empty()) {
            re = stack1.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return re;
    }
}
