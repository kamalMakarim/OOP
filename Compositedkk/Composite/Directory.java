package Compositedkk.Composite;
import java.util.*;

class Directory implements FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();
    private String name;

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : children) {
            component.showDetails();
        }
    }
}
