
package genericsCollection;

import java.util.HashMap;

class Book {
	int id, quantity;
	String name, author;

	public Book(String name, String author, int id, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
}

public class Q05_Library {
	public static boolean isPresent(HashMap<Integer, Book> list, String name) {
		for (Book book : list.values()) {
			return book.name.equals(name);
		}
		return false;
	}

	public static void removeBook(HashMap<Integer, Book> list, int key) {
		list.remove(key);
	}

	public static void main(String[] args) {

		Book b1 = new Book("Book1", "Author1", 123, 50);
		Book b2 = new Book("Book2", "Author2", 456, 81);
		Book b3 = new Book("Book3", "Author3", 789, 25);
		Book b4 = new Book("Book4", "Author4", 479, 12);
		Book b5 = new Book("Book5", "Author5", 179, 120);

		HashMap<Integer, Book> list = new HashMap<>();
		list.put(b1.id, b1);
		list.put(b2.id, b2);
		list.put(b3.id, b3);
		list.put(b4.id, b4);

		System.out.println(isPresent(list, b5.name));
		removeBook(list, b3.id);

		for (int key : list.keySet()) {
			System.out.println("Id:" + key + " Book:" + list.get(key).name);
		}
	}
}
