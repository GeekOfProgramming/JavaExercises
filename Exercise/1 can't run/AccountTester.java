public class AccountTester {

    public static void main(String[] args) {
        Account a1 = new Account("A101", " Tan Ah Teck", 88);
        System.out.println(a1);

        Account a2 = new Account("A102", " Kumar");
        System.out.println(a2);

        System.out.println("ID=" + a1.getId());
        System.out.println("Name=" + a1.getName());
        System.out.println("Balance=" + a1.getBalance());

        a1.transferTo(a2, 50);
        System.out.println(a1);
        System.out.println(a2);

    }

    /*
     * Account[id=A101,name=Tan Ah Teck,balance=88]
     * Account[id=A102,name=Kumar,balance=0]
     * ID: A101
     * Name: Tan Ah Teck
     * Balance: 88
     * Account[id=A101,name=Tan Ah Teck,balance=188]
     * Account[id=A101,name=Tan Ah Teck,balance=138]
     * Amount exceeded balance
     * Account[id=A101,name=Tan Ah Teck,balance=138]
     * Account[id=A101,name=Tan Ah Teck,balance=38]
     * Account[id=A102,name=Kumar,balance=100]
     */
}