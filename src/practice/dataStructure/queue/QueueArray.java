package practice.dataStructure.queue;

public class QueueArray {

	static class Queue {
		static int arr[];
		static int size;
		static int last = -1;

		Queue(int n) {
			arr = new int[n];
			size = n;
		}

		public int remove() {
			if (isEmpty()) {
				return -1;
			}
			int val = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr.length == i + 1) {
					arr[i]=0;
				} else {
					arr[i] = arr[i + 1];
					if (last == i)
						break;
				}
			}
			last = last - 1;
			return val;

		}

		public void add(int val) {
			if (isFull(val))
				return;
			arr[last + 1] = val;
			last = last + 1;
			System.out.println("elememt added:" + (last + 1) + ":" + val);
		}

		public int[] getQueue() {
			return arr;
		}

		public boolean isEmpty() {
			return last == -1 ? true : false;
		}

		public Boolean isFull(int val) {
			if (arr.length == last + 1)
				System.out.println("Array is fulll: not added:" + val);
			return arr.length == last + 1 ? true : false;
		}

		public void printArr() {
			for (int i = 0; i < arr.length; i++) {
				System.out.println("===Array:"+(i+1)+"::"+arr[i]);
			}
		}
	}

	public static void main(String[] args) {

		Queue que = new Queue(10);
		que.add(10);
		que.add(5);
		que.add(10);
		que.add(5);
		que.add(10);
		que.add(5);
		que.add(10);
		que.add(5);
		que.remove();
		que.add(7);
		que.add(7);
		que.add(8);
		que.remove();
		que.printArr();

	}
}
