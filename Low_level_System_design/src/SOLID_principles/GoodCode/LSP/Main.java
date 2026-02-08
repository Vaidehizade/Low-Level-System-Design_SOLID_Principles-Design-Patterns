package SOLID_principles.GoodCode.LSP;

public class Main {

    public static void readAnyFile(ReadableFile file){
        file.read();
    }
    public static void main(String[] args){
       ReadableFile rfile = new ReadOnlyFile();
       rfile.read();

       WritableFile wfile = new WritableFile();
       wfile.read();
       wfile.write();

       readAnyFile(rfile);
       readAnyFile(wfile);

    }
}
