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
    private int emptyField1; // поле не используется O.o
    private Date dateOfBirth;
    private String placeOfBirth;
    private String emptyField2; // поле не используется О.о
    private int emptyField3; // поле не используется О.о
    private int emptyField4; // поле не используется О.о
    private int remarks;
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

    public int getEmptyField1() {
        return emptyField1;
    }

    public void setEmptyField1(int emptyField1) {
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

    public int getEmptyField3() {
        return emptyField3;
    }

    public void setEmptyField3(int emptyField3) {
        this.emptyField3 = emptyField3;
    }

    public int getEmptyField4() {
        return emptyField4;
    }

    public void setEmptyField4(int emptyField4) {
        this.emptyField4 = emptyField4;
    }

    public int getRemarks() {
        return remarks;
    }

    public void setRemarks(int remarks) {
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
}
