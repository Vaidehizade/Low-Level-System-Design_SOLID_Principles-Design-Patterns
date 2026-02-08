package SOLID_principles.GoodCode.ISP;

import SOLID_principles.BadCode.ISP.Document;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printed");
    }
}
