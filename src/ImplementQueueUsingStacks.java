import java.util.*;
public class ImplementQueueUsingStacks {

    Stack<Integer> s1;
    Stack<Integer> s2;
    public ImplementQueueUsingStacks() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(s1.isEmpty()){
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int x=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return x;
    }

    public int peek() {
        if(s1.isEmpty()){
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int x=s2.pop();
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return x;
    }

    public boolean empty() {
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */