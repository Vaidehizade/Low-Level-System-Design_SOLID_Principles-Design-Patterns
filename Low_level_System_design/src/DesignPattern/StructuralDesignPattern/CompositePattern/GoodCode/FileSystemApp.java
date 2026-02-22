package DesignPattern.StructuralDesignPattern.CompositePattern.GoodCode;

import DesignPattern.StructuralDesignPattern.CompositePattern.GoodCode.File;
import DesignPattern.StructuralDesignPattern.CompositePattern.GoodCode.Folder;

public class FileSystemApp {

    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");
        FileSystemComponent folder = new Folder("Documents");
        ((Folder) folder).addComponents(file1);
        ((Folder) folder).addComponents(file2);

        //subfolder
        Folder subfolder = new Folder("subfolder");
        FileSystemComponent file3 = new File("File3.txt");
        subfolder.addComponents(file3);
        ((Folder) folder).addComponents(subfolder);
        folder.showDetails();
        //this code doesn't read files and folders uniformly
    }
}
