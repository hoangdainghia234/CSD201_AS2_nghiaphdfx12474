package Main;

//Lớp MyList chứa thông tin và hành vi cơ bản của một danh sách móc nối
public class MyList {


	 /**

	  * Head node, default is null

	  */

	 Node head;

	 /**

	  * Tail node, default is null

	  */

	 Node tail;



	 /**

	  * Default constructor

	  */

	 public MyList() {
		 this.tail = this.head = null;
	 }

	 /**

	  * Constructor with head and tail

	  *

	  * @param head Head node of this list

	  * @param tail Tail node of this list

	  */

	 public MyList(Node head, Node tail) {
		 this.head = head;
		 this.tail = tail;
	 }


	 /**

	  * Checking if this list is empty

	  *

	  * @return true if list is empty

	  */

	 public boolean isEmpty() {
		 return this.head == null;
	 }



	 /**

	  * Returning the length of this list

	  *

	  * @return The length of this list

	  */

	 public int length() {
		 Node current = this.head;
		 int count = 0;
		 while (current != null) {
			 count++;
			 current = current.getNext();
		 }
		 return count;
	 }


	 /**

	  * Insert an item to the head of this list

	  *

	  * @param item The item to be inserted

	  */

	 public void insertToHead(Product item) {
		 //tạo Node mới cần chèn
		 Node newNode = new Node(item);
		 //Kiểm tra xem list này đã có node ban đầu chưa
		 if (head == null) {
			 head = tail = newNode;
		 } else {
			 //ngược lại xem phía node ban đầu có sẵn thì thêm phía sau head đó
			newNode.setNext(head);
			 //Cập nhập node ban đầu chính là node cần chèn
			head = newNode;
		 }
	 }

	 //	Thêm vào cuối Linked List
	 public void insertToTail(Product item) {
		//tạo Node
		 Node p = new Node(item);
		 if (tail == null) {
			  tail = head = p;
			  return;
		 }
		 else {
			 p.setNext(tail);
			 tail = p;
		 }
	}

	 /**

	  * Insert an item at position to this list

	  *

	  * @param position The position of new item

	  * @param item     The item to be inserted

	  */

	 public void insertAfterPosition(int position, Product item) {
		 Node newNode = new Node(item);//Tạo Node mới cần chèn
		 Node current = this.head;//xác định vị trí node hiện tại
		 int count = 0;
		 //Kiểm tra tất cả lần lượt các node có đến hết list
		 while (current != null) {
			 if (position == 0) {
				 insertToHead(item);
			 }

			 //kiểm tra vị trí mình muốn thêm vào có trùng vị trí các node trong list hay ko

			 else if (count == position - 1) {
				 if (position == length() - 1) {
					 newNode.setNext(tail);
					 current.setNext(newNode);
				 }
				newNode.setNext(current.getNext());//trỏ tới vị trí node tiếp theo
				current.setNext(newNode);//Cập nhập giá trị node hiện tại
			 }

			 count++;
			 current = current.getNext();
		 }
	 }

	 /**

	  * Deleting the tail of this list

	  */
	 public void deleteHead() {
		head = head.getNext();
	}

	 public void deleteTail() {
		 Node current = this.head;
		 while (current != null) {
			 if (current.getNext() == tail) {
				 current.setNext(null);
				 tail = current;
				 return;
			 }
			 current = current.getNext();
		 }
	 }



	 /**

	  * Searching and deleting an item from this list by comparing the ID of items

	  *

	  * @param item The item to be deleted

	  */

	 public void deleteElement(String id) {
		 Node current = this.head;
		 while (current != null) {
			 if (id.equals(head.getInfo().getIdProduct())) {
				 head = head.getNext();
				 return;
			 } else if (id.equals(current.getNext().getInfo().getIdProduct()) && current.getNext() != tail) {
				 current.setNext(current.getNext().getNext());
				 return;
			 } else if (id.equals(tail.getInfo().getIdProduct())) {
				 deleteTail();
				 return;
			 }
			 current = current.getNext();
		 }
	 }



	 /**

	  * Swaping two nodes [firstNode] and [secondNode]

	  *

	  * @param firstNode

	  * @param secondNode

	  */

	 public void swap(Node firstNode, Node secondNode) {
		 Node temp = new Node();
		 //gán giá trị của firstNode vào temp
		 temp.setInfo(firstNode.getInfo());
		 firstNode.setInfo(secondNode.getInfo());
		 secondNode.setInfo(temp.getInfo());
	 }


	 /**

	  * Deleting all items in the list

	  */

	 public void clear() {
		 //gán biến head thành null
		 this.head = null;
	 }
}
