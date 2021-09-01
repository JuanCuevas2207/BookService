package bookservice;

import bookservice.adapter.inbound.HttpApi;
import bookservice.domain.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookService {
    
    public static void main(String[] args) throws IOException {
        HttpApi request = new HttpApi();
        
        BufferedReader reader =
                   new BufferedReader(new InputStreamReader(System.in));
        
        //Samples 147852HG, 147852MZ, 143652CS
        String isbn = reader.readLine();
        
        try{
            Book book = request.get(isbn);
        
            System.out.println("Nombre del libro: "+book.getTitle());   
            System.out.println("Autor: "+book.getAuthor());
        }catch(Exception e){
            System.out.println("El libro buscado no existe en la base de datos");
        }
    }

}
