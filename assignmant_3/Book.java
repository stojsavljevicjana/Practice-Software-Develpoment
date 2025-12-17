package assignmant_3;

public class Book extends LibraryItem {
	private String author;
	private int numPages;
	
	public Book(String title, String publisher, String autor, int year, int numPages) {
		super(title, publisher, year);
		this.author = autor;
		this.numPages = numPages;
	}
	
	public String getAutor() {
		return this.author;
	}
	
	public int getNumPages() {
		return this.numPages;
	}
	
	public void displayDetails() {
		System.out.println("Title of book is "  + this.getTitle() + ", publisher is " + this.getPublisher() + ", author is " + this.author + ", year is " + this.getYear() + ", number of pages are " + this.numPages + ".");
		
	}
	
}
