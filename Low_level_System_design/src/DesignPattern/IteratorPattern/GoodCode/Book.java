package DesignPattern.IteratorPattern.GoodCode;

public class Book implements Comparable<Book>{

    private final String title;
    public Book(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public String toString(){
        return "Book{" + "title='" + title + '\'' + '}';
    }

    public int compareTo(Book o){
        return this.title.compareTo(o.title);
    }
}
