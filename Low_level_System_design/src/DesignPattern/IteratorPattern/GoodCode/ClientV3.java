package DesignPattern.IteratorPattern.GoodCode;
import java.util.Iterator;

public class ClientV3 {
    public static void main(String[] args) {
        BookCollectionV2 bookCollection = new BookCollectionV2();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python book"));

        Iterator<Book> iterator = bookCollection.iterator();
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }
        //so client code doesn't need to change bookcollection class madhe change hoil
    }
}
