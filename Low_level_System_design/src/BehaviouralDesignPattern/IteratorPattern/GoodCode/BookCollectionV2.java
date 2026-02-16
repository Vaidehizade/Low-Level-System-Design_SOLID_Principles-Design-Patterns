package BehaviouralDesignPattern.IteratorPattern.GoodCode;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class BookCollectionV2 implements Iterable<Book>{
    //public List<Book> books = new ArrayList<>();
    private Set<Book> books = new TreeSet<Book>();
    public void addBook(Book book){
        books.add(book);
    }

//    public List<Book> getBooks(){
//        return books;
//    }

//    public Iterator<Book> createIterator(){
//        return new BookIterator(this.books);
//    }

    @Override
//    public Iterator<Book> iterator() {
//        return new BookIterator(this.books);
//    }
    public Iterator<Book> iterator(){
        return books.iterator();
    }

    //WE WANT TO support the iteration irrespective of what collections we have used
    //Another Class (Nested class)
//    private class BookIterator implements Iterator<Book>{
//
//        private List<Book> books;
//        private int position = 0;
//
//        public BookIterator(List<Book> books){
//            this.books = books;
//        }
//        @Override
//        public boolean hasNext() {
//            return position < books.size();  //if my position is less than books.size that means I have books
//        }
//
//        @Override
//        public Book next() {
//            return books.get(position++);
//        }
//    }
}

