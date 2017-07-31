package model;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class TRLRSegment {
    private String trailerSegment;
    private Integer Counter;

    public String getTrailerSegment() {
        return trailerSegment;
    }

    public void setTrailerSegment(String trailerSegment) {
        this.trailerSegment = trailerSegment;
    }

    public Integer getCounter() {
        return Counter;
    }

    public void setCounter(Integer counter) {
        Counter = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TRLRSegment)) return false;

        TRLRSegment that = (TRLRSegment) o;

        if (!getTrailerSegment().equals(that.getTrailerSegment())) return false;
        return getCounter() != null ? getCounter().equals(that.getCounter()) : that.getCounter() == null;

    }

    @Override
    public int hashCode() {
        int result = getTrailerSegment().hashCode();
        result = 31 * result + (getCounter() != null ? getCounter().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TRLRSegment{");
        sb.append("trailerSegment='").append(trailerSegment).append('\'');
        sb.append(", Counter=").append(Counter);
        sb.append('}');
        return sb.toString();
    }
}
