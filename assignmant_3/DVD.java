package assignmant_3;

public class DVD extends LibraryItem {
	private int duration;
	private String director;
	
	public DVD(String title, String publisher, int year, int duration, String director) {
		super(title, publisher, year);
		this.duration = duration;
		this.director = director;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public void displayDetails() {
		System.out.println("Title of DVD is " + this.getTitle() + ", publisher is " + this.getPublisher() + ", year is " + this.getYear() + ", duration is " + this.duration + " min" +  ", director is " + this.director +  ".");
	} 

}
