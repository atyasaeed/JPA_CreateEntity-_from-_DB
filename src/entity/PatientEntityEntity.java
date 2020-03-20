package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "patient_entity", schema = "doctor_ reservation", catalog = "")
public class PatientEntityEntity {
    private int id;
    private Timestamp birthDate;
    private Integer gender;
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
    @Column(name = "birth_date")
    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "gender")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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
        PatientEntityEntity that = (PatientEntityEntity) o;
        return id == that.id &&
                Objects.equals(birthDate, that.birthDate) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, birthDate, gender, name);
    }
}
