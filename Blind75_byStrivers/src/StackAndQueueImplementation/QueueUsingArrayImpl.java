package StackAndQueueImplementation;

//Queue is FIFO
//We will insert from front and remove from rear end

class Queue {

	int start = -1, end = -1;
	int currSize = 0;
	int []q = new int[6];
	int capacity = q.length;
	//Adding element from end index
	public void push(int element){
		if(currSize == capacity){
			System.out.println("Queeue is full. Cannot insert element");
		}
		//First element to be inserted
		if(end == -1){
			start = 0;
			end = 0;
			
		}else{
			end = (end +1) % capacity; //% is used .
			//bcoz if we are inserting at last position then we need to point end to position 0
		}
		q[end]=element;
		currSize++;
		System.out.println("The element pushed to the queue is "+element);
		
	}
	
	public int top(){
		
		if(currSize == 0){
			System.out.println("Queue is empty ");
			return -1;
		}else{
			return q[start];
		}
	}
	
	public int pop(){
		if(start == -1){
			System.out.println("Queue is empty ");
			return -1;
		}
		int poppedElement = q[start];
		 if (currSize == 1){
			start = -1;
			end = -1;
		}
		else {
			start = (start +1) % capacity; 
			//bcoz if we are popping out from  last position then we need to point start to position 0.
		}
		currSize--;
		return poppedElement;
	}
	public int size(){
		return currSize;
	}

}

public class QueueUsingArrayImpl {
		public static void main(String args[]) {
	        Queue q = new Queue();
	        q.push(4);
	        q.push(14);
	        q.push(24);
	        q.push(34);
	        System.out.println("The peek of the queue before deleting any element " + q.top());
	        System.out.println("The size of the queue before deletion " + q.size());
	        System.out.println("The first element to be deleted " + q.pop());
	        System.out.println("The peek of the queue after deleting an element " + q.top());
	        System.out.println("The size of the queue after deleting an element " + q.size());
	    }
	
}
