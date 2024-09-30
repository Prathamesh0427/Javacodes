abstract class Order {
    int id;
    String description;

    Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    // Abstract method to be implemented by subclasses
    abstract void accept();

    void display() {
        System.out.println("ID: " + id + ", Description: " + description);
    }
}

class PurchaseOrder extends Order {
    String customerName;

    PurchaseOrder(int id, String description, String customerName) {
        super(id, description);
        this.customerName = customerName;
    }

    @Override
    void accept() {
        System.out.println("Purchase Order Accepted");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Customer Name: " + customerName);
    }
}

class SalesOrder extends Order {
    String vendorName;

    SalesOrder(int id, String description, String vendorName) {
        super(id, description);
        this.vendorName = vendorName;
    }

    @Override
    void accept() {
        System.out.println("Sales Order Accepted");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Vendor Name: " + vendorName);
    }
}

public class Laptop {
    public static void main(String[] args) {
        Order po1 = new PurchaseOrder(1, "Laptop", "John");
        Order so1 = new SalesOrder(2, "Mobile", "VendorX");

        po1.accept();
        po1.display();

        so1.accept();
        so1.display();
    }
}