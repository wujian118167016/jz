package jz_new;

import java.util.Stack;

public class que9 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    //如果stack2中有元素，则从stack2中出栈
    //如果stack2中无元素，则把stack1中的元素全部压人stack2中，再取栈顶元素
    public int pop() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
