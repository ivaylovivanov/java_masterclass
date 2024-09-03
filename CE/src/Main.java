public class Main {
    public static void main(String[] args) {
        CE38Wall wall1 = new CE38Wall("West");
        CE38Wall wall2 = new CE38Wall("East");
        CE38Wall wall3 = new CE38Wall("South");
        CE38Wall wall4 = new CE38Wall("North");

        CE38Ceiling ceiling = new CE38Ceiling(12, 55);

        CE38Bed bed = new CE38Bed("Modern", 4, 3, 2, 1);

        CE38Lamp lamp = new CE38Lamp("Classic", false, 75);

        CE38Bedroom bedRoom = new CE38Bedroom("Ivo", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}