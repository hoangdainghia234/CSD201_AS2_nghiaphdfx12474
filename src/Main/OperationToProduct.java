package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Lớp OperationToProduct sẽ chứa các phương thức thức biểu diễn các yêu cầu chức năng của bài toán
public class OperationToProduct {
	//Đọc dữ liệu có sẵn từ file
	 /**

	  * Searching and returning the index of product p in the list. If not found

	  * return -1.

	  *

	  * @param p    Product for searching

	  * @param list The Linked List

	  * @return The index of product p in the list

	  */

//	 public int index(Product p, MyList<Product> list) {
//
//	 }



	 /**

	  * Creating and returning a product with info input from keyboard.

	  *

	  * @return The product

	  */

	//Nhập một sản phẩm vào cuối của danh sách móc nối
	 public Product createProduct() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Input new ID: ");
		 String id = sc.nextLine();

		 System.out.print("Input Product's Name: ");
		 String name = sc.nextLine();

		 System.out.print("Input Product's quantity: ");
		 int number = Integer.parseInt(sc.nextLine());

		 System.out.print("Input Product's price: ");
		 double price = Integer.parseInt(sc.nextLine());

		 return new Product(id, name, number, price);
	 }



	 /**

	  * Reading all products from the file and insert them to the list at tail.

	  *

	  * @param fileName The file name of the file

	  * @param list     The Linked List contains all products that read from file
	 * @throws IOException

	  */

	 public void getAllItemsFromFile(String fileName, MyList list) throws IOException {
			//Khai báo tên biến lưu thuộc tính
			String id;
			String name;
			double price;
			int number;
			try {
				FileReader input = new FileReader(fileName);
			    //vận chuyển
		        BufferedReader br = new BufferedReader(input);

		        String str;//khai báo biến

		        //duyệt cho đến khi tất cả các dòng đc đọc hết
		        while ((str = br.readLine()) != null) {

			        //tách các xâu ra thành từng từ lưu vào từng p tử của mảng
			        String[] p = str.split(" \\| ");

			        //Gán biến từng phần tử của mảng vào biến
			        id = p[0];

			        name = p[1];

			        number = Integer.parseInt(p[2]);

			        price = Double.parseDouble(p[3]);

			        //lưu vào Linked List
			        Product newProduct = new Product(id, name, number, price);
			        //Gọi hàm insert vào
			        list.insertToTail(newProduct);
			        System.out.println(newProduct);
		        }
		        br.close();
		        //đóng File
				input.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	 }



	 /**

	  * Reading all products from the file and insert them to the stack.

	  *

	  * @param fileName The file name of the file

	  * @param stack     The Stack contains all products that read from file
	 * @throws IOException
	 * @throws NumberFormatException

	  */

	 //Đọc dữ liệu từ file chứa các sản phẩm rồi lưu vào stack. Hiển thị ra màn hình các sản phẩm có trong stack.
	 public void getAllItemsFromFile(String fileName, MyStack stack) throws NumberFormatException, IOException {
			//Khai báo tên biến lưu thuộc tính
			String id;
			String name;
			double price;
			int number;
			try {
				FileReader input = new FileReader(fileName);
			    //vận chuyển
		        BufferedReader br = new BufferedReader(input);

		        String str;//khai báo biến

		        //duyệt cho đến khi tất cả các dòng đc đọc hết
		        while ((str = br.readLine()) != null) {

			        //tách các xâu ra thành từng từ lưu vào từng p tử của mảng
			        String[] p = str.split(" \\| ");

			        //Gán biến từng phần tử của mảng vào biến
			        id = p[0];

			        name = p[1];

			        number = Integer.parseInt(p[2]);

			        price = Double.parseDouble(p[3]);

			        //lưu vào Linked List
			        Product newProduct = new Product(id, name, number, price);
			        //Gọi hàm insert vào
			        stack.push(newProduct);
			        System.out.println(newProduct);
		        }
		        input.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			//Hiển thị ra màn hình các sản phẩm có trong stack.
			stack.travel();
	 }



	 /**

	  * Reading all products from the file and insert them to the queue.

	  *

	  * @param fileName The file name of the file

	  * @param queue     The Queue contains all products that read from file
	 * @throws IOException

	  */

	 public void getAllItemsFromFile(String fileName, MyQueue queue) throws IOException {
			//Khai báo tên biến lưu thuộc tính
			String id;
			String name;
			double price;
			int number;
			try {
				FileReader input = new FileReader(fileName);
			    //vận chuyển
		        BufferedReader br = new BufferedReader(input);

		        String str;//khai báo biến

		        //duyệt cho đến khi tất cả các dòng đc đọc hết
		        while ((str = br.readLine()) != null) {

			        //tách các xâu ra thành từng từ lưu vào từng p tử của mảng
			        String[] p = str.split(" \\| ");

			        //Gán biến từng phần tử của mảng vào biến
			        id = p[0];

			        name = p[1];

			        number = Integer.parseInt(p[2]);

			        price = Double.parseDouble(p[3]);

			        //lưu vào Queue
			        Product newProduct = new Product(id, name, number, price);
			        //Gọi hàm insert vào
			        queue.enqueue(newProduct);
			        System.out.println(newProduct);
		        }
		        input.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			//Hiển thị ra màn hình các sản phẩm có trong stack.
			queue.travel();
	 }



	 /**

	  * Adding a product to the list, info of the product input from keyboard.

	  *

	  * @param list The Linked list

	  */

	 //thêm một sản phẩm vào cuối của danh sách móc nối
	 public void addLast(MyList list) {
		 //Nhập vào cái sản phẩm
		 Product p = createProduct();
		 //thêm vào Linked List
		 list.insertToTail(p);
	 }



	 /**

	  * Printing all prodcuts of the list to console screen

	  *

	  * @param list

	  */

	 public void displayAll(MyList list) {
		 Node p = list.head;
		 while (p != null) {
			 System.out.println(p.getInfo());
			 p = p.getNext();
		 }
	 }



	 /**

	  * Writing all products from the list to the file

	  *

	  * @param fileName Input file name

	  * @param list     Input Linked list
	 * @throws IOException

	  */

	 //Lưu danh sách móc nối các sản phẩm vào file
	 public void writeAllItemsToFile(String fileName, MyList list) throws IOException {
		 try  {
			 FileWriter output = new FileWriter(fileName);
			 Node current = list.head;
			 while (current != null) {
				 output.write(current.getInfo().toString());
				 current = current.getNext();
			 }
			 output.close();
		 } catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
	 }



	 /**

	  * Searching product by ID input from keyboard.

	  *

	  * @param list

	  */

	 public void searchByCode(MyList list) {
		 Scanner sc = new Scanner(System.in);
		 //nhập ID cần tìm
		 System.out.println("Input the ID to search=");
		 String id = sc.nextLine();
		 Node current = list.head;
		 while (current != null) {
			 if (id.equals(current.getInfo().getIdProduct())) {
				 System.out.print("Result: " + current.getInfo());
			 }
			 current = current.getNext();
		 }
	 }



	 /**

	  * Deleting first product that has the ID input from keyboard from the list.

	  *

	  * @param list

	  */


	//Xóa sản phẩm trong danh sách theo ID
	 public void deleteByCode(MyList list) {
		 Scanner sc = new Scanner(System.in);
		 //nhập ID cần xóa
		 System.out.print("Input the bcode to delete=");
		 String id = sc.nextLine();
		 list.deleteElement(id);
		 System.out.println("Deleted!");
	 }

	 /**

	  * Sorting products in linked list by ID

	  *

	  * @param list The Linked list

	  */

	 public void sortByCode(MyList list) {
		 Node p = null;
		 Node current = list.head;
		 while (current != null) {
			 p = current.getNext();
			 while (p != null) {
				 if (current.getInfo().getIdProduct().compareTo(p.getInfo().getIdProduct()) > 0)
				 {
					 list.swap(p, current);
				 }
				 p = p.getNext();
			 }
			 current = current.getNext();
		 }
		 System.out.println("Successfully!");
	 }



	 /**

	  * Adding new product to head of Linked List. The info input from keyboard.

	  *

	  * @param list The linked list

	  */

//	 public void addFirst(MyList<Product> list) {
//
//	 }



	 /**

	  * Convert a decimal to an array of binary. Example: input i = 18 -> Output =

	  * {0, 1, 0, 0, 0, 1}

	  *

	  * @param i Input decimal number

	  * @return Array of binary numbers

	  */

	 public String convertToBinary(int i) {
		 String result = "";
		 if (i == 1) {
			 return result += 1;
		 }
		 result += String.valueOf( i % 2);
		 return convertToBinary(i/2) + result;
	 }

	 public void covertBinary(MyList list) {
		//lấy số luong của product đầu tiên trong list
		 int number = list.head.getInfo().getNumberProct();
		 System.out.println("Quantity=" + number + "=>" + convertToBinary(number));
	}


	 /**

	  * Deleting the product at position

	  *

	  * @param list The Linked List

	  * @param pos  The position of product to be deleted

	  */

//	 public void deleteAtPosition(MyList<Product> list, int pos) {
//
//
//
//	 }
}
