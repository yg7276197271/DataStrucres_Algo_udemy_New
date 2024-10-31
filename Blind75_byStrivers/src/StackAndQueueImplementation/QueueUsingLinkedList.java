package StackAndQueueImplementation;

//In queue we need to insert from front/start and remove element from end/rear 
//It is FIFO
//All operations are done in O(1)
public class QueueUsingLinkedList {

	Node start = null;
	Node end = null;
	int size = 0;
	
	public void enqueue(int element){
		Node temp = new Node(element);
		if(start == null){ //We are addding element to empty Linked List
			start = temp;
			end = temp;
		}
		else{
			end.next = temp;
			end = temp;
		}
		size = size +1;
		System.out.println("Element inserted in Queue is "+element);
	}
	public int dequeue(){
		
		if(start == null){
			System.out.println("Queue is empty");
			return -1;
		}else{

			Node temp = start;
			start = start.next;
			size = size -1;
			System.out.println("Element removed from queue is "+temp.data);
			return temp.data;
		}
	

	}
	public int peek(){
		if(start == null){
			System.out.println("Queue is empty");
			return -1;
		}else{
			return start.data;
		}
	}
	
	public static void main(String args[])

	{
		QueueUsingLinkedList queue=new QueueUsingLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.dequeue();
	    System.out.println("The size of the Queue is "+queue.size);
	    System.out.println("The Peek element of the Queue is "+queue.peek());
	}
}
