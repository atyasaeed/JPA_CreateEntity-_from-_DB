package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "doctor", schema = "doctor_ reservation", catalog = "")
public class DoctorEntity {
    private int id;
    private Integer fkDoctor;
    private String speciality;
    private String address;
    private String education;
    private String name;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fk_doctor")
    public Integer getFkDoctor() {
        return fkDoctor;
    }

    public void setFkDoctor(Integer fkDoctor) {
        this.fkDoctor = fkDoctor;
    }

    @Basic
    @Column(name = "speciality")
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoctorEntity that = (DoctorEntity) o;
        return id == that.id &&
                Objects.equals(fkDoctor, that.fkDoctor) &&
                Objects.equals(speciality, that.speciality) &&
                Objects.equals(address, that.address) &&
                Objects.equals(education, that.education) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fkDoctor, speciality, address, education, name);
    }
}
