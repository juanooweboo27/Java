
public class Library {
	private String Name;
	private Book book;
	public Library(Book book) {
		this.setBook(new Book());
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	public void setBook(Book book){
		this.setBook(new Book(book));
	}
	public Book getBook(){
		return new Book(book);
	}
	
	public String toString(){
		String str;
		str = "Library Name: " + this.getName();
		str += "Name: " + book.getName();
		str+= "Publish Date: " + book.getPubDate();
		str += "Author: " + book.getAuthor();
		return str;
	}

}
