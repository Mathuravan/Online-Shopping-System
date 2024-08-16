package OnlineShopping;
public abstract class Product {
    protected String product_ID;
    protected String product_name;
    protected int no_of_item;
    protected double price;
    public Product(String product_ID, String product_name, int no_of_item, double price) {
        this.product_ID = product_ID;
        this.product_name = product_name;
        this.no_of_item = no_of_item;
        this.price = price;
    }
    public String getProduct_ID() {
        return product_ID;
    }
    public void setProduct_ID(String product_ID) {
        this.product_ID = product_ID;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public int getNo_of_item() {
        return no_of_item;
    }
    public void setNo_of_item(int no_of_item) {
        this.no_of_item = no_of_item;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product = {" + "Product ID: " + product_ID + ", Product Name: " + product_name + ", Number of Item: " + no_of_item + ", Price: " + price +'}';
    }
}

class Electronics extends Product {
    private String brand;
    private int warranty_period;

    public Electronics(String product_ID, String product_name, int no_of_item, double price, String brand, int warranty_period) {
        super(product_ID, product_name, no_of_item, price);
        this.brand = brand;
        this.warranty_period = warranty_period;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarranty_period() {
        return warranty_period;
    }

    public void setWarranty_period(int warranty_period) {
        this.warranty_period = warranty_period;
    }

    @Override
    public String toString() {
        System.out.println();
        return  "Clothing{" + super.toString() +"\n" +
                "Product ID - " + product_ID +"\n"+
                "Product Name - " + product_name +"\n"+
                "number of Item - " + no_of_item +"\n"+
                "Price - " + price+"\n"+
                "Brand - " + brand +"\n"+
                "Warranty Period - " + warranty_period+"\n"+
                "}";
    }
}

class Clothing extends Product {
    private double size;
    private String colour;
    public Clothing(String product_ID, String product_name, int no_of_item, double price, double size, String colour) {
        super(product_ID, product_name, no_of_item, price);
        this.size = size;
        this.colour = colour;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        System.out.println();
        return  "Clothing{" + super.toString() +"\n" +
                "Product ID : " + product_ID +"\n"+
                "Product Name :  " + product_name +"\n"+
                "Number of item :  " + no_of_item +"\n"+
                "Price : " + price +"\n"+
                "Size : " + size +"\n"+
                "Colour : " + colour +"\n"+
                "}";
    }
}
