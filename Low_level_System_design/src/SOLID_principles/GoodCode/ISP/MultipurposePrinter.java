package SOLID_principles.GoodCode.ISP;

import SOLID_principles.BadCode.ISP.Document;

//achieved flexibility
public class MultipurposePrinter implements Printer,Copier,Scanner{
    @Override
    public void print(Document doc) {
        System.out.println("Printed");

    }

    @Override
    public void copy(Document doc) {
        System.out.println("copied");

    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanned");
    }
}
