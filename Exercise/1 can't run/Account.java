public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getID() {
        return id;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int credit(int amount) {
        int newBalance = balance + amount;
        this.balance = newBalance;
        return newBalance;
    }

    public int debit(int amount) {
        int newBalance = 0;
        if (amount <= balance) {
            newBalance = balance - amount;
            this.balance = newBalance;
            return newBalance;
        } else {
            throw new IllegalArgumentException("Amount exceeded balance");

        }
    }

    @Override
    public String toString() {
        return customer;
    }

    public Account transferTo(Account t, int amount) {
        if (amount <= balance) {
            debit(amount);
            t.credit(amount);
            return (this);
        } else {
            throw new IllegalArgumentException("Amount exceeded balance");
        }
    }

    
}