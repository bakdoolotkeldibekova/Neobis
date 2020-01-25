import java.util.Scanner;

abstract class Book {
	String title;
	String author;
	//int price;
	
	abstract void setTitle(String book_title);
	abstract void setAuthor(String book_author);
	abstract void setPrice(int book_price);
	
	String getTitle() {
		return title;		
	}

	String getAuthor() {
		return author;		
	}

	int getPrice() {
		return price;		
	}
}


//Класс MyBook наследуется от класса Book 

class MyBook extends Book {
	void setTitle(String book_title) {
		title = book_title;
	}
	
	void setAuthor(String book_author) {
		author = book_author;
	}

	void setPrice(int book_price) {
		price = book_price;
	}
}



class Abstract {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите название книги: ");
		String title = scanner.nextLine();
		System.out.print("Введите автора: ");
		String author = scanner.nextLine();
		System.out.print("Введите цену: ");
		int price = scanner.nextInt();
		
		//Отправляю значения переменных через метод setter
		MyBook new_book = new MyBook();
		new_book.setTitle(title);
		new_book.setAuthor(author);		
		new_book.setPrice(price);
		scanner.close();
		
		//Принимаю значения через метод getter
		System.out.println("Title: " + new_book.getTitle());
		System.out.println("Author: " + new_book.getAuthor());
		System.out.println("Price: " + new_book.getPrice());		
		System.out.println();		
	}
}
