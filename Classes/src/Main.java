public class Main {
    public static void main(String[] args) {

        Customer myCustomer = new Customer("Tim", 1000.0, "tim@gmail.com");
        System.out.println(myCustomer.getName());
        System.out.println(myCustomer.getCreditLimit());
        System.out.println(myCustomer.getEmailAddress());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());

        Customer thirdCustomer = new Customer("Joe", "joe@emai.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());

    }
}