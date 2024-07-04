package demo.casemodule2;

public abstract class Customers {
    private int id;
    private String code;
    private String nameCustomer;
    private String phoneNumber;
    private String joinDate;
    private String departureDate;
    private String purposeOfJoining;


    public Customers(int id, String code, String nameCustomer, String phoneNumber, String joinDate, String departureDate, String purposeOfJoining) {
        this.id = id;
        this.code = code;
        this.nameCustomer = nameCustomer;
        this.phoneNumber = phoneNumber;
        this.joinDate = joinDate;
        this.departureDate = departureDate;
        this.purposeOfJoining = purposeOfJoining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getPurposeOfJoining() {
        return purposeOfJoining;
    }

    public void setPurposeOfJoining(String purposeOfJoining) {
        this.purposeOfJoining = purposeOfJoining;
    }

//    @Override
//    public String toString() {
//        return this.id + "," +
//                this.code + "," +
//                this.nameCustomer + "," +
//                this.phoneNumber + "," +
//                this.joinDate + "," +
//                this.departureDate + "," +
//                this.purposeOfJoining;
//    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", purposeOfJoining='" + purposeOfJoining ;
    }
}