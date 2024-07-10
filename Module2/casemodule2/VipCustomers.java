package demo.casemodule2;

public class VipCustomers extends Customers {
    private int type;
    private int vipTerm;

    public VipCustomers(int id,
                        String code,
                        String nameCustomer,
                        String phoneNumber,
                        String joinDate,
                        String departureDate,
                        String purposeOfJoining,
                        int type,
                        int duration) {
        super(id, code, nameCustomer, phoneNumber, joinDate, departureDate, purposeOfJoining);
        this.type = type;
        this.vipTerm = duration;
    }

    public int getVipTerm() {
        return vipTerm;
    }

    public void setVipTerm(int vipTerm) {
        this.vipTerm = vipTerm;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", type=" + type + ", vipTerm=" + vipTerm;
    }
}
