package model;

import java.util.Date;

/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class TransactionSegment {
    private String segmentTag;
    private String memberCode;
    private String accountNumber;
    private int accountType;
    private int accountRelationship;
    private Date dateAccountOpened;
    private Date dateOfLastPayment;
    private int accountRating;
    private Date dateAccountRating;
    private Date dateReported;
    private String creditLimit;
    private String balance;
    private String pastDue;
    private String nextPayment;
    private int creditPaymentFrequency;
    private String mop;
    private String currencyCode;
    private int collateralCode;
    private Date dateOfContractTermination;
    private Date datePaymentDue;
    private Date dateInterestPaymentDue;
    private int interestPaymentFrequency;
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
    private int rightOfClaimAcquirersTaxpayerID;
    private int rightOfClaimAcquirersSocialInsuranceNumber;
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

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getAccountRelationship() {
        return accountRelationship;
    }

    public void setAccountRelationship(int accountRelationship) {
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

    public int getAccountRating() {
        return accountRating;
    }

    public void setAccountRating(int accountRating) {
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

    public int getCreditPaymentFrequency() {
        return creditPaymentFrequency;
    }

    public void setCreditPaymentFrequency(int creditPaymentFrequency) {
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

    public int getCollateralCode() {
        return collateralCode;
    }

    public void setCollateralCode(int collateralCode) {
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

    public int getInterestPaymentFrequency() {
        return interestPaymentFrequency;
    }

    public void setInterestPaymentFrequency(int interestPaymentFrequency) {
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

    public int getRightOfClaimAcquirersTaxpayerID() {
        return rightOfClaimAcquirersTaxpayerID;
    }

    public void setRightOfClaimAcquirersTaxpayerID(int rightOfClaimAcquirersTaxpayerID) {
        this.rightOfClaimAcquirersTaxpayerID = rightOfClaimAcquirersTaxpayerID;
    }

    public int getRightOfClaimAcquirersSocialInsuranceNumber() {
        return rightOfClaimAcquirersSocialInsuranceNumber;
    }

    public void setRightOfClaimAcquirersSocialInsuranceNumber(int rightOfClaimAcquirersSocialInsuranceNumber) {
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
}
