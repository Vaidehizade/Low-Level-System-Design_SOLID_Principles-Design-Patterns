package DesignPattern.TemplatePattern.GoodCode;

abstract class DataParser{


    //template method
    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }
    // ----
    protected void openFile(){
        System.out.println("Opening a file....");
    }

    protected void closeFile(){
        System.out.println("Closing a file....");
    }

    protected abstract void parseData();

}

public class WithTemplatePattern {
    public static void main(String[] args) {
        DataParser csvParser = new JSONParser();
        DataParser jsonParser = new CSVParser();
        csvParser.parse();
        jsonParser.parse();

    }
}
