
package cr.com.gm.sales;


public class Product {
    
   private int idProduct;
   private String name;
   private double price;
   private static int counterProducts;
   
   private Product(){
       this.idProduct = ++Product.counterProducts;
   }
   
   public Product(String name, double price){
    this();
    this.name = name;
    this.price = price;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCounterProducts() {
        return counterProducts;
    }

    public static void setCounterProducts(int counterProducts) {
        Product.counterProducts = counterProducts;
    }

    public int getIdProduct() {
        return idProduct;
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", name=" + name + ", price=" + price + '}';
    }
   
   
}
