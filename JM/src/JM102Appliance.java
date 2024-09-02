public class JM102Appliance {
    private boolean hasWorkToDo;

    public JM102Appliance() {
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends JM102Appliance {
    public Refrigerator() {
        super();
    }

    public void orderFood(){
        if(isHasWorkToDo()){
            System.out.println("Order food");
            setHasWorkToDo(false);
        } else {
            System.out.println("No pending actions for refrigerator");
        }
    }
}

class DishWasher extends JM102Appliance {
    public DishWasher() {

    }
    public void doDishes(){
        if(isHasWorkToDo()){
            System.out.println("Doing dishes");
            setHasWorkToDo(false);
        } else {
            System.out.println("No pending actions for dishwasher");
        }
    }
}

class CoffeeMaker extends JM102Appliance {
    public CoffeeMaker() {

    }

    public void brewCoffee(){
        if(isHasWorkToDo()){
            System.out.println("Brewing coffee");
            setHasWorkToDo(false);
        } else {
            System.out.println("No pending actions for coffee maker");
        }
    }
}
