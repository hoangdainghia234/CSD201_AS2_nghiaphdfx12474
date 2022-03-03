package Main;

import java.io.IOException;
import java.util.Scanner;

//Lớp AS2_Main là lớp để tạo menu và thực hiện thực hiện các chức năng  trong lớp ProductEngine của bài toán
public class AS2_Main {
	//thiết kế menu
	public static void menuShow() {
		System.out.println("Choose one of this options:");
		    System.out.println("Product list:");
			System.out.println("1. Load data from file and display");
			System.out.println("2. Input & add to the end.");
			System.out.println("3.Display data");
			System.out.println("4.Save product list to file.");
			System.out.println("5. Search by ID");
			System.out.println("6.Delete by ID");
			System.out.println("7.Sort by ID.");
			System.out.println("8. Convert to Binary ");
			System.out.println("9. Load to stack and display");
			System.out.println("10. Load to queue and display.");
			System.out.println("Exit:");
			System.out.println("0. Exit");
	}
	public static void main(String[] args) throws IOException {
		menuShow();
		MyList list = new MyList();
		MyStack stack = new MyStack();
		MyQueue queue = new MyQueue();

//		list.insertToHead(new Product("AT1", "Bot giac", 50000, 5));
//		list.insertToHead(new Product("AT2", "Bot giac 2", 80000, 15));
//		System.out.println(list.length());

		Scanner sc = new Scanner(System.in);


		OperationToProduct pc = new OperationToProduct();
		//1.Đọc dữ liệu có sẵn từ file chứa các sản phẩm rồi lưu vào Linked List
		int choice = 0;
		do {
			System.out.print("Choice = ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				pc.getAllItemsFromFile("index.txt", list);
				break;
			}
			case 2: {
				pc.addLast(list);
				break;
			}
			case 3: {
				//Hiển thị thông tin của các sản phẩm trong danh sách móc nối
				pc.displayAll(list);
				break;
			}
			case 4: {
				pc.writeAllItemsToFile("data.txt", list);
				break;
			}
			case 5: {
				pc.searchByCode(list);
				break;
			}
			case 6: {
				pc.deleteByCode(list);
				break;
			}
			case 7: {
				pc.sortByCode(list);
				break;
			}
			case 8: {
				pc.covertBinary(list);
				break;
			}
			case 9: {
				pc.getAllItemsFromFile("index.txt", stack);
				break;
			}
			case 10: {
				pc.getAllItemsFromFile("index.txt", queue);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		} while (choice != 0);
	}
}

