
	public class Book {
	public String Name;
	public String pubDate;
	public String author;
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
		this.Name = name;
	}
	/**
	 * @return the pubDate
	 */
	public String getPubDate() {
		return pubDate;
	}
	/**
	 * @param pubDate the pubDate to set
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book() {
		
	}
	public Book(Book book) {
	this.Name = book.Name;
	this.pubDate = book.pubDate;
	this.author = book.author;
	}
	

}
