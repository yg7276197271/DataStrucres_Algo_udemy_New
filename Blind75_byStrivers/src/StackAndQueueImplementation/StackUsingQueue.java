package StackAndQueueImplementation;

import java.util.LinkedList;
import java.util.Queue;


public class StackUsingQueue {

	//So Queue is FIFO
	//Stack is LIFO it means we get most recently inserted element whenever we remove an element from stack
	//But Queue follows FIFO we get that element which we inserted in the starting
	// it means if we want to use the queue like a stack we have to arrange elements 
	//in the queue such that we get the most recent element at each deletion.
	
    Queue<Integer> queue = new LinkedList<>();
    
    public void push(int element){
    	queue.add(element);
    	//The element we added is at the rear end of queue.But we need to make it at start of queue
    	//as we are implementing STACK
    	
    	for(int i=0;i<queue.size()-1;i++){
    		queue.add(queue.poll()); //remove element from front and add it to back
    	}
    }
    int pop() {
        return queue.remove();//remove from front
    }
    int top() {
        return queue.peek();
    }
    int size() {
        return queue.size();
    }
    
    public static void main(String[] args) {
    	StackUsingQueue s = new StackUsingQueue();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
    }
}
