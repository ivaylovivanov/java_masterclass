public class Main {
    public static void main(String[] args) {

        Account bobAccount = new Account(2, 0.0, "Ivaylo Ivanov", "test@test.com", "+0123456789");

        System.out.println("Account Created: " +
                bobAccount.getName() + " " +
                bobAccount.getBalance() + " " +
                bobAccount.getEmail() + " " +
                bobAccount.getPhoneNumber() + " " +
                bobAccount.getNumber());

        System.out.println(bobAccount.getNumber());
        System.out.println(bobAccount.getBalance());

        bobAccount.depositFunds(110.11);
        System.out.println("Account Deposit: " +
                bobAccount.getName() + " " +
                bobAccount.getBalance() + " " +
                bobAccount.getEmail() + " " +
                bobAccount.getPhoneNumber() + " " +
                bobAccount.getNumber());

        bobAccount.withdrawFunds(22);
        System.out.println("Account Withdrawal: " +
                bobAccount.getName() + " " +
                bobAccount.getBalance() + " " +
                bobAccount.getEmail() + " " +
                bobAccount.getPhoneNumber() + " " +
                bobAccount.getNumber());




    }
}