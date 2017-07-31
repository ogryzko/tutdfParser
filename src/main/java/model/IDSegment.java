package model;

import java.util.Date;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class IDSegment {
    private String segmentTag;
    private Integer idType;
    private String seriesNumber;
    private String idNumber;
    private Date issueDate;
    private String issueAuthority;
    private String issueLocation;
    private String oldIDNumber;

    public String getSegmentTag() {
        return segmentTag;
    }

    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(String seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueLocation() {
        return issueLocation;
    }

    public void setIssueLocation(String issueLocation) {
        this.issueLocation = issueLocation;
    }

    public String getOldIDNumber() {
        return oldIDNumber;
    }

    public void setOldIDNumber(String oldIDNumber) {
        this.oldIDNumber = oldIDNumber;
    }

    public String getIssueAuthority() {
        return issueAuthority;
    }

    public void setIssueAuthority(String issueAuthority) {
        this.issueAuthority = issueAuthority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IDSegment)) return false;

        IDSegment idSegment = (IDSegment) o;

        if (!getSegmentTag().equals(idSegment.getSegmentTag())) return false;
        if (!getIdType().equals(idSegment.getIdType())) return false;
        if (getSeriesNumber() != null ? !getSeriesNumber().equals(idSegment.getSeriesNumber()) : idSegment.getSeriesNumber() != null)
            return false;
        if (getIdNumber() != null ? !getIdNumber().equals(idSegment.getIdNumber()) : idSegment.getIdNumber() != null)
            return false;
        if (getIssueDate() != null ? !getIssueDate().equals(idSegment.getIssueDate()) : idSegment.getIssueDate() != null)
            return false;
        if (getIssueAuthority() != null ? !getIssueAuthority().equals(idSegment.getIssueAuthority()) : idSegment.getIssueAuthority() != null)
            return false;
        if (getIssueLocation() != null ? !getIssueLocation().equals(idSegment.getIssueLocation()) : idSegment.getIssueLocation() != null)
            return false;
        return getOldIDNumber() != null ? getOldIDNumber().equals(idSegment.getOldIDNumber()) : idSegment.getOldIDNumber() == null;

    }

    @Override
    public int hashCode() {
        int result = getSegmentTag().hashCode();
        result = 31 * result + getIdType().hashCode();
        result = 31 * result + (getSeriesNumber() != null ? getSeriesNumber().hashCode() : 0);
        result = 31 * result + (getIdNumber() != null ? getIdNumber().hashCode() : 0);
        result = 31 * result + (getIssueDate() != null ? getIssueDate().hashCode() : 0);
        result = 31 * result + (getIssueAuthority() != null ? getIssueAuthority().hashCode() : 0);
        result = 31 * result + (getIssueLocation() != null ? getIssueLocation().hashCode() : 0);
        result = 31 * result + (getOldIDNumber() != null ? getOldIDNumber().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "IDSegment{" +
                "segmentTag='" + segmentTag + '\'' +
                ", idType=" + idType +
                ", seriesNumber='" + seriesNumber + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", issueDate=" + issueDate +
                ", issueAuthority='" + issueAuthority + '\'' +
                ", issueLocation='" + issueLocation + '\'' +
                ", oldIDNumber='" + oldIDNumber + '\'' +
                '}';
    }
}
