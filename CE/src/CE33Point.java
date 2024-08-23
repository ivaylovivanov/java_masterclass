public class CE33Point {
    private int x;
    private int y;

    public CE33Point() {
    }

    public CE33Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return distance(0, 0);
    }

    public double distance(CE33Point point){
        return distance(point.x, point.y);
    }

    public double distance(int x, int y){
        double distance;

        distance = Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));

        return distance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
