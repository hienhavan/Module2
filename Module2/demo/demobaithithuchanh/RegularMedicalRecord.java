package demo.demobaithithuchanh;

public class RegularMedicalRecord extends MedicalRecord {
    private double hospitalFee;
    public RegularMedicalRecord(int id, String code, String namePatient, String hospitalizedDay, String hospitalDischargeDate, String reasonForHospitalization, double hospitalFee) {
        super(id, code, namePatient, hospitalizedDay, hospitalDischargeDate, reasonForHospitalization);
        this.hospitalFee = hospitalFee;
    }

    public double getHospitalFee() {
        return hospitalFee;
    }

    public void setHospitalFee(double hospitalFee) {
        this.hospitalFee = hospitalFee;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.hospitalFee;
    }
}