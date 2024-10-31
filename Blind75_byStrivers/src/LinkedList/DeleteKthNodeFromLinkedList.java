package LinkedList;

import java.util.Arrays;
import java.util.List;

public class DeleteKthNodeFromLinkedList {

	
	//Delete node from middle of Linked List
	public static Node removeFromMiddleOfLinkedList(Node head , int k){
		if(head == null) return head;
		//delete 1st node that is head of node
		if(k == 1){
			head = head.next;
			return head;
		}
		
		Node temp = head;
		Node prev = null;
		int cnt = 0;
		while(temp !=null){
			cnt = cnt+1;
			if(cnt  == k){
				prev.next =	prev.next.next;
				break;
			}
			prev = temp;
			temp=temp.next;
			
		}
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
        
    /*    Node newhead = removeFromMiddleOfLinkedList(head, 1); //remove 12 from above linked List
        System.out.println("After removing start of linked list");
        printLL(newhead);*/
        
        
      /*  Node newhead = removeFromMiddleOfLinkedList(head, 4); //remove 7 from above linked List
        System.out.println("After removing node from middle of linked List");
        printLL(newhead);*/
        
          Node newhead = removeFromMiddleOfLinkedList(head, 3); //remove 5 from above linked List
        System.out.println("After removing node from middle of linked List");
        printLL(newhead);
        


    }   

}
