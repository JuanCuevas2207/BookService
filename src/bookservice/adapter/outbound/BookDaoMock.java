package bookservice.adapter.outbound;

import bookservice.domain.Book;
import bookservice.port.outbound.BookDaoInterface;
import java.util.HashMap;

public class BookDaoMock implements BookDaoInterface {
    private HashMap<String, Book> books = new HashMap<String, Book>();

    public BookDaoMock() {
        books.put("147852HG", new Book("The hunger games", "147852HG", "Susan Collins"));
        books.put("147852MZ", new Book("Maze runner", "147852MZ", "James Dashner"));
        books.put("143652CS", new Book("Cien años de soledad", "143652CS", "Gabriel Garcia Marquez"));
    }

    public Book get(String isbn) {        
        return books.get(isbn);
    }
}
