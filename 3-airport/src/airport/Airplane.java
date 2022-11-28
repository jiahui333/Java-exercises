package airport;

public class Airplane {
    private final String planIdentification;
    private final int maxNumberOfPassengers;
    private final int currentNumberOfPassengers;
    private boolean ifFlying;
    private final double speed;

    public Airplane(String planIdentification, int maxNumberOfPassengers, int currentNumberOfPassengers, boolean ifFlying, double speed) {
        this.planIdentification = planIdentification;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.currentNumberOfPassengers = currentNumberOfPassengers;
        this.ifFlying = ifFlying;
        this.speed = speed;
    }

    public void loadPassengers () {
        if (currentNumberOfPassengers <= maxNumberOfPassengers) {
            System.out.println("Airplane " + planIdentification + " loads " + currentNumberOfPassengers + " passengers.");
        } else {
            System.out.println("Loading failed. The number of passengers exceeds the capacity.");
        }
    }

    public void unloadPassengers () {
        if (!ifFlying) {
            System.out.println("Airplane " + planIdentification + " unloads " + currentNumberOfPassengers + " passengers.");
        } else {
            System.out.println("Unloading failed. The plane is still flying.");
        }
    }

    public void takeOff () {
        if (!ifFlying) {
            ifFlying = true;
            System.out.println("Airplane " + planIdentification + " takes off.");
        } else {
            System.out.println("Taking off failed. The plane is already flying.");
        }
    }

    public void land () {
        if (ifFlying) {
            ifFlying = false;
            System.out.println("Plane " + planIdentification + " lands.");
        } else {
            System.out.println("Landing failed. The planed is already landed.");
        }
    }
}
