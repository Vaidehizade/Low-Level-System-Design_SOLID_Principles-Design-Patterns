package DesignPattern.IteratorPattern.GoodCode;

import DesignPattern.IteratorPattern.GoodCode.Book;
import DesignPattern.IteratorPattern.GoodCode.BookCollectionV1;

public class ClientV2 {
    public static void main(String[] args) {
        BookCollectionV1 bookCollection = new BookCollectionV1();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python book"));

       Iterator<Book> iterator = bookCollection.createIterator();
       while(iterator.hasNext()){
           Book book = iterator.next();
           System.out.println(book);
       }
       //so client code doesn't need to change bookcollection class madhe change hoil
    }
}
