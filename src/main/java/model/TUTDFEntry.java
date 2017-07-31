package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class TUTDFEntry {
    private HeaderSegment headerSegment;
    private List<IDSegment> idSegmentList = new ArrayList<IDSegment>();
    private NameSegment nameSegment;
    private List<PhoneNumberSegment> phoneNumberSegmentList = new ArrayList<PhoneNumberSegment>();
    private TransactionSegment transactionSegment;
    private TRLRSegment trlrSegment;

    public HeaderSegment getHeaderSegment() {
        return headerSegment;
    }

    public void setHeaderSegment(HeaderSegment headerSegment) {
        this.headerSegment = headerSegment;
    }

    public List<IDSegment> getIdSegmentList() {
        return idSegmentList;
    }

    public void setIdSegmentList(List<IDSegment> idSegmentList) {
        this.idSegmentList = idSegmentList;
    }

    public NameSegment getNameSegment() {
        return nameSegment;
    }

    public void setNameSegment(NameSegment nameSegment) {
        this.nameSegment = nameSegment;
    }

    public List<PhoneNumberSegment> getPhoneNumberSegmentList() {
        return phoneNumberSegmentList;
    }

    public void setPhoneNumberSegmentList(List<PhoneNumberSegment> phoneNumberSegmentList) {
        this.phoneNumberSegmentList = phoneNumberSegmentList;
    }

    public TransactionSegment getTransactionSegment() {
        return transactionSegment;
    }

    public void setTransactionSegment(TransactionSegment transactionSegment) {
        this.transactionSegment = transactionSegment;
    }

    public TRLRSegment getTrlrSegment() {
        return trlrSegment;
    }

    public void setTrlrSegment(TRLRSegment trlrSegment) {
        this.trlrSegment = trlrSegment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TUTDFEntry)) return false;

        TUTDFEntry that = (TUTDFEntry) o;

        if (!getHeaderSegment().equals(that.getHeaderSegment())) return false;
        if (!getIdSegmentList().equals(that.getIdSegmentList())) return false;
        if (getNameSegment() != null ? !getNameSegment().equals(that.getNameSegment()) : that.getNameSegment() != null)
            return false;
        if (!getPhoneNumberSegmentList().equals(that.getPhoneNumberSegmentList())) return false;
        if (getTransactionSegment() != null ? !getTransactionSegment().equals(that.getTransactionSegment()) : that.getTransactionSegment() != null)
            return false;
        return getTrlrSegment().equals(that.getTrlrSegment());

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TUTDFEntry{");
        sb.append("headerSegment=").append(headerSegment);
        sb.append(", idSegmentList=").append(idSegmentList);
        sb.append(", nameSegment=").append(nameSegment);
        sb.append(", phoneNumberSegmentList=").append(phoneNumberSegmentList);
        sb.append(", transactionSegment=").append(transactionSegment);
        sb.append(", trlrSegment=").append(trlrSegment);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = getHeaderSegment().hashCode();
        result = 31 * result + getIdSegmentList().hashCode();
        result = 31 * result + (getNameSegment() != null ? getNameSegment().hashCode() : 0);
        result = 31 * result + getPhoneNumberSegmentList().hashCode();
        result = 31 * result + (getTransactionSegment() != null ? getTransactionSegment().hashCode() : 0);
        result = 31 * result + getTrlrSegment().hashCode();
        return result;


    }
}
