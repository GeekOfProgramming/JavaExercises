public class Invoice {

    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    /**
     * @return the id
     */
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
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @param the customer id
     */
    public int getCustomerID() {
        return customer.getID();
    }

    /**
     * @param the customer name
     */
    public String getCustomerName() {
        return customer.getName();
    }

    /**
     * @param the customer discount
     */
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        double aad = getAmount() - (getAmount() * getCustomerDiscount() / 100);
        return aad;
    }

    @Override
    public String toString() {
        return "Invoice[id=" + id + " ," + customer + " ,amount=" + amount + "]";
    }
}