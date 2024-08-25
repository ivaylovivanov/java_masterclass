public class CE34Calculator {
    private CE34Floor floor;
    private CE34Carpet carpet;

    public CE34Calculator(CE34Floor floor, CE34Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
