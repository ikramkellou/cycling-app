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

    public String getFormattedId() {
        String formattedId = this.id;

        int length = formattedId.length();
        for (int i = 0; i < 6 - length; i++) {
            formattedId = "0" + formattedId;
        }

        return formattedId;
    }

    // color
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFormattedColor() {
        String formattedColor = this.color;

        int length = formattedColor.length();
        for (int i = 0; i < 4 - length; i++) {
            formattedColor = " " + formattedColor;
        }

        return formattedColor;
    }

    // price
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFormattedPrice() {
        String formattedPrice = Double.toString(price);

        int length = formattedPrice.length();
        for (int i = 0; i < 6 - length; i++) {
            formattedPrice = "0" + formattedPrice;
        }

        return formattedPrice;
    }

    // isAvailable
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getFormattedIsAvailable() {
        if (this.isAvailable) {
            return "Yes";
        }
        return " No";
    }

    public String getBicyleAsCsvLine() {
        return getFormattedId() + "," +
                getFormattedColor() + "," +
                getFormattedPrice() + "," +
                getFormattedIsAvailable();
    }
}
