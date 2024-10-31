package StackAndQueueImplementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class QueueUsingStackImple {

	//Queue is FIFO . STACK is LIFO
	//So here we have to use 2 stacks
	//Whenever we need to push the element in queue we will first pop all elements from stack 1 
	//and push it stack 2. Then we will push element to stack which we wanted to add it to queue
	//After that we will pop all elements from second stack and push it to the first stack
	//So the element we inserted just now will be at the bottom of first stack
	//and oldest element inserted will be at top of stack.so it will work as FIFO
	
   Stack<Integer> stack1 = new Stack<>();
   Stack<Integer> stack2 = new Stack<>();
   //Time Complexity => O(2n)
    public void add(int element){
    	
    	
    		while(!stack1.isEmpty()){
    			stack2.push(stack1.pop());
    		}
    		System.out.println("Element inserted in queue is "+element);
    		stack1.push(element);
    		while(!stack2.isEmpty()){
    			stack1.push(stack2.pop());
    		}
    	
    	
    }
    int deque() {
    	if(stack1.isEmpty()){
    		System.out.println("Stack is empty");
    	}
        return stack1.pop();
    }
   int peek(){
	 return stack1.peek();  
   }
    int size() {
        return stack1.size();
    }
    
    public static void main(String args[]) {
    	QueueUsingStackImple q = new QueueUsingStackImple();
        q.add(3);
        q.add(4);
        System.out.println("The element poped is " + q.deque());
        q.add(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());

    }
}
