public class CE34Carpet {
    private double cost;

    public CE34Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
