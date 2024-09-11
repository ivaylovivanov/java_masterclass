public class JM113Burger extends JM113Item{
    private String toppings;
    private JM113Item extra1;
    private JM113Item extra2;
    private JM113Item extra3;


    public JM113Burger(String name, double price) {
        super(name, price, "Burger");
        this.toppings = "";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());

    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new JM113Item(extra1, getExtraPrice(extra1), "TOPPING");
        this.extra2 = new JM113Item(extra2, getExtraPrice(extra2), "TOPPING");
        this.extra3 = new JM113Item(extra3, getExtraPrice(extra3), "TOPPING");
    }

    public double getExtraPrice(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMIA" -> 1.5;
            default -> 0.0;
        };
    }

    public void printItemizedList(){
        printItem("BASE BURGER", getBasePrice());
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
