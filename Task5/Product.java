/* You are developing an e-commerce application and need to implement a Product class. The Product class should have private instance variables for the Add commentMore actions
product name, product ID, and price. Implement getter and setter methods for these variables, ensuring that the price cannot be negative. Additionally, 
include a private variable to track the stock quantity and provide public methods to update the stock when a product is purchased or restocked.*/


public class Product {
    private String productName;
    private String productId;
    private double price;
    private int stockQuantity;

    public Product (String productName, String productId, double price, int stockQuantity){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // setter
    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setProductId(String productId){
        this.productId = productId;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // getter
    public String getProductName() {
        return productName;
    }
    public String getProductId() {
        return productId;
    }
    public double getPrice() {
        return price;
    }

    public void purchaseProduct(int quantity) {
        if (quantity > 0 && stockQuantity >= quantity) {
            stockQuantity -= quantity;
        }
    }

    public void restockProduct(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void printinfo(){
        System.out.println("Product Name: " + getProductName());
        System.out.println("Product Id: " + getProductId());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock Quantity: " + getStockQuantity());
    }
}

class Productimp{
    public static void main(String[] args) {
        Product product = new Product("Laptop", "P1001", 120000.0, 10);

        product.printinfo();
        product.purchaseProduct(2);
        product.restockProduct(5);
        System.out.println("Product Stock: " + product.getStockQuantity());
    }
}
