package assignment1;

public class App {
    public static void main(String[] args) {
        Door door = new Door(100, 600, true);

        door.printOpen();
        door.closeDoor();
        door.printOpen();
    }
}
