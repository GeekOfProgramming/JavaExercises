public class Customer {

    private int id;
    private String name;
    private int discount;
    private char gender;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    /**
     * @return the id
     */
    public int getID() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}