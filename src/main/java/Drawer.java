import java.util.ArrayList;
import java.util.List;

public class Drawer {
    private Code code;
    private double price;
    private List<Product> product;

    public Drawer(Code code, double price, Product  product){
        this.code = code;
        this.price = price;
        this.product = new ArrayList<Product>();
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public void addProduct(Product product){
        this.product.add(product);
    }

    public List<Product> getProduct() {
        return product;
    }
}
