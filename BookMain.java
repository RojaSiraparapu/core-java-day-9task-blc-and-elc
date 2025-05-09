package com.blc.elc;

public class BookMain {
	public static void main(String [] args) {
		
	Book book=new Book();
	
	book.setBookDetails("java Basics","john doe",550);
	String res=book.getBookDetails();
			System.out.println(res);

}

}


