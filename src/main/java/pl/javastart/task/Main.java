package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        FloorPanel panel1 = new FloorPanel("Florida Beautiful Panel", 'C', 7);
        FloorPanel panel2 = new FloorPanel("Classic Panel", 'B', 12);

        System.out.println(panel1.getFullDescription());
        System.out.println(panel2.getFullDescription());
    }
}
