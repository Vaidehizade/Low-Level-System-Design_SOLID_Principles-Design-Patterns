package SOLID_principles.GoodCode.LSP;

public class WritableFile extends ReadableFile implements Writable{

    public void write()
    {
        System.out.println("writing to a file");
    }
}
