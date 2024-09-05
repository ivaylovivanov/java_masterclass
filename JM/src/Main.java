public class Main {
    public static void main(String[] args) {

        JM111Car car = new JM111Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        JM111Car ferrari = new GasPoweredCar("2022 Red Ferrari Modena", 6, 15.4);
        runRace(ferrari);

    }

    public static void runRace(JM111Car car){
        car.startEngine();
        car.drive();
    }
}