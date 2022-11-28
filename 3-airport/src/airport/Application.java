package airport;

public class Application {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("ABC123", 50, 43, false, 500);

        Airplane airplane2 = new Airplane("DDD888", 30, 23, false, 300);

        airplane1.loadPassengers();
        airplane1.takeOff();
        airplane2.loadPassengers();
        airplane1.land();
        airplane1.unloadPassengers();
        airplane2.takeOff();
        airplane2.land();
        airplane2.unloadPassengers();
    }
}
