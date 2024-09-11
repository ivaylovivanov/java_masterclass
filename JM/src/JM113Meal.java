public class JM113Meal {
    private JM113Burger burger;
    private JM113Item drink;
    private JM113Item sideItem;

    public JM113Meal(String burgerType, String drinkType, String sideType) {
        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new JM115DeluxeBurger(burgerType, 8.50);
        } else {
            this.burger = new JM113Burger(burgerType, 4.0);
        }

        this.drink = new JM113Item(drinkType, 1.00, "drink");
        this.sideItem = new JM113Item(sideType, 1.50, "side");
    }

    public double getTotalPrice(){
        if (burger instanceof JM115DeluxeBurger){
            return burger.getAdjustedPrice();
        }
        return sideItem.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        if(burger instanceof JM115DeluxeBurger){
            JM113Item.printItem(drink.getName(), 0);
            JM113Item.printItem(sideItem.getName(), 0);
        } else {
            drink.printItem();
            sideItem.printItem();
        }

        System.out.println("-".repeat(30));
        JM113Item.printItem("Total Price", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5){
        if(burger instanceof JM115DeluxeBurger db){
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }

    }

    public void setDrinkSize(String drinkSize){
        drink.setSize(drinkSize);
    }
}
