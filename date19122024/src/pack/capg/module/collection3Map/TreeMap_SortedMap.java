package pack.capg.module.collection3Map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class Book {
	
	private String author;
	private double price;
	public Book(String author, double price) {
		super();
		this.author = author;
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book [ Author= "+ author +", price = "+price +"]";
	}
	
	
}

class BookStore{
	private SortedMap<String, Book> bookMap;
	
	public BookStore() {
		super();
		bookMap = new TreeMap<String, Book>();
	}
	
	public void addBook(String title, String author, double price) {
		Book book = new Book(author, price);
		bookMap.put(title, book);
	}
	
	public void display() {
		for(Map.Entry<String, Book> entry : bookMap.entrySet()) {
			System.out.println("Title: "+entry.getKey()+" "+entry.getValue());
		}
	}
									// inclusive		// exclusive
	public void displayBooksInRange(String fromTitle, String toTitle) {
		SortedMap<String, Book> subMap = bookMap.subMap(fromTitle, toTitle);
		System.out.println("Book in the range: ");
		for (Map.Entry<String, Book> entry : subMap.entrySet()) {
			System.out.println("Title: "+entry.getKey()+" "+entry.getValue());
		}
	}
	
	public void getFirstBook() {
		System.out.println("First Book: " + bookMap.firstKey());
		
	}
	
	public void getLastBook() {
		System.out.println("LastBoook: "+bookMap.lastKey());
	}
}

public class TreeMap_SortedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore store = new BookStore();
		store.addBook("Java progg", "John smith", 2000);
		store.addBook("Data structure", "Jan", 3000);
		store.addBook("Adv Java", "Alice", 2500);
		store.addBook("Web dev", "David", 2200);
		store.addBook("Python prog", "Bob", 1800);
		store.addBook("Javascript", "Joe", 1900);
	
		System.out.println("All books in the store: ");
		store.display();
		
		System.out.println();
		store.displayBooksInRange("Data structure", "Python progg");
		
		System.out.println();
		store.getFirstBook();
		
		store.getLastBook();
	
	}

}
