public class TestInvoice {
    public static void main(String[] args) {

        Customer a1 = new Customer(88, "Hamid", 10);
        System.out.println(a1);

        a1.setDiscount(8);
        System.out.println(a1);

        System.out.println("ID= " + a1.getID());
        System.out.println("Name= " + a1.getName());

        Invoice inv1 = new Invoice(101, a1, 888.8);
        System.out.println(inv1);

        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getID());
        System.out.println("customer is: " + inv1.getCustomer()); // Customer's toString()
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerID());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
}