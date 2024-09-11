public class JM113Item {
    private String name;
    private double price;
    private String size = "MEDIUM";
    private String type;

    public JM113Item(String name, double price, String type) {
        this.name = name.toUpperCase();
        this.price = price;
        this.type = type.toUpperCase();
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice(){
        return switch (size){
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }
}
