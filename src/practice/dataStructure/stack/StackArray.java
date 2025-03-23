package practice.dataStructure.stack;

public class StackArray {

	static class Stack {
		private int[] arr;
		private int size;
		private int top;

		public Stack(int n) {
			this.arr = new int[n];
			this.size = n;
			this.top = -1;
		}

		public void print() {
			if (isEmpty()) {
				System.out.println("Stack is empty.");
				return;
			}
			System.out.println("Stack contents:");
			for (int i = 0; i <= top; i++) {
				System.out.println(arr[i]);
			}
		}

		public void push(int value) {
			if (isFull()) {
				System.out.println("Stack is full. Cannot push " + value);
				return;
			}
			arr[++top] = value;
		}

		public int pop() {
			if (isEmpty()) {
				System.out.println("Stack is empty. Cannot pop.");
				return -1;
			}
			return arr[top--];
		}

		public boolean isFull() {
			return top == size - 1;
		}

		public boolean isEmpty() {
			return top == -1;
		}
		public int peek() {
			return arr[top];
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(2);
		stack.push(4);
		stack.push(3);
		stack.push(0); // Should print "Stack is full"

		stack.print();
		stack.peek();

		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());
		System.out.println("peek: " + stack.peek());

		stack.print();
	}
}
