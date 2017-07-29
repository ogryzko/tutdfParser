package model;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class PhoneNumberSegment {
    private String segmentTag;
    private String number;
    private int type;

    public String getSegmentTag() {
        return segmentTag;
    }

    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumberSegment)) return false;

        PhoneNumberSegment that = (PhoneNumberSegment) o;

        if (getType() != that.getType()) return false;
        if (!getSegmentTag().equals(that.getSegmentTag())) return false;
        return getNumber().equals(that.getNumber());

    }

    @Override
    public int hashCode() {
        int result = getSegmentTag().hashCode();
        result = 31 * result + getNumber().hashCode();
        result = 31 * result + getType();
        return result;
    }
}
