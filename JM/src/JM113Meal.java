public class JM113Meal {
    private JM113Burger burger;
    private JM113Item drink;
    private JM113Item sideItem;

    public JM113Meal(){
        this("regular", "coke", "fries");
    }
    public JM113Meal(String burgerType, String drinkType, String sideType) {
        this.burger = new JM113Burger(burgerType, 4.0);
        this.drink = new JM113Item(drinkType, 1.00, "drink");
        this.sideItem = new JM113Item(sideType, 1.50, "side");
    }

    public double getTotalPrice(){
        return sideItem.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        sideItem.printItem();
        System.out.println("-".repeat(30));
        JM113Item.printItem("Total Price", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String drinkSize){
        drink.setSize(drinkSize);
    }
}
