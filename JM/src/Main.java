public class Main {
    public static void main(String[] args) {

//        JM113Item coke = new JM113Item("coke", 1.50, "drink");
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        JM113Item avocado = new JM113Item("avocado", 1.50, "Topping");
//        avocado.printItem();

//        JM113Burger burger = new JM113Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        JM113Meal regularMeal = new JM113Meal();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        JM113Meal secondMeal = new JM113Meal("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("Lettuce", "CHeese", "Mayo");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
    }
}