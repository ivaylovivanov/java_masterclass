public class JM102SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public JM102SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox =  new Refrigerator();
    }

    public void addWater(boolean hasWorkForCoffeeMaker){
        brewMaster.setHasWorkToDo(hasWorkForCoffeeMaker);
    }

    public void pourMilk(boolean hasWorkForRefrigerator){
        iceBox.setHasWorkToDo(hasWorkForRefrigerator);
    }

    public void loadDishWasher(boolean hasWorkForDishWasher){
        dishWasher.setHasWorkToDo(hasWorkForDishWasher);
    }

    public void setKitchenState(boolean hasWorkForCoffeeMaker, boolean hasWorkForRefrigerator, boolean hasWorkForDishWasher){
        addWater(hasWorkForCoffeeMaker);
        pourMilk(hasWorkForRefrigerator);
        loadDishWasher(hasWorkForDishWasher);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}
