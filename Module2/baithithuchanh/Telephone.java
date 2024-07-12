package baithithuchanh;

public class Telephone {
    private int id;
    private String namePhone;
    private double price;
    private int amount;
    private String Manufacturer;

    public Telephone(int id, String namePhone, double price, int amount, String manufacturer) {
        this.id = id;
        this.namePhone = namePhone;
        this.price = price;
        this.amount = amount;
        this.Manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "id=" + id +
                ", namePhone='" + namePhone + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", Manufacturer='" + Manufacturer;
    }
}
