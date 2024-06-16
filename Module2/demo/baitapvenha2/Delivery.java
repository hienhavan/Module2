package demo.baitapvenha2;

public class Delivery extends Staff {
    private int type;
    private String car;

    public Delivery(int id, String phone, String name, String position, int type, String car) {
        super(id, phone, name, position);
        this.type = type;
        this.car = car;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return super.toString() + "," + "type=" + type + "," + "car=" + car +
                '}';
    }
}
