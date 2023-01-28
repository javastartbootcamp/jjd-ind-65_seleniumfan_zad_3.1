package pl.javastart.task;

public class FloorPanel {
    String name;
    char abrasionClass;
    int thickness;

    public FloorPanel(String name, char abrasionClass, int thickness) {
        this.name = name;
        this.abrasionClass = abrasionClass;
        this.thickness = thickness;
    }

    String getFullDescription() {
        return "name: " + name +
                ", abrasion class: " + abrasionClass +
                ", thickness: " + thickness;
    }
}
