package LinkedList;


class Node {
    int data;      // the data value
    Node next;      // the reference to the next Node in the linked list
    // Constructors
    Node(int data1, Node next1) {
        this.data = data1;  // Initialize data with the provided value
        this.next = next1;  // Initialize next with the provided reference
    }
    Node(int data1) {
        this.data = data1;  // Initialize data with the provided value
        this.next = null;   // Initialize next as null since it's the end of the list
    }
}


public class CreatingLinkedList {
	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 7};
        // Create a Node 'x' with the first element of the array
        Node x = new Node(arr[0]);
        // Create a reference 'y' pointing to the same Node 'x'
        Node y = x;
        // Print the reference 'y', which represents the memory address of the Node 'x'
        System.out.println(y);
        System.out.println(y.data);

        }
	
}


