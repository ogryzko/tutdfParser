package model;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class TRLRSegment {
    private String trailerSegment;
    private int Counter;

    public String getTrailerSegment() {
        return trailerSegment;
    }

    public void setTrailerSegment(String trailerSegment) {
        this.trailerSegment = trailerSegment;
    }

    public int getCounter() {
        return Counter;
    }

    public void setCounter(int counter) {
        Counter = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TRLRSegment)) return false;

        TRLRSegment that = (TRLRSegment) o;

        if (getCounter() != that.getCounter()) return false;
        return getTrailerSegment().equals(that.getTrailerSegment());

    }

    @Override
    public int hashCode() {
        int result = getTrailerSegment().hashCode();
        result = 31 * result + getCounter();
        return result;
    }
}
