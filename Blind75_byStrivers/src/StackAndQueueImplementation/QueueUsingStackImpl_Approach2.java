package StackAndQueueImplementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class QueueUsingStackImpl_Approach2 {

	//Queue is FIFO . STACK is LIFO
	//So here we have to use 2 stacks
	//We will maitain 2 stacks
	//Whenever there is push operation to queue , we will simply oush to stack 1
	//Whenever there is pop operation , we cannot pop from stack 1 becoz it will give us newly added element
	//But as per FIFO we need oldest element added
	//For pop operation we have to first pop element from stack 1 to stack 2 and then pop single element from stack 1
	//If we have to again do the pop , we will pop from stack 2 ony. this we can do till stack 2 is not empty
	//And we need to push element directly to stack 1 if stack 2 is not empty
	//As soon as stack 2 becomes empty, then pop all elements from stack 1 and push it to stack 2
   Stack<Integer> stack1 = new Stack<>();
   Stack<Integer> stack2 = new Stack<>();
    public void add(int element){
    	stack1.push(element);
    	System.out.println("Element pushed to the queue is "+element);

    }

	int deque() {
		if (stack2.empty())
			while (stack1.empty() == false) {
				stack2.push(stack1.pop());
			}
		int x = stack2.pop();
		return x;
	}
   int peek(){
		if (stack2.empty())
			while (stack1.empty() == false) {
				stack2.push(stack1.pop());
			}
		int x = stack2.peek();
		return x;
	
   }
    int size() {
        return stack1.size() + stack2.size();
    }
    
    public static void main(String args[]) {
    	QueueUsingStackImpl_Approach2 q = new QueueUsingStackImpl_Approach2();
    	 q.add(3);
         q.add(4);
         System.out.println("The element poped is " + q.deque());
         q.add(5);
         System.out.println("The top element is " + q.peek());
         System.out.println("The size of the queue is " + q.size());
    }
}
