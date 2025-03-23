package practice.dataStructure.stack;

import java.util.ArrayList;

public class StackArrayList {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(4);
		stack.push(3);
		stack.push(0); // Should print "Stack is full"

		stack.print();
		stack.peek();

//		System.out.println("Popped: " + stack.pop());
//		System.out.println("Popped: " + stack.pop());
		System.out.println("peek: " + stack.peek());
		stack.print();

	}

}

class Stack<T> {
	private ArrayList<T> stack;

	public Stack() {
		stack = new ArrayList<>();
	}

	// Check if the stack is empty
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	// Push element onto the stack
	public void push(T value) {
		stack.add(value);
	}

	// Pop element from the stack
	public T pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty! Cannot pop.");
		}
		return stack.remove(stack.size() - 1);
	}

	// Peek the top element
	public T peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty! Cannot peek.");
		}
		return stack.get(stack.size() - 1);
	}

	// Get the size of the stack
	public int size() {
		return stack.size();
	}

	public void print() {
		System.out.println("stack is :" + stack);
	}

}
