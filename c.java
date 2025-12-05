class Bicycle {
    int gear;
    void braking() {
        System.out.println("Braking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Bicycle sportsBicycle = new Bicycle();
        sportsBicycle.gear = 5;
        System.out.println("Gear: " + sportsBicycle.gear);
        sportsBicycle.braking();
    }
}
