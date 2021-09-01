package bookservice.adapter.inbound;


import bookservice.domain.Book;
import bookservice.domain.service.Service;
import bookservice.port.inbound.ApiInterface;

public class HttpApi implements ApiInterface {
    private Service service = new Service();
    
    public HttpApi() {
        
    }
    
    public HttpApi(Service service) {
        this.service = service;
    }

    // TODO implement HTTP endpoint
    public Book get(String isbn) {
        return service.search(isbn);
    }
}
