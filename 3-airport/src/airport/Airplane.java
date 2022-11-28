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

    public void loadPassengers (int loadNumber) {
        int totalNumberOfPassengers = currentNumberOfPassengers + loadNumber;
        if (currentNumberOfPassengers <= maxNumberOfPassengers | ifFlying | totalNumberOfPassengers <= maxNumberOfPassengers) {
            System.out.println("Airplane " + planIdentification + " loads " + loadNumber  + " passengers.");
        } else {
            System.out.println("Loading failed.");
        }
    }

    public void unloadPassengers (int unLoadNumber) {
        int totalNumberOfPassengers = currentNumberOfPassengers - unLoadNumber;
        if (!ifFlying | totalNumberOfPassengers >= 0) {
            System.out.println("Airplane " + planIdentification + " unloads " + unLoadNumber + " passengers.");
        } else {
            System.out.println("Unloading failed.");
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
