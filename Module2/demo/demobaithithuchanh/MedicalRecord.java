package demo.demobaithithuchanh;

import java.util.Date;

public abstract class MedicalRecord {
    private int id;
    private String code;
    private String namePatient;
    private String hospitalizedDay;
    private String hospitalDischargeDate;
    private String reasonForHospitalization;


    public MedicalRecord(int id, String code, String namePatient, String hospitalizedDay, String hospitalDischargeDate, String reasonForHospitalization) {
        this.id = id;
        this.code = code;
        this.namePatient = namePatient;
        this.hospitalizedDay = hospitalizedDay;
        this.hospitalDischargeDate = hospitalDischargeDate;
        this.reasonForHospitalization = reasonForHospitalization;
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

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getHospitalizedDay() {
        return hospitalizedDay;
    }

    public void setHospitalizedDay(String hospitalizedDay) {
        this.hospitalizedDay = hospitalizedDay;
    }

    public String getHospitalDischargeDate() {
        return hospitalDischargeDate;
    }

    public void setHospitalDischargeDate(String hospitalDischargeDate) {
        this.hospitalDischargeDate = hospitalDischargeDate;
    }

    public String getReasonForHospitalization() {
        return reasonForHospitalization;
    }

    public void setReasonForHospitalization(String reasonForHospitalization) {
        this.reasonForHospitalization = reasonForHospitalization;
    }

    @Override
    public String toString() {
        return this.id + "," +
                this.code + "," +
                this.namePatient + "," +
                this.hospitalizedDay + "," +
                this.hospitalDischargeDate + "," +
                this.reasonForHospitalization;
    }
}