package SOLID_principles.GoodCode.LSP;

public class ReadOnlyFile extends ReadableFile{
    @Override
    public void read() {
        System.out.println("reading to a file which is read only");
    }
}
