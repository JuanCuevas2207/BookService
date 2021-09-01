package bookservice.port.outbound;

import bookservice.domain.Book;

public interface BookDaoInterface {
    Book get(String isbn);
}
