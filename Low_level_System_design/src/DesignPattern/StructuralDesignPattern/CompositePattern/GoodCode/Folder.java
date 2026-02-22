package DesignPattern.StructuralDesignPattern.CompositePattern.GoodCode;

import DesignPattern.StructuralDesignPattern.CompositePattern.GoodCode.File;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private String name;
    //thi should hold files or folder or both
    //so that's why we are using this interface
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }
    public void addComponents(FileSystemComponent component){
        components.add(component);
    }
    public void showDetails(){
        System.out.println("folder: "+name);
        for(FileSystemComponent component : components){
            component.showDetails();
            //this function can be recursive in nature
            //folders chya aatmadhe file jayla
        }
    }
}
