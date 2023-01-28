package pl.javastart.task;

public class FloorPanel {
    String name;
    char abrasionClass;
    int thickness;

    String getFullDescription() {
        return "name: " + name +
                ", abrasion class: " + abrasionClass +
                ", thickness: " + thickness;
    }
}
