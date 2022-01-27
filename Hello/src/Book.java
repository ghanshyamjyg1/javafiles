
public class Book {

	private int bookId;
	private String bookName;
	private String author;
	private float price;
	private int noOfBooks;
	
	

	void Accept(int bookId, String bookName, String author, float price, int noOfBooks) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.noOfBooks = noOfBooks;
	}
	void Print() {
		System.out.println("Book ID :"+bookId);
		System.out.println("Book Name :"+bookName);
		System.out.println("Author Name :"+author);
		System.out.println("Price :"+price);
		System.out.println("No of Books :"+noOfBooks);
		System.out.println("Total cost :"+Calculate());
		System.out.println("Selling Cost :"+Discount());
	}
	
	float Calculate() {
		float totalCost=noOfBooks*price;
		return totalCost;
	}
	float Discount() {
		float discount;
		float sellingCost;
		if(noOfBooks>10) 
			discount=noOfBooks*price*10/100;
		else
			discount=noOfBooks*price*7/100;
		
		sellingCost=Calculate()-discount;
		return sellingCost;
		
	}
	
	
	
	
}
