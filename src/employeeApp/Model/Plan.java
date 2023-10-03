package employeeApp.Model;

public enum Plan {

    STANDART("Standart", 10000),
    GOLD("Gold", 15000),
    PREMIUM("Premium", 20000);

    private String name;

    private double price;

    Plan(String name, double price) {
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
}
