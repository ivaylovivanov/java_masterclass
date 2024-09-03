public class CE38Bedroom {
    private String name;
    private CE38Wall wall1, wall2, wall3, wall4;
    private CE38Ceiling ceiling;
    private CE38Bed bed;
    private CE38Lamp lamp;

    public CE38Bedroom(String name, CE38Wall wall1, CE38Wall wall2, CE38Wall wall3, CE38Wall wall4, CE38Ceiling ceiling, CE38Bed bed, CE38Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public CE38Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }
}
