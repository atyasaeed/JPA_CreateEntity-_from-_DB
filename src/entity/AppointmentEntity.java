package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "appointment", schema = "doctor_ reservation", catalog = "")
public class AppointmentEntity {
    private int id;
    private String breifComplain;
    private Timestamp dateTime;
    private String patient;
    private Integer doctorentityId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "breif_complain")
    public String getBreifComplain() {
        return breifComplain;
    }

    public void setBreifComplain(String breifComplain) {
        this.breifComplain = breifComplain;
    }

    @Basic
    @Column(name = "date_time")
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Basic
    @Column(name = "patient")
    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    @Basic
    @Column(name = "doctorentity_id")
    public Integer getDoctorentityId() {
        return doctorentityId;
    }

    public void setDoctorentityId(Integer doctorentityId) {
        this.doctorentityId = doctorentityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppointmentEntity that = (AppointmentEntity) o;
        return id == that.id &&
                Objects.equals(breifComplain, that.breifComplain) &&
                Objects.equals(dateTime, that.dateTime) &&
                Objects.equals(patient, that.patient) &&
                Objects.equals(doctorentityId, that.doctorentityId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, breifComplain, dateTime, patient, doctorentityId);
    }
}
