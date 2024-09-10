public class Main {
    public static void main(String[] args) {

        JM111Car car = new JM111Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        JM111Car ferrari = new GasPoweredCar("2022 Red Ferrari Modena", 6, 15.4);
        runRace(ferrari);

        JM111Car tesla = new ElectricCar("2022 Red tesla Model 3", 75, 568);
        runRace(tesla);

        JM111Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 8, 16, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(JM111Car car){
        car.startEngine();
        car.drive();
    }
}