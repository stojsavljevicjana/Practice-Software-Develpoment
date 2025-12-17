package assignmant_3;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book ("Jana's autobiography", "ABC", "Jana", 2025, 100);
		Book b2 = new Book ("Croatia", "CBA", "Nika", 2020, 200);
		Magazine m1 = new Magazine ("Zadovoljna", "Nova", "February", 2022, 1);
		Magazine m2 = new Magazine ("Gloria", "Vecernji list", "April", 2024, 3);
		
		b1.displayDetails();
		b2.displayDetails();
		m1.displayDetails();
		m2.displayDetails();
		
        if (b1.isPublishedBefore(2024)) {
        	System.out.println("Book 1 is published before 2024.");
        }
        if (b2.isPublishedBefore(2024)) {
        	System.out.println("Book 2 is published before 2024.");
        }
        if (m1.isPublishedBefore(2024)) {
        	System.out.println("Magazine 1 is published before 2024.");
        }
        if (m2.isPublishedBefore(2024)) {
        	System.out.println("Magazine 2 is published before 2024.");
        }
        
        DVD d1 = new DVD ("Asterix and Obelix", "Hacchete", 1959, 30, "Laurent Tirard");
        DVD d2 = new DVD ("Titanic", "S&S", 1997, 194, "James Cameron");
        
        d1.displayDetails();
		d2.displayDetails();
		
        if (d1.isPublishedBefore(1990)) {
        	System.out.println("DVD 1 is published before 1990.");
        }
        if (d2.isPublishedBefore(1990)) {
        	System.out.println("DVD 2 is published before 1990.");
        }
}

}
