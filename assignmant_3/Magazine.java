package assignmant_3;

public class Magazine extends LibraryItem {
	private int issueNumber;
	private String month;
	
	public Magazine(String title, String publisher, String month, int year, int issueNumber) {
		super(title, publisher, year);
		this.issueNumber = issueNumber;
		this.month = month;
	}
	
	public String getMonth() {
		return this.month;
	}
	
	public int getIssueNumber() {
		return this.issueNumber;
	}

	public void displayDetails() {
		System.out.println("Title of magazine is " + this.getTitle() + ", publisher is " + this.getPublisher() + ", month is " + this.month + ", year is " + this.getYear() + ", issue number is " + this.issueNumber + ".");
		
	}

}
