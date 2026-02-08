package SOLID_principles.BadCode.ISP;

public class SimplePrinter implements Machine{
    @Override
    public void print(Document doc) {
       System.out.println("print the document");
    }
    //simple printer doesn't need scan and copy methods
    //violation of ISP Principle
    @Override
    public void copy(Document doc) {
      System.out.println("Copy the documents");
    }

    @Override
    public void scan(Document doc) {
      System.out.println("scan the documents");
    }
}
