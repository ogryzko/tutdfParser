package model;

import java.util.Date;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class NameSegment {
    private String segmentTag;
    private String surname;
    private String patronymicName;
    private String firstName;
    private Integer emptyField1; // поле не используется O.o
    private Date dateOfBirth;
    private String placeOfBirth;
    private String emptyField2; // поле не используется О.о
    private Integer emptyField3; // поле не используется О.о
    private Integer emptyField4; // поле не используется О.о
    private Integer remarks;
    private String oldSurname;
    private String oldFirstName;


    public String getSegmentTag() {
        return segmentTag;
    }

    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getEmptyField1() {
        return emptyField1;
    }

    public void setEmptyField1(Integer emptyField1) {
        this.emptyField1 = emptyField1;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getEmptyField2() {
        return emptyField2;
    }

    public void setEmptyField2(String emptyField2) {
        this.emptyField2 = emptyField2;
    }

    public Integer getEmptyField3() {
        return emptyField3;
    }

    public void setEmptyField3(Integer emptyField3) {
        this.emptyField3 = emptyField3;
    }

    public Integer getEmptyField4() {
        return emptyField4;
    }

    public void setEmptyField4(Integer emptyField4) {
        this.emptyField4 = emptyField4;
    }

    public Integer getRemarks() {
        return remarks;
    }

    public void setRemarks(Integer remarks) {
        this.remarks = remarks;
    }

    public String getOldSurname() {
        return oldSurname;
    }

    public void setOldSurname(String oldSurname) {
        this.oldSurname = oldSurname;
    }

    public String getOldFirstName() {
        return oldFirstName;
    }

    public void setOldFirstName(String oldFirstName) {
        this.oldFirstName = oldFirstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NameSegment)) return false;

        NameSegment that = (NameSegment) o;

        if (!getSegmentTag().equals(that.getSegmentTag())) return false;
        if (!getSurname().equals(that.getSurname())) return false;
        if (getPatronymicName() != null ? !getPatronymicName().equals(that.getPatronymicName()) : that.getPatronymicName() != null)
            return false;
        if (!getFirstName().equals(that.getFirstName())) return false;
        if (getEmptyField1() != null ? !getEmptyField1().equals(that.getEmptyField1()) : that.getEmptyField1() != null)
            return false;
        if (!getDateOfBirth().equals(that.getDateOfBirth())) return false;
        if (!getPlaceOfBirth().equals(that.getPlaceOfBirth())) return false;
        if (getEmptyField2() != null ? !getEmptyField2().equals(that.getEmptyField2()) : that.getEmptyField2() != null)
            return false;
        if (getEmptyField3() != null ? !getEmptyField3().equals(that.getEmptyField3()) : that.getEmptyField3() != null)
            return false;
        if (getEmptyField4() != null ? !getEmptyField4().equals(that.getEmptyField4()) : that.getEmptyField4() != null)
            return false;
        if (getRemarks() != null ? !getRemarks().equals(that.getRemarks()) : that.getRemarks() != null) return false;
        if (getOldSurname() != null ? !getOldSurname().equals(that.getOldSurname()) : that.getOldSurname() != null)
            return false;
        return getOldFirstName() != null ? getOldFirstName().equals(that.getOldFirstName()) : that.getOldFirstName() == null;

    }

    @Override
    public int hashCode() {
        int result = getSegmentTag().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + (getPatronymicName() != null ? getPatronymicName().hashCode() : 0);
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + (getEmptyField1() != null ? getEmptyField1().hashCode() : 0);
        result = 31 * result + getDateOfBirth().hashCode();
        result = 31 * result + getPlaceOfBirth().hashCode();
        result = 31 * result + (getEmptyField2() != null ? getEmptyField2().hashCode() : 0);
        result = 31 * result + (getEmptyField3() != null ? getEmptyField3().hashCode() : 0);
        result = 31 * result + (getEmptyField4() != null ? getEmptyField4().hashCode() : 0);
        result = 31 * result + (getRemarks() != null ? getRemarks().hashCode() : 0);
        result = 31 * result + (getOldSurname() != null ? getOldSurname().hashCode() : 0);
        result = 31 * result + (getOldFirstName() != null ? getOldFirstName().hashCode() : 0);
        return result;
    }
}
