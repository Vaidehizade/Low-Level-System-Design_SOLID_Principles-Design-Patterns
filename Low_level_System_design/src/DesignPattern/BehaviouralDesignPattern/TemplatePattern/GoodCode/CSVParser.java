package BehaviouralDesignPattern.TemplatePattern.GoodCode;

public class CSVParser extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("parsing csv data");
    }
}
