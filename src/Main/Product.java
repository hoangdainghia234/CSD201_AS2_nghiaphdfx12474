package Main;

//Lớp Product chứa thông tin và hành vi cần thiết cho sản phẩm
public class Product {
	public Product() {}
	public Product(String id, String name, int number, double price) {
		this.idProduct = id;
		this.nameProduct = name;
		this.numberProct = number;
		this.price = price;
	}
	//khai báo Mã sản phẩm, tên sản phẩm, đơn giá, số lượng.
	private String idProduct;
	private String nameProduct;
	private double price;
	private int numberProct;
	public String getIdProduct() {
		return idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public double getPrice() {
		return price;
	}
	public int getNumberProct() {
		return numberProct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setNumberProct(int numberProct) {
		this.numberProct = numberProct;
	}

	@Override
	public String toString() {
		return idProduct + "|" + nameProduct + "|" + price + "|" + numberProct + "\n";
	}
}
