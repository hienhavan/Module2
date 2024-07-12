package baithithuchanh;

public class PortablePhones extends Telephone {
    private String country;
    private String condition;

    public PortablePhones(int id, String namePhone, double price, int amount, String manufacturer, String country, String condition) {
        super(id, namePhone, price, amount, manufacturer);
        this.country = country;
        this.condition = condition;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String isCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return super.toString() + ", country" + country + ", condition" + condition + '\'' +
                '}';
    }
}
