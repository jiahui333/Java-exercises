package assignment1;

public class Door {
    double width;
    double height;
    boolean open;

    public Door(double width, double height, boolean open) {
        this.width = width;
        this.height = height;
        this.open = open;
    }

    public void openDoor() {
        open = true;
        System.out.println("Opening door");
    }

    public void closeDoor() {
        open = false;
        System.out.println("Closing door");
    }

    public void printOpen() {
        if (open) {
            System.out.println("The door is open");
        } else {
            System.out.println("The door is closed");
        }
    }

    public double calculateSurface () {
        return width * height;
    }
}
