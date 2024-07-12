package baithithuchanh;

public class GenuinePhone extends Telephone {
    private int warrantyPeriod;
    private String warrantyCoverage;


    public GenuinePhone(int id, String namePhone, double price, int amount, String manufacturer, int warrantyPeriod, String warrantyCoverage) {
        super(id, namePhone, price, amount, manufacturer);
        this.warrantyCoverage = warrantyCoverage;
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toString() {
        return super.toString() + ", warrantyCoverage=" + warrantyCoverage + ", warrantyPeriod=" + warrantyPeriod + '\'' +
                '}';
    }
}
