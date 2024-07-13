
package cr.com.gm.ventas.test;

import cr.com.gm.sales.*;

public class SalesTest {
     public static void main(String[] args) {
         Product product1 = new Product("T-Shirt", 50.00);
         Product product2 = new Product("Pants", 100.00);
        
         Order order1 = new Order();
         order1.addProduct(product1);
         order1.addProduct(product2);
         order1.displayOrder();
    }
}
