package bookservice.port.inbound;

import bookservice.domain.Book;

public interface ApiInterface {
    Book get(String isbn);
}
