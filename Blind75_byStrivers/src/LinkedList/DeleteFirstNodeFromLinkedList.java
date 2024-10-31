package LinkedList;

import java.util.Arrays;
import java.util.List;

//Node class to represent a linked list node
public class DeleteFirstNodeFromLinkedList {
	
	//Delete node from start of Linked List
	public static Node removeHead(Node head){
		if(head==null) return head;
		Node temp = head;
		head = head.next;
		temp=null;
		return head;
	}
	
	// Function to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "=>");
            head = head.next;
        }
        System.out.print("null");
        
}
    public static void main(String[] args) {
        // Sample array and value for insertion
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        // Creating a linked list with initial elements from the array
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        // Inserting a new node at the head of the linked list
       // head = insertHead(head, val);

        // Printing the linked list
        printLL(head);
        System.out.println();
        Node newhead = removeHead(head);
        System.out.println("New Head Of linked list is "+newhead.data);
        printLL(newhead);


    }   
}
