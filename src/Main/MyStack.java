package Main;

//Lớp MyStack chứa thông tin và các hành vi cơ bản của stack
public class MyStack {
	 /**

	  * Head node contains front node in the stack

	  */

	 Node head;

	 public MyStack() {
		 this.head = null;
	 }

	 public void push(Product item) {
		 Node p = new Node(item);
		 if (head == null) {
			 head = p;
			 return;
		 } else {
			 p.setNext(head);
			 head = p;
		 }
	}

	 public Product pop() {
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
			System.out.println(this.pop());
		}
	}
}
