package DesignPattern.IteratorPattern.BadCode;

public class ClientV1 {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python book"));

        for(int i=0; i<bookCollection.getBooks().size(); i++){
            System.out.println(bookCollection.getBooks().get(i));
            //if the book collection implementation contains tree map then this doesn't contain get(i) so this code will break
        }
    }
}
