package SOLID_principles.BadCode.ISP;

public class MultipurposePrinter implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("printing the document.....");
    }
    @Override
    public void copy(Document doc) {
      System.out.println("copy the document....");
    }
    @Override
    public void scan(Document doc) {
        System.out.println("Scan the document.......");
    }
}
