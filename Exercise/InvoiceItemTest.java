
public class InvoiceItemTest {

    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(i1);

        i1.setQty(999);
        i1.setUnitPrice(0.99);
        System.out.println(i1.getId());
        System.out.println(i1.getDesc());
        System.out.println(i1.getQty());
        System.out.println(i1.getUnitPrice());

        System.out.println(i1.getTotal());
    }

    /*
     * InvoiceItem[id=A101,desc=Pen Red,qty=888,unitPrice=0.08]
     * InvoiceItem[id=A101,desc=Pen Red,qty=999,unitPrice=0.99]
     * id is: A101
     * desc is: Pen Red
     * qty is: 999
     * unitPrice is: 0.99
     * The total is: 989.01
     */
}