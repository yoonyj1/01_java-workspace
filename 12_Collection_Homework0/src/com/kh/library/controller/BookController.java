package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	ArrayList<Book> bList = new ArrayList<>();
	
	@Override
	public void addBook(Book nBook) {
		boolean find = true;
		for (Book b : bList) {
			if(b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명: " + nBook.getTitle() + " 도서는 이미 소장하고 있는 책입니다.");
				find = false;
				break;
			}
		}
			if(find == true) {
				bList.add(nBook);
				System.out.println("도서명: " + nBook.getTitle() + " 도서가 성공적으로 추가되었습니다.");
			}
		} // for 끝
	

	@Override
	public ArrayList<Book> getAllBook() {
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		
		Book Book1 = new Book(null, null, null, null, 0, null);
		for (Book book : bList) {
			if (bNo.contains(book.getbNo())) {
				return book;
			} else {
				return Book1;
			}

		}
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> onlyBook = new ArrayList<Book>();
		for (Book book : bList) {
			if (book instanceof Book) {
				onlyBook.add(book);
			}
		}
		return onlyBook;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> onlyMagazine = new ArrayList<Book>();
		for (Book book : bList) {
			if (book instanceof Magazine) {
				onlyMagazine.add(book);
			}
		}
		return onlyMagazine;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for (Book book : bList) {
			total += book.getPrice();
		}
		return total;
	}

	@Override
	public int getAvgPrice() {
		return getTotalPrice() / bList.size();
	}
	

}
