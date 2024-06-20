package bai11.tochucdulieu;

public class Staff {
    private String name;
    private String phone;
    private String gender;
    private int dateOfBirth;

    public Staff() {
    }

    public Staff(String name, String phone, String gender, int dateOfBirth) {
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return STR."Staff{name='\{name}\{'\''}, phone='\{phone}\{'\''}, gender='\{gender}\{'\''}, dateOfBirth='\{dateOfBirth}\{'\''}\{'}'}";
    }
}

