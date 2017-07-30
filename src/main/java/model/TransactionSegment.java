package model;

import java.util.Date;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class TransactionSegment {
    private String segmentTag;
    private String memberCode;
    private String accountNumber;
    private Integer accountType;
    private Integer accountRelationship;
    private Date dateAccountOpened;
    private Date dateOfLastPayment;
    private Integer accountRating;
    private Date dateAccountRating;
    private Date dateReported;
    private String creditLimit;
    private String balance;
    private String pastDue;
    private String nextPayment;
    private Integer creditPaymentFrequency;
    private String mop;
    private String currencyCode;
    private Integer collateralCode;
    private Date dateOfContractTermination;
    private Date datePaymentDue;
    private Date dateInterestPaymentDue;
    private Integer interestPaymentFrequency;
    private String oldMemberCode;
    private String oldAccountNumber;
    private String amountOutstanding;
    private String guarantorIndicator;
    private String volumeOfDebtSecuredByGuarantee;
    private String guaranteeSum;
    private Date guaranteeTem;
    private String bankGuaranteeIndicator;
    private String volumeOfDebtSecuredByBankGuarantee;
    private String bankGuaranteeSum;
    private String bankGuaranteeTem;
    private String collateralValue;
    private Date collateralDate;
    private Date collateralAgreementExpirationDate;
    private String overallValueOfCredit;
    private String rightOfClaimAcquirersNames;
    private String rightOfClaimAcquirersRegistrationData;
    private Integer rightOfClaimAcquirersTaxpayerID;
    private Integer rightOfClaimAcquirersSocialInsuranceNumber;
    private Date completePerformanceOfObligationsDate;
    public String getSegmentTag() {
        return segmentTag;
    }

    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getAccountRelationship() {
        return accountRelationship;
    }

    public void setAccountRelationship(Integer accountRelationship) {
        this.accountRelationship = accountRelationship;
    }

    public Date getDateAccountOpened() {
        return dateAccountOpened;
    }

    public void setDateAccountOpened(Date dateAccountOpened) {
        this.dateAccountOpened = dateAccountOpened;
    }

    public Date getDateOfLastPayment() {
        return dateOfLastPayment;
    }

    public void setDateOfLastPayment(Date dateOfLastPayment) {
        this.dateOfLastPayment = dateOfLastPayment;
    }

    public Integer getAccountRating() {
        return accountRating;
    }

    public void setAccountRating(Integer accountRating) {
        this.accountRating = accountRating;
    }

    public Date getDateAccountRating() {
        return dateAccountRating;
    }

    public void setDateAccountRating(Date dateAccountRating) {
        this.dateAccountRating = dateAccountRating;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported = dateReported;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPastDue() {
        return pastDue;
    }

    public void setPastDue(String pastDue) {
        this.pastDue = pastDue;
    }

    public String getNextPayment() {
        return nextPayment;
    }

    public void setNextPayment(String nextPayment) {
        this.nextPayment = nextPayment;
    }

    public Integer getCreditPaymentFrequency() {
        return creditPaymentFrequency;
    }

    public void setCreditPaymentFrequency(Integer creditPaymentFrequency) {
        this.creditPaymentFrequency = creditPaymentFrequency;
    }

    public String getMop() {
        return mop;
    }

    public void setMop(String mop) {
        this.mop = mop;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getCollateralCode() {
        return collateralCode;
    }

    public void setCollateralCode(Integer collateralCode) {
        this.collateralCode = collateralCode;
    }

    public Date getDateOfContractTermination() {
        return dateOfContractTermination;
    }

    public void setDateOfContractTermination(Date dateOfContractTermination) {
        this.dateOfContractTermination = dateOfContractTermination;
    }

    public Date getDatePaymentDue() {
        return datePaymentDue;
    }

    public void setDatePaymentDue(Date datePaymentDue) {
        this.datePaymentDue = datePaymentDue;
    }

    public Date getDateInterestPaymentDue() {
        return dateInterestPaymentDue;
    }

    public void setDateInterestPaymentDue(Date dateInterestPaymentDue) {
        this.dateInterestPaymentDue = dateInterestPaymentDue;
    }

    public Integer getInterestPaymentFrequency() {
        return interestPaymentFrequency;
    }

    public void setInterestPaymentFrequency(Integer interestPaymentFrequency) {
        this.interestPaymentFrequency = interestPaymentFrequency;
    }

    public String getOldMemberCode() {
        return oldMemberCode;
    }

    public void setOldMemberCode(String oldMemberCode) {
        this.oldMemberCode = oldMemberCode;
    }

    public String getOldAccountNumber() {
        return oldAccountNumber;
    }

    public void setOldAccountNumber(String oldAccountNumber) {
        this.oldAccountNumber = oldAccountNumber;
    }

    public String getAmountOutstanding() {
        return amountOutstanding;
    }

    public void setAmountOutstanding(String amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
    }

    public String getGuarantorIndicator() {
        return guarantorIndicator;
    }

    public void setGuarantorIndicator(String guarantorIndicator) {
        this.guarantorIndicator = guarantorIndicator;
    }

    public String getVolumeOfDebtSecuredByGuarantee() {
        return volumeOfDebtSecuredByGuarantee;
    }

    public void setVolumeOfDebtSecuredByGuarantee(String volumeOfDebtSecuredByGuarantee) {
        this.volumeOfDebtSecuredByGuarantee = volumeOfDebtSecuredByGuarantee;
    }

    public String getGuaranteeSum() {
        return guaranteeSum;
    }

    public void setGuaranteeSum(String guaranteeSum) {
        this.guaranteeSum = guaranteeSum;
    }

    public Date getGuaranteeTem() {
        return guaranteeTem;
    }

    public void setGuaranteeTem(Date guaranteeTem) {
        this.guaranteeTem = guaranteeTem;
    }

    public String getBankGuaranteeIndicator() {
        return bankGuaranteeIndicator;
    }

    public void setBankGuaranteeIndicator(String bankGuaranteeIndicator) {
        this.bankGuaranteeIndicator = bankGuaranteeIndicator;
    }

    public String getVolumeOfDebtSecuredByBankGuarantee() {
        return volumeOfDebtSecuredByBankGuarantee;
    }

    public void setVolumeOfDebtSecuredByBankGuarantee(String volumeOfDebtSecuredByBankGuarantee) {
        this.volumeOfDebtSecuredByBankGuarantee = volumeOfDebtSecuredByBankGuarantee;
    }

    public String getBankGuaranteeSum() {
        return bankGuaranteeSum;
    }

    public void setBankGuaranteeSum(String bankGuaranteeSum) {
        this.bankGuaranteeSum = bankGuaranteeSum;
    }

    public String getBankGuaranteeTem() {
        return bankGuaranteeTem;
    }

    public void setBankGuaranteeTem(String bankGuaranteeTem) {
        this.bankGuaranteeTem = bankGuaranteeTem;
    }

    public String getCollateralValue() {
        return collateralValue;
    }

    public void setCollateralValue(String collateralValue) {
        this.collateralValue = collateralValue;
    }

    public Date getCollateralDate() {
        return collateralDate;
    }

    public void setCollateralDate(Date collateralDate) {
        this.collateralDate = collateralDate;
    }

    public String getOverallValueOfCredit() {
        return overallValueOfCredit;
    }

    public void setOverallValueOfCredit(String overallValueOfCredit) {
        this.overallValueOfCredit = overallValueOfCredit;
    }

    public String getRightOfClaimAcquirersNames() {
        return rightOfClaimAcquirersNames;
    }

    public void setRightOfClaimAcquirersNames(String rightOfClaimAcquirersNames) {
        this.rightOfClaimAcquirersNames = rightOfClaimAcquirersNames;
    }

    public String getRightOfClaimAcquirersRegistrationData() {
        return rightOfClaimAcquirersRegistrationData;
    }

    public void setRightOfClaimAcquirersRegistrationData(String rightOfClaimAcquirersRegistrationData) {
        this.rightOfClaimAcquirersRegistrationData = rightOfClaimAcquirersRegistrationData;
    }

    public Integer getRightOfClaimAcquirersTaxpayerID() {
        return rightOfClaimAcquirersTaxpayerID;
    }

    public void setRightOfClaimAcquirersTaxpayerID(Integer rightOfClaimAcquirersTaxpayerID) {
        this.rightOfClaimAcquirersTaxpayerID = rightOfClaimAcquirersTaxpayerID;
    }

    public Integer getRightOfClaimAcquirersSocialInsuranceNumber() {
        return rightOfClaimAcquirersSocialInsuranceNumber;
    }

    public void setRightOfClaimAcquirersSocialInsuranceNumber(Integer rightOfClaimAcquirersSocialInsuranceNumber) {
        this.rightOfClaimAcquirersSocialInsuranceNumber = rightOfClaimAcquirersSocialInsuranceNumber;
    }

    public Date getCompletePerformanceOfObligationsDate() {
        return completePerformanceOfObligationsDate;
    }

    public void setCompletePerformanceOfObligationsDate(Date completePerformanceOfObligationsDate) {
        this.completePerformanceOfObligationsDate = completePerformanceOfObligationsDate;
    }

    public Date getCollateralAgreementExpirationDate() {
        return collateralAgreementExpirationDate;
    }

    public void setCollateralAgreementExpirationDate(Date collateralAgreementExpirationDate) {
        this.collateralAgreementExpirationDate = collateralAgreementExpirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionSegment)) return false;

        TransactionSegment that = (TransactionSegment) o;

        if (!getSegmentTag().equals(that.getSegmentTag())) return false;
        if (!getMemberCode().equals(that.getMemberCode())) return false;
        if (!getAccountNumber().equals(that.getAccountNumber())) return false;
        if (getAccountType() != null ? !getAccountType().equals(that.getAccountType()) : that.getAccountType() != null)
            return false;
        if (!getAccountRelationship().equals(that.getAccountRelationship())) return false;
        if (getDateAccountOpened() != null ? !getDateAccountOpened().equals(that.getDateAccountOpened()) : that.getDateAccountOpened() != null)
            return false;
        if (getDateOfLastPayment() != null ? !getDateOfLastPayment().equals(that.getDateOfLastPayment()) : that.getDateOfLastPayment() != null)
            return false;
        if (getAccountRating() != null ? !getAccountRating().equals(that.getAccountRating()) : that.getAccountRating() != null)
            return false;
        if (getDateAccountRating() != null ? !getDateAccountRating().equals(that.getDateAccountRating()) : that.getDateAccountRating() != null)
            return false;
        if (getDateReported() != null ? !getDateReported().equals(that.getDateReported()) : that.getDateReported() != null)
            return false;
        if (getCreditLimit() != null ? !getCreditLimit().equals(that.getCreditLimit()) : that.getCreditLimit() != null)
            return false;
        if (getBalance() != null ? !getBalance().equals(that.getBalance()) : that.getBalance() != null) return false;
        if (getPastDue() != null ? !getPastDue().equals(that.getPastDue()) : that.getPastDue() != null) return false;
        if (getNextPayment() != null ? !getNextPayment().equals(that.getNextPayment()) : that.getNextPayment() != null)
            return false;
        if (getCreditPaymentFrequency() != null ? !getCreditPaymentFrequency().equals(that.getCreditPaymentFrequency()) : that.getCreditPaymentFrequency() != null)
            return false;
        if (getMop() != null ? !getMop().equals(that.getMop()) : that.getMop() != null) return false;
        if (getCurrencyCode() != null ? !getCurrencyCode().equals(that.getCurrencyCode()) : that.getCurrencyCode() != null)
            return false;
        if (getCollateralCode() != null ? !getCollateralCode().equals(that.getCollateralCode()) : that.getCollateralCode() != null)
            return false;
        if (getDateOfContractTermination() != null ? !getDateOfContractTermination().equals(that.getDateOfContractTermination()) : that.getDateOfContractTermination() != null)
            return false;
        if (getDatePaymentDue() != null ? !getDatePaymentDue().equals(that.getDatePaymentDue()) : that.getDatePaymentDue() != null)
            return false;
        if (getDateInterestPaymentDue() != null ? !getDateInterestPaymentDue().equals(that.getDateInterestPaymentDue()) : that.getDateInterestPaymentDue() != null)
            return false;
        if (getInterestPaymentFrequency() != null ? !getInterestPaymentFrequency().equals(that.getInterestPaymentFrequency()) : that.getInterestPaymentFrequency() != null)
            return false;
        if (getOldMemberCode() != null ? !getOldMemberCode().equals(that.getOldMemberCode()) : that.getOldMemberCode() != null)
            return false;
        if (getOldAccountNumber() != null ? !getOldAccountNumber().equals(that.getOldAccountNumber()) : that.getOldAccountNumber() != null)
            return false;
        if (getAmountOutstanding() != null ? !getAmountOutstanding().equals(that.getAmountOutstanding()) : that.getAmountOutstanding() != null)
            return false;
        if (getGuarantorIndicator() != null ? !getGuarantorIndicator().equals(that.getGuarantorIndicator()) : that.getGuarantorIndicator() != null)
            return false;
        if (getVolumeOfDebtSecuredByGuarantee() != null ? !getVolumeOfDebtSecuredByGuarantee().equals(that.getVolumeOfDebtSecuredByGuarantee()) : that.getVolumeOfDebtSecuredByGuarantee() != null)
            return false;
        if (getGuaranteeSum() != null ? !getGuaranteeSum().equals(that.getGuaranteeSum()) : that.getGuaranteeSum() != null)
            return false;
        if (getGuaranteeTem() != null ? !getGuaranteeTem().equals(that.getGuaranteeTem()) : that.getGuaranteeTem() != null)
            return false;
        if (getBankGuaranteeIndicator() != null ? !getBankGuaranteeIndicator().equals(that.getBankGuaranteeIndicator()) : that.getBankGuaranteeIndicator() != null)
            return false;
        if (getVolumeOfDebtSecuredByBankGuarantee() != null ? !getVolumeOfDebtSecuredByBankGuarantee().equals(that.getVolumeOfDebtSecuredByBankGuarantee()) : that.getVolumeOfDebtSecuredByBankGuarantee() != null)
            return false;
        if (getBankGuaranteeSum() != null ? !getBankGuaranteeSum().equals(that.getBankGuaranteeSum()) : that.getBankGuaranteeSum() != null)
            return false;
        if (getBankGuaranteeTem() != null ? !getBankGuaranteeTem().equals(that.getBankGuaranteeTem()) : that.getBankGuaranteeTem() != null)
            return false;
        if (getCollateralValue() != null ? !getCollateralValue().equals(that.getCollateralValue()) : that.getCollateralValue() != null)
            return false;
        if (getCollateralDate() != null ? !getCollateralDate().equals(that.getCollateralDate()) : that.getCollateralDate() != null)
            return false;
        if (getCollateralAgreementExpirationDate() != null ? !getCollateralAgreementExpirationDate().equals(that.getCollateralAgreementExpirationDate()) : that.getCollateralAgreementExpirationDate() != null)
            return false;
        if (getOverallValueOfCredit() != null ? !getOverallValueOfCredit().equals(that.getOverallValueOfCredit()) : that.getOverallValueOfCredit() != null)
            return false;
        if (getRightOfClaimAcquirersNames() != null ? !getRightOfClaimAcquirersNames().equals(that.getRightOfClaimAcquirersNames()) : that.getRightOfClaimAcquirersNames() != null)
            return false;
        if (getRightOfClaimAcquirersRegistrationData() != null ? !getRightOfClaimAcquirersRegistrationData().equals(that.getRightOfClaimAcquirersRegistrationData()) : that.getRightOfClaimAcquirersRegistrationData() != null)
            return false;
        if (getRightOfClaimAcquirersTaxpayerID() != null ? !getRightOfClaimAcquirersTaxpayerID().equals(that.getRightOfClaimAcquirersTaxpayerID()) : that.getRightOfClaimAcquirersTaxpayerID() != null)
            return false;
        if (getRightOfClaimAcquirersSocialInsuranceNumber() != null ? !getRightOfClaimAcquirersSocialInsuranceNumber().equals(that.getRightOfClaimAcquirersSocialInsuranceNumber()) : that.getRightOfClaimAcquirersSocialInsuranceNumber() != null)
            return false;
        return getCompletePerformanceOfObligationsDate() != null ? getCompletePerformanceOfObligationsDate().equals(that.getCompletePerformanceOfObligationsDate()) : that.getCompletePerformanceOfObligationsDate() == null;

    }

    @Override
    public int hashCode() {
        int result = getSegmentTag().hashCode();
        result = 31 * result + getMemberCode().hashCode();
        result = 31 * result + getAccountNumber().hashCode();
        result = 31 * result + (getAccountType() != null ? getAccountType().hashCode() : 0);
        result = 31 * result + getAccountRelationship().hashCode();
        result = 31 * result + (getDateAccountOpened() != null ? getDateAccountOpened().hashCode() : 0);
        result = 31 * result + (getDateOfLastPayment() != null ? getDateOfLastPayment().hashCode() : 0);
        result = 31 * result + (getAccountRating() != null ? getAccountRating().hashCode() : 0);
        result = 31 * result + (getDateAccountRating() != null ? getDateAccountRating().hashCode() : 0);
        result = 31 * result + (getDateReported() != null ? getDateReported().hashCode() : 0);
        result = 31 * result + (getCreditLimit() != null ? getCreditLimit().hashCode() : 0);
        result = 31 * result + (getBalance() != null ? getBalance().hashCode() : 0);
        result = 31 * result + (getPastDue() != null ? getPastDue().hashCode() : 0);
        result = 31 * result + (getNextPayment() != null ? getNextPayment().hashCode() : 0);
        result = 31 * result + (getCreditPaymentFrequency() != null ? getCreditPaymentFrequency().hashCode() : 0);
        result = 31 * result + (getMop() != null ? getMop().hashCode() : 0);
        result = 31 * result + (getCurrencyCode() != null ? getCurrencyCode().hashCode() : 0);
        result = 31 * result + (getCollateralCode() != null ? getCollateralCode().hashCode() : 0);
        result = 31 * result + (getDateOfContractTermination() != null ? getDateOfContractTermination().hashCode() : 0);
        result = 31 * result + (getDatePaymentDue() != null ? getDatePaymentDue().hashCode() : 0);
        result = 31 * result + (getDateInterestPaymentDue() != null ? getDateInterestPaymentDue().hashCode() : 0);
        result = 31 * result + (getInterestPaymentFrequency() != null ? getInterestPaymentFrequency().hashCode() : 0);
        result = 31 * result + (getOldMemberCode() != null ? getOldMemberCode().hashCode() : 0);
        result = 31 * result + (getOldAccountNumber() != null ? getOldAccountNumber().hashCode() : 0);
        result = 31 * result + (getAmountOutstanding() != null ? getAmountOutstanding().hashCode() : 0);
        result = 31 * result + (getGuarantorIndicator() != null ? getGuarantorIndicator().hashCode() : 0);
        result = 31 * result + (getVolumeOfDebtSecuredByGuarantee() != null ? getVolumeOfDebtSecuredByGuarantee().hashCode() : 0);
        result = 31 * result + (getGuaranteeSum() != null ? getGuaranteeSum().hashCode() : 0);
        result = 31 * result + (getGuaranteeTem() != null ? getGuaranteeTem().hashCode() : 0);
        result = 31 * result + (getBankGuaranteeIndicator() != null ? getBankGuaranteeIndicator().hashCode() : 0);
        result = 31 * result + (getVolumeOfDebtSecuredByBankGuarantee() != null ? getVolumeOfDebtSecuredByBankGuarantee().hashCode() : 0);
        result = 31 * result + (getBankGuaranteeSum() != null ? getBankGuaranteeSum().hashCode() : 0);
        result = 31 * result + (getBankGuaranteeTem() != null ? getBankGuaranteeTem().hashCode() : 0);
        result = 31 * result + (getCollateralValue() != null ? getCollateralValue().hashCode() : 0);
        result = 31 * result + (getCollateralDate() != null ? getCollateralDate().hashCode() : 0);
        result = 31 * result + (getCollateralAgreementExpirationDate() != null ? getCollateralAgreementExpirationDate().hashCode() : 0);
        result = 31 * result + (getOverallValueOfCredit() != null ? getOverallValueOfCredit().hashCode() : 0);
        result = 31 * result + (getRightOfClaimAcquirersNames() != null ? getRightOfClaimAcquirersNames().hashCode() : 0);
        result = 31 * result + (getRightOfClaimAcquirersRegistrationData() != null ? getRightOfClaimAcquirersRegistrationData().hashCode() : 0);
        result = 31 * result + (getRightOfClaimAcquirersTaxpayerID() != null ? getRightOfClaimAcquirersTaxpayerID().hashCode() : 0);
        result = 31 * result + (getRightOfClaimAcquirersSocialInsuranceNumber() != null ? getRightOfClaimAcquirersSocialInsuranceNumber().hashCode() : 0);
        result = 31 * result + (getCompletePerformanceOfObligationsDate() != null ? getCompletePerformanceOfObligationsDate().hashCode() : 0);
        return result;
    }
}
