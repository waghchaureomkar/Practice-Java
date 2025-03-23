package practice.dataStructure.queue;
import java.util.ArrayList;
public class QueueArrayList {
	
	public static void main(String[] args) {
		
		Queue<Integer> que = new Queue<>();
		que.enQueue(2);
		que.enQueue(3);
		que.enQueue(6);
		que.enQueue(2);
		que.enQueue(6);
		que.enQueue(23);
		que.print();
		que.enQueue(7);
		que.deQueue();
		que.deQueue();
		que.print();
		System.out.println("peek is : "+que.peek());
	}

}

class Queue<T> {
	
	ArrayList<T> que ;
	public Queue(){
		que = new ArrayList<T>();
	}
	
	public boolean isEmpty() {
		return que.isEmpty();
	}
	public int Size() {
		return que.size();
	}
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Emptry");
		}
		return que.get(0);
	}
	public void enQueue(T value) {
		que.add(value);
	}
	
	public T deQueue() {
		if(isEmpty()) {
			throw new RuntimeException("queue is Empty");
		}
		return que.remove(0);
	}
	public void print() {
		System.out.println("queue is :"+que);
	}
}
