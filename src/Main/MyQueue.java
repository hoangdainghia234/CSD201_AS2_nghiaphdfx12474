package Main;

//Lớp MyQueue chứ thông tin và các hành vi cơ bản của queue
public class MyQueue {
	 /**

	  * Head node contains front node in the queue

	  */

	 Node head;



	 /**

	  * Tail node contains last node in the queue

	  */

	 Node tail;

	 public MyQueue() {
		head = tail = null;
	}

	 public void enqueue(Product item) {
		 Node p = new Node(item);
		 if (tail != null) {
			 tail = head = p;
			 return;
		 } else {
			 p.setNext(tail);
			 tail = p;
		 }
	}

	public Product dequeue() {
		Product item = null;
		if (head != null) {
			item = head.getInfo();
			head = head.getNext();
		} else {
			return null;
		}
		return item;
	}

	public void travel() {
		while (head != null) {
			System.out.println(this.dequeue());
		}
	}

}
