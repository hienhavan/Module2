package demo.demobaithithuchanh;

import java.util.Date;

public class VipMedicalRecord extends MedicalRecord {
    private int type;
    private int duration;

    public VipMedicalRecord(int id,
                            String code,
                            String namePatient,
                            String hospitalizedDay,
                            String hospitalDischargeDate,
                            String reasonForHospitalization,
                            int type,
                            int duration) {
        super(id, code, namePatient, hospitalizedDay, hospitalDischargeDate, reasonForHospitalization);
        this.type = type;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
                "," + this.type +
                "," + this.duration;
    }
}
