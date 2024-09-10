public class JM111Car {
    private String description;

    public JM111Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> Engine -> start");
    }

    public void drive(){
        System.out.println("Car Driving Type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
}

class GasPoweredCar extends JM111Car {
    private int cylinders = 6;
    private double avgKmPerLitre;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, int cylinders, double avgKmPerLitre) {
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average %.2f %n", avgKmPerLitre);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready! %n", this.cylinders);
    }
}

class ElectricCar extends JM111Car {
    private int batterySize;
    private double avgKmPerCharge;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, int batterySize, double avgKmPerCharge) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends JM111Car {
    private int batterySize;
    private double avgKmPerLitre;
    private int cylinders;

    public HybridCar(String description, int batterySize, double avgKmPerLitre, int cylinders) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average %.2f %n", avgKmPerLitre);
    }
}
