package DesignPattern.TemplatePattern.BadCode;


class CSVParser{

    public void parse(){
        openFile();
        //csv specific parsing logic
        System.out.println("Parsing a csv file");
        closeFile();
    }
    private void openFile(){
        System.out.println("Opening a csv file");
    }
    private void closeFile(){
        System.out.println("Closing a csv file");
    }
}

class JSONParser{
    public void parse(){
        openFile();
        System.out.println("Parsing a json file");
        closeFile();
    }

    //code duplication
    private void openFile(){
        System.out.println("Opening a json file");
    }
    private void closeFile(){
        System.out.println("Closing a json file");
    }
}

public class WithoutTemplateMethod {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();
        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();
    }
}
