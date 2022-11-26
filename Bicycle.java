public class Bicycle {
    private String id;
    private String color;
    private double price;
    private boolean isAvailable;

    public Bicycle(String id, String color, double price, boolean isAvailable) {
        this.id = id;
        this.color = color;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // id
    public String getId() {
        return this.id;
    }

    // color
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // price
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // isAvailable
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
