package DesignPattern.StructuralDesignPattern.CompositePattern.BadCode;

public class FileSystemApp {

    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        Folder folder = new Folder("Documents");
        folder.addFile(file1);
        folder.addFile(file2);
        folder.showDetails();
        //this code doesn't read files and folders uniformly
    }
}
