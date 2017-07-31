package model;

import java.util.Date;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class HeaderSegment {
    private String segmentTag;
    private String version;
    private Date VersionDate;
    private String memberCode;
    private String cycleIdentification;
    private Date reportDate;
    private String authorizationCode;
    private String memberData;

    public String getSegmentTag() {
        return segmentTag;
    }

    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getVersionDate() {
        return VersionDate;
    }

    public void setVersionDate(Date versionDate) {
        VersionDate = versionDate;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getCycleIdentification() {
        return cycleIdentification;
    }

    public void setCycleIdentification(String cycleIdentification) {
        this.cycleIdentification = cycleIdentification;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getMemberData() {
        return memberData;
    }

    public void setMemberData(String memberData) {
        this.memberData = memberData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeaderSegment)) return false;

        HeaderSegment that = (HeaderSegment) o;

        if (!getSegmentTag().equals(that.getSegmentTag())) return false;
        if (!getVersion().equals(that.getVersion())) return false;
        if (!getVersionDate().equals(that.getVersionDate())) return false;
        if (!getMemberCode().equals(that.getMemberCode())) return false;
        if (getCycleIdentification() != null ? !getCycleIdentification().equals(that.getCycleIdentification()) : that.getCycleIdentification() != null)
            return false;
        if (!getReportDate().equals(that.getReportDate())) return false;
        if (!getAuthorizationCode().equals(that.getAuthorizationCode())) return false;
        return getMemberData() != null ? getMemberData().equals(that.getMemberData()) : that.getMemberData() == null;

    }

    @Override
    public String toString() {
        return "HeaderSegment{" +
                "segmentTag='" + segmentTag + '\'' +
                ", version='" + version + '\'' +
                ", VersionDate=" + VersionDate +
                ", memberCode='" + memberCode + '\'' +
                ", cycleIdentification='" + cycleIdentification + '\'' +
                ", reportDate=" + reportDate +
                ", authorizationCode='" + authorizationCode + '\'' +
                ", memberData='" + memberData + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = getSegmentTag().hashCode();
        result = 31 * result + getVersion().hashCode();
        result = 31 * result + getVersionDate().hashCode();
        result = 31 * result + getMemberCode().hashCode();
        result = 31 * result + (getCycleIdentification() != null ? getCycleIdentification().hashCode() : 0);
        result = 31 * result + getReportDate().hashCode();
        result = 31 * result + getAuthorizationCode().hashCode();
        result = 31 * result + (getMemberData() != null ? getMemberData().hashCode() : 0);
        return result;


    }
}
