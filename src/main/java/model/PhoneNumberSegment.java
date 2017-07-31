package model;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class PhoneNumberSegment {
    private String segmentTag;
    private String number;
    private Integer type;

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

    public Integer getType() {
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

        if (!getSegmentTag().equals(that.getSegmentTag())) return false;
        if (!getNumber().equals(that.getNumber())) return false;
        return getType() != null ? getType().equals(that.getType()) : that.getType() == null;

    }

    @Override
    public int hashCode() {
        int result = getSegmentTag().hashCode();
        result = 31 * result + getNumber().hashCode();
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhoneNumberSegment{");
        sb.append("segmentTag='").append(segmentTag).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
