package StackAndQueueImplementation;

class Node{
	int data;
	Node next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node(int data) {
		super();
		this.data = data;
	}
	
}
//All operations are done in O(1)
public class StackUsingLinkedList {

	Node top;
	int size;
	
	public void push(int value){
		Node temp = new Node(value);
		temp.next = top;
		top = top.next; //or we can do top = temp
		size = size +1;
	}
	public int pop(){
		if(top == null) return -1;
		Node temp = top;
		top = top.next;
		size = size -1;
		return temp.data;
	}
	public int top(){
		return top.data;
	}
	public int size(){
		return size;
	}
}
