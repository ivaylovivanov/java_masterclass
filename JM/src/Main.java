public class Main {
    public static void main(String[] args) {
        JM102SmartKitchen smartKitchen = new JM102SmartKitchen();

        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();

        smartKitchen.setKitchenState(false, true, false);
        smartKitchen.doKitchenWork();


    }
}