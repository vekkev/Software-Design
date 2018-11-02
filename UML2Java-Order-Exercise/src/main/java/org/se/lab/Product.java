package org.se.lab;

public class Product extends Entity {

    public Product(long id, String description, long price){
        setId(id);
        setDescription(description);
        setPrice(price);
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
       if(description == null)
           throw new IllegalArgumentException();
        this.description = description;
    }



    private long price;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        if(price <0)
            throw new IllegalArgumentException();
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
