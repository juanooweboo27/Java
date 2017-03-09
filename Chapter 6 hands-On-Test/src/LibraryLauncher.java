import java.util.Scanner;

public class LibraryLauncher {

	public static void main(String[] args) {
		Book myBook = new Book();
	
		Scanner userInput = new Scanner(System.in);
		String name, date, author;
		System.out.println("Enter the name of your book");
		name = userInput.nextLine();
		System.out.println("Enter the date it was published");
		date = userInput.nextLine();
		System.out.println("Enter the name of the author");
		author = userInput.nextLine();
		myBook.setName(name);
		myBook.setPubDate(date);
		myBook.setAuthor(author);
		/*
		myBook.setName("Juan");
		myBook.setPubDate("123");
		myBook.setAuthor("juan");
		*/
		Library myLibrary = new Library(myBook);
		myLibrary.setName("Juan's Library");
		
		//System.out.println(myLibrary.toString());
		System.out.println(myLibrary.getName());
		

	}

}
