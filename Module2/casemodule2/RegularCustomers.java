package casemodule2;

public class RegularCustomers extends Customers {
    private double amountToBePaid;

    public RegularCustomers(int id, String code, String nameCustomer, String phoneNumber, String joinDate, String departureDate, String purposeOfJoining, double amountToBePaid) {
        super(id, code, nameCustomer, phoneNumber, joinDate, departureDate, purposeOfJoining);
        this.amountToBePaid = amountToBePaid;
    }

    public double getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBePaid(double amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }

    @Override
    public String toString() {
        return super.toString() + ", mountToBePaid=" + amountToBePaid;
    }
}