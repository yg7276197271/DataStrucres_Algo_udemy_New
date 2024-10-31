package LinkedList;

import java.util.Arrays;
import java.util.List;

public class InsertNodeIntoLinkedList {
    // Function to print the linked list
    public static void printLL(Node head) {
    	Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("null");

    }
    //Find Length Of Linked lIst
    public static int findLengthOfLinkedList(Node head){
    	int cnt = 0;
    	Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++; 
        }
        return cnt;
    }
    //Search Element in Linked List
    public static int searchElementInLinkedList(Node head,int element){
    	Node temp = head;
        while (temp != null) {
        	if(temp.data == element) return 1;
            temp = temp.next;
            
        }
        return -1;
    }
    // Function to insert a new node at the head of the linked list
    public static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head); //First is value field and next pointer should point to head
        return temp;
    }

    // Function to insert a new node at the Tail of the linked list
    public static Node insertAtTail(Node head, int val) {
    	
    	if(head == null) return new Node(val);
    	
    	//We need to Stop at Last Element of linked list . 
    	Node temp = head;
    	while(temp.next !=null ){
    		temp = temp.next;
    	}
        Node nodeToInsert = new Node(val); 
        temp.next = nodeToInsert;//Next Node of temp will point to nodeToInsert
        //NExt of nodeToInsert will be null
        return head;
    }
    
    // Function to insert a new node at the given position in the linked list
    public static Node insertatKthPositionInLL(Node head, int val , int position) {
       
    	//Case 1 : If LL is empty
    	if(head == null){
    		if(position == 1){
    			Node insertNode =  new Node(val);
        		return insertNode;
    		}else{
    			System.out.println("Cannot insert node in linked List");
    			return head;
    		}
    	}
    	//Case 2 : If we need to insert at first position 
    	if(position == 1){
    		Node insertNode =  new Node(val,head);
    		return insertNode;
    	}
    	//case 3 : insert at given position in linked list apart from start
    	int cnt = 0;
    	Node temp = head;
    	//We need to reach till the position - 1 Node in given LL
    	
    	while(temp!= null){
    		cnt++;
    		if(cnt == (position -1)){
    	    	Node insertNode = new Node(val);
    			insertNode.next = temp.next;
    			temp.next = insertNode;
    			return head;
    		}
    		temp = temp.next;
    	}
    	return head;
    }
    
    
 // Function to insert a new node before a given value in linked list
    public static Node insertBeforeValueInInLL(Node head, int element , int value) {
       
    	//Case 1 : If LL is empty
    	//Not a valid case
    	if(head == null){
    		return null;
    	}
    	//Case 2 : If we need to insert at first position 
    	if(value == head.data){
    		Node insertNode =  new Node(element,head);
    		return insertNode;
    	}
    	//case 3 : insert before a value node given
    	//We need to reach to a node whose next node is equal to value given
    	//At the worst case we will be given value node as last node of LL
    	//So we will stop at 2nd last position
    	//It means we will stop where temp.next == given value node/
    	//So we need to add check on temp.next
    	Node temp = head;

    	while(temp.next!= null){
    		if(temp.next.data == (value)){
    	    	Node insertNode = new Node(element);
    			insertNode.next = temp.next;
    			temp.next = insertNode;
    			return head;
    		}
    		temp = temp.next;
    	}
    	return head;
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
        System.out.println("Travesing the Linked List");
        printLL(head);
        
        System.out.println("Length of Linked List is "+findLengthOfLinkedList(head));
        
        int find = searchElementInLinkedList(head, 12);
        if(find!=-1)
        	System.out.println("Element is found");
        System.out.println("After Inserting Element at start of LL");
        // Inserting a new node at the head of the linked list
        head = insertHead(head, val);
        // Printing the linked list
        printLL(head);
        System.out.println("After Inserting Element at End of LL");
        Node newHeadAfter = insertAtTail(head,200);
        printLL(newHeadAfter);
       //inserting at 3rd position in Linked List
        System.out.println("After Inserting at 3rd position");
        Node newHEad = insertatKthPositionInLL(head,300,3);
        printLL(newHEad);
        //Insert Before a given Value in Linked List
        System.out.println("Inserting  before node value 8");
        Node newHEad1 = insertBeforeValueInInLL(head,400,8);
        printLL(newHEad1);
        
    }
}
