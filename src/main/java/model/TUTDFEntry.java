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
}
