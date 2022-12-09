public class HomeWork01{
	public static void main(String[] args) {
		// 保存两本书名，用+拼接，看效果。保存两个性别，再加号拼接。保存两本书的价格，再加
		// 拼接
		String bookName1 = "三国演义";
		String bookName2 = "水浒传";
		String bookName = bookName1 + bookName2;
		System.out.println(bookName);
		char sex1 = '男';
		char sex2 = '女';
		String sex = sex1 + sex2;
		System.out.println(sex);
		double bookPrice1 = 55.9;
		double bookPrice2 = 53.6;
		String bookPrice = bookPrice1  + bookPrice2;
		System.out.println(bookPrice);
	}
}