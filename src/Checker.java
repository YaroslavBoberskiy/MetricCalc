public class Checker {

    public static void main(String[] args) {

        Account user1 = new Account();
        Account user2 = new Account();

        user1.depositTransaction(100);
        user2.withdrawalTransaction(100);

        System.out.println("User 1 getAccountBalance: " + user1.getAccountBalance());
        System.out.println("User 2 getAccountBalance: " + user2.getAccountBalance());

        user2.depositTransaction(550);
        user1.withdrawalTransaction(400);

        System.out.println("User 1 getAccountBalance: " + user1.getAccountBalance());
        System.out.println("User 2 getAccountBalance: " + user2.getAccountBalance());
    }
}
