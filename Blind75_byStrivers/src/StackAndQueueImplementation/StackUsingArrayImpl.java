package StackAndQueueImplementation;

//Below we will implementing Stack Using Array
//Stack is LIFO
//Time Complexity of all operations are O(1)
//Space Complexity is O(n) where n is size of an array
class stack {

	int st[] = new int[10]; // Length cannot be dynamic.
	int top = -1;

	public void push(int element) {
		if (top >= st.length) {
			System.out.println("Stack is full. Cannot add element");
		} else {
			top++;
			st[top] = element;
		}

	}

	public int top() {
		if (top == -1) {
			System.out.println("Stack is empty.");
			return -1;
		} else {
			return st[top];

		}
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack is empty.");
			return -1;
		} else {
			int topElement = st[top];
			top--;
			return topElement;

		}
	}

	public int size() {
		return top + 1;
	}

}

class StackUsingArrayImpl {
	public static void main(String[] args) {

		stack s = new stack();
		s.push(6);
		s.push(3);
		s.push(7);
		System.out.println("Top of the stack before deleting any element " + s.top());
		System.out.println("Size of the stack before deleting any element " + s.size());
		System.out.println("The element deleted is " + s.pop());
		System.out.println("Size of the stack after deleting an element " + s.size());
		System.out.println("Top of the stack after deleting an element " + s.top());
	}
}
