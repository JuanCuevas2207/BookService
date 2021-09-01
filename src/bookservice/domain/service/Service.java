package bookservice.domain.service;

import bookservice.adapter.outbound.BookDaoMock;
import bookservice.domain.Book;
import bookservice.port.outbound.BookDaoInterface;

public class Service {
    
    private BookDaoInterface dao;
    private BookDaoMock dao2 = new BookDaoMock();
    
    public Service(){
        
    }

    public Service(BookDaoInterface bookDao) {
        dao = bookDao;
    }

    public Book search(String isbn) {
        return dao2.get(isbn);
    }
}
