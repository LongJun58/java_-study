public class HomeWork03{
	public static void main(String[] args) {
		//������
		Book book = new Book(900);
		book.updatePrice();
		System.out.println("book�ļ۸�" + book.price);
	}
}

class Book{
	double price;
	public Book(double price){
		this.price = price;
	}
	public void updatePrice(){
		if(price > 150){
			price = 150;
		}else if (price > 100){
			price = 100;
		}
	}
}