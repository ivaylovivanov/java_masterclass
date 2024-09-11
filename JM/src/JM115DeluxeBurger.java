public class JM115DeluxeBurger extends JM113Burger{
    private JM113Item deluxe1;
    private JM113Item deluxe2;

    public JM115DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new JM113Item(extra4, 0, "TOPPING");
        deluxe2 = new JM113Item(extra5, 0, "TOPPING");
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }

        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
