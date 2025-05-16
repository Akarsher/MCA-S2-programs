import java.util.*;

// Interface with calculate method
interface BillCalculator {
    int calculateTotal();
}

// Product class implementing the interface
class Product implements BillCalculator {
    int orderNo;
    String name;
    int quantity;
    int unitPrice;

    public Product(int orderNo, String name, int quantity, int unitPrice) {
        this.orderNo = orderNo;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int calculateTotal() {
        return quantity * unitPrice;
    }

    public void display() {
        System.out.printf("%-10d %-10s %-10d %-12d %-10d\n",
                orderNo, name, quantity, unitPrice, calculateTotal());
    }
}

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[n];

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Order No: ");
            int orderNo = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Unit Price: ");
            int unitPrice = sc.nextInt();

            products[i] = new Product(orderNo, name, quantity, unitPrice);
        }

        // Print bill
        String date = java.time.LocalDate.now().toString();  //calculating current date using java package
        System.out.println("\nOrder No.:" + orderNo );
        System.out.println("\nDate : " + date);
        System.out.println("Product Id  Name       Quantity   Unit-Price   Total");

        int netAmount = 0;
        for (Product p : products) {
            p.display();
            netAmount += p.calculateTotal();
        }

        System.out.println("\nNet Amount:"+ netAmount);
    }
}
