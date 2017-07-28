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
}
