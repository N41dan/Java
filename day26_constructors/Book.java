package day26_constructors;

public class Book {
	/*
	Create a Book class with the following properties:

	title: the title of the book (String)
	author: the author of the book (String)
	year: the year the book was published (int)
	isbn: the ISBN of the book (String)
	pages: the number of pages in the book (int)
	
	The Book class should have a parameterized constructor that takes in values for 
	each of the properties and sets them accordingly. 
	*/
	
	String title, author,isbn;
	int year, pages;
	
	//public Book() {}
	
	public Book(String title1) {
		title = title1;
	}

	public Book(String title, String author, String isbn, int year, int pages) {

		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
		this.pages = pages;
	}
	
	
	
	
	
	
	
	
}
