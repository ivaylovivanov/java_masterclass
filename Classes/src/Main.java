public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account();
        myAccount.setBalance(0.0);
        myAccount.setEmail("ivalentinov@gmail.com");
        myAccount.setName("Ivaylo Ivanov");
        myAccount.setNumber(1);
        myAccount.setPhoneNumber("+359887424989");

        System.out.println("Account Created: " +
                myAccount.getName() + " " +
                myAccount.getBalance() + " " +
                myAccount.getEmail() + " " +
                myAccount.getPhoneNumber() + " " +
                myAccount.getNumber());

        myAccount.depositFunds(110.11);
        System.out.println("Account Deposit: " +
                myAccount.getName() + " " +
                myAccount.getBalance() + " " +
                myAccount.getEmail() + " " +
                myAccount.getPhoneNumber() + " " +
                myAccount.getNumber());

        myAccount.withdrawFunds(22);
        System.out.println("Account Withdrawal: " +
                myAccount.getName() + " " +
                myAccount.getBalance() + " " +
                myAccount.getEmail() + " " +
                myAccount.getPhoneNumber() + " " +
                myAccount.getNumber());




    }
}