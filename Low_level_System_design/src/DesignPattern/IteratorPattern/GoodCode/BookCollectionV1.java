package DesignPattern.IteratorPattern.GoodCode;

import DesignPattern.IteratorPattern.GoodCode.Book;
import java.util.ArrayList;
import java.util.List;

public class BookCollectionV1 {
    public List<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public Iterator<Book> createIterator(){
        return new BookIterator(this.books);
    }
    //WE WANT TO support the iteration irrespective of what collections we have used
    //Another Class (Nested class)
    private class BookIterator implements Iterator<Book>{

        private List<Book> books;
        private int position = 0;

        public BookIterator(List<Book> books){
            this.books = books;
        }
        @Override
        public boolean hasNext() {
            return position < books.size();  //if my position is less than books.size that means I have books
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }
}
