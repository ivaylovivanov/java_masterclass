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
    private int baterrySize;
    private double avgKmPerCharge;

    public ElectricCar(String description, int baterrySize, double avgKmPerCharge) {
        super(description);
        this.baterrySize = baterrySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }
}

class HybridCar extends JM111Car {
    private int baterrySize;
    private double avgKmPerLitre;
    private int cylinders;

    public HybridCar(String description, int baterrySize, double avgKmPerLitre, int cylinders) {
        super(description);
        this.baterrySize = baterrySize;
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
}
