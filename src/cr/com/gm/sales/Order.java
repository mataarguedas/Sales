
package cr.com.gm.sales;

public class Order {
    private int idOrder;
    private Product products[];
    private static int counterOrders;
    private int counterProducts;
    private static final int MAX_PRODUCTS = 10;
    
    public Order(){
    this.idOrder = ++Order.counterOrders;
    this.products= new Product[Order.MAX_PRODUCTS];
    }
    
    public void addProduct(Product product) {
        if(this.counterProducts < Order.MAX_PRODUCTS){
            this.products[this.counterProducts++] = product;
        }
        else{
            System.out.println("Already max amount of products" + Order.MAX_PRODUCTS);
        }
    }
    
    public double calculateTotal(){
        double total = 0;
        for (int i = 0; i < this.counterProducts; i++) {
//            Product product = this.products[i];
//            total += product.getPrice(); // total = total + product.getPrice();
            total += this.products[i].getPrice();
        }
        return total;
    }
    
    public void displayOrder(){
        System.out.println("Id order: " + this.idOrder);
        double totalOrder = this.calculateTotal();
        System.out.println("Order total: $" + totalOrder);
        System.out.println("Order Products: ");
        for (int i = 0; i < this.counterProducts; i++) {
            System.out.println(this.products[i]);
        }
    }
}
