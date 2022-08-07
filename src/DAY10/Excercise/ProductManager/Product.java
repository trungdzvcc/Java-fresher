package DAY10.Excercise.ProductManager;

import java.io.Serializable;

public class Product implements Serializable {
    private String idsp;
    private String name;
    private String producer;
    private int price;
    private String description;

    public Product() {
    }

    public Product(String idsp, String name, String producer, int price, String description) {
        this.idsp = idsp;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.description = description;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idsp='" + idsp + '\'' +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
    public  void Show(){
        System.out.println(toString());
    }
}
