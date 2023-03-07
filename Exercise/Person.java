public class Person {

    private String name;
    private String address;

    public Person(String aName, String aAddress) {
        this.name = aName;
        this.address = aAddress;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name: " + name + ", address: " + address + "]";
    }
}