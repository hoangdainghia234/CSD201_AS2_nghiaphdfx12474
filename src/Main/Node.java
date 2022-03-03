package Main;

//Lớp Node để quản lý thông tin và hành  của vi mỗi node trong danh sách
public class Node {
	private Product info;
	private Node next;

	public Node() {}
	public Node(Product data) {
		this.info = data;
		this.next = null;
	}
	public Product getInfo() {
		return info;
	}
	public Node getNext() {
		return next;
	}
	public void setInfo(Product data) {
		this.info = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return " " + info;
	}
}
