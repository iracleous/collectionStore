package gr.codehub.store.model;

// boolean, char, byte, short, int, long, float, double  : primitives
// Boolean, Character, Byte, Short, Integer, Long, Float, Double :wrapper classes
// String


//Model class
public class Product {
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
