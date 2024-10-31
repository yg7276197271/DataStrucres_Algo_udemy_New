package LinkedList;

import java.util.Arrays;
import java.util.List;

//Node class to represent a linked list node
public class DeleteLastNodeFromLinkedList {
	
	// Function to delete the tail of the linked list
    private static Node deleteTail(Node head) {
    	//If LL is empty
    	if(head == null) return head;
    	//If LL contains only one element then we need to delete that
    	if(head.next == null){
    		head = null;
    		return head;
    	}
    	Node temp = head ;
    	
    	//We need to find second last node
    	//when temp.next.next becomes null then we got second last node
    	while(temp.next.next != null){
    		
    		temp = temp.next; //We move by one step ahead
    	}
    	//Second last node should point null.
    	temp.next = null;
    	
    	return head;
    	
    }
    // Function to print the linked list
    private static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "=>");
            head = head.next;
        }
        System.out.print("null");
    }
    // Main method
    public static void main(String[] args) {
        // Initialize an array with integer values
        int[] arr = {2, 5, 8, 7};
        // Create the linked list with nodes initialized with array values
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        // Delete the tail of the linked list
        
        printLL(head);
        System.out.println();
        head = deleteTail(head);
        // Print the modified linked list
        printLL(head);
    }}
