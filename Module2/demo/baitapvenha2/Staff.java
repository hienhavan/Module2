package demo.baitapvenha2;

import java.io.IOException;

public abstract class Staff {
    private int id;
    private String phone;
    private String name;
    private String position;

    public Staff(int id, String phone, String name, String position) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'';
    }
    public void ab() throws Exception {
    };
}
