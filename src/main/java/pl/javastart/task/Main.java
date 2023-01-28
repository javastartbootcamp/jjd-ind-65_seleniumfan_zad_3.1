package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        FloorPanel panel1 = new FloorPanel();
        FloorPanel panel2 = new FloorPanel();

        panel1.name = "Florida Beautiful Panel";
        panel1.thickness = 7;
        panel1.abrasionClass = 'C';

        panel2.name = "Classic Panel";
        panel2.thickness = 12;
        panel2.abrasionClass = 'B';

        System.out.println(panel1.getFullDescription());
        System.out.println(panel2.getFullDescription());
    }
}
