// CodeStudios Coding Ninja
import java.util.*;
public class Queue {
    public class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Queue() {
        LinkedList<Integer> q=new LinkedList<Integer>();
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        if(head==null){
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        Node x=new Node(data);
        if(head==null){
            head=x;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=x;
    }

    int dequeue() {
        // Implement the dequeue() function
        if(head==null){
            return -1;
        }
        int x=head.data;
        head=head.next;
        return x;
    }

    int front() {
        if(head==null){
            return -1;
        }
        return head.data;
        // Implement the front() function
    }
}
