import model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by EGlushchenko on 27.07.2017.
 */
public class tutdfFileParser {

    private static final String TUTDF_LOG_TAG = "@TUTDF: " ;
    private static final String TR_LOG_TAG = "@TR: " ;
    private static final String TRLR_LOG_TAG = "@TRLR: ";
    private static final String ID_LOG_TAG = "@ID: ";
    private static final String NA_LOG_TAG = "@NA: ";
    private static final String PN_LOG_TAG = "@PN: ";
    
    private static final int NUM_ID_FIELDS = 8;
    private static final int NUM_NA_FIELDS = 13;
    private static final int NUM_TR_FIELDS = 42;
    private static final int NUM_TUTDF_FIELDS = 8;
    private static final int NUM_TRLR_FIELDS = 2;
    private static final String UNKNOWN_LOG_TAG = "@UNKNOWN: ";

    private  final SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDD");
    private static final String NEWLINE = System.getProperty("line.separator");
    private tutdfEntry currentEntry;

    private Logger log = Logger.getLogger(tutdfFileParser.class.getName());

    private tutdfData data;

    public tutdfFileParser(){
        data = new tutdfData();
    }

    public tutdfData parseTUTDFFile(InputStream inStream) throws IOException, ParseException {
        BufferedReader reader = getBufferedReader(inStream);
        return parseTUTDFFile(reader);
    }

    public tutdfData parseTUTDFFile(BufferedReader reader) throws IOException, ParseException {
        String currentLine = null;
        currentEntry = null;

        data = new tutdfData();

        while ((currentLine = reader.readLine()) != null){
            if(currentLine.equals("") ||
                    currentLine.equals(NEWLINE)){
                continue;
            }
            switch (segmentTagFromLine(currentLine)){
                case TUTDF:
                    tutdfTUTDFHandler(currentLine);
                    break;
                case TR:
                    tutdfTRHandler(currentLine);
                    break;
                case PN:
                    tutdfPNHandler(currentLine);
                    break;
                case NA:
                    tutdfNAHandler(currentLine);
                    break;
                case ID:
                    tutdfIDHandler(currentLine);
                    break;
                case TRLR:
                    tutdfTRLRHandler(currentLine);
                    break;
                case UNKNOWN:
                    tutdfUNKNOWNHandler(currentLine);
                    break;
                default:
                    // todo
                    break;

            }
        }

        return data;
    }

    private void tutdfUNKNOWNHandler(String currentLine) {
        log.log(Level.INFO, UNKNOWN_LOG_TAG + "Unexpected segment occurrence!");
    }

    private void tutdfTRLRHandler(String currentLine) {
        if(currentEntry == null){
            log.log(Level.INFO, TRLR_LOG_TAG + "Unexpected segment occurrence!");
            return;
        }

        String[] strArr = currentLine.split("\t");
        if(strArr.length != NUM_TRLR_FIELDS) return; // todo
        
        TRLRSegment trlrSegment = new TRLRSegment();

        String trailerSegment = strArr[0];
        trlrSegment.setTrailerSegment(trailerSegment);

        String counterString = strArr[1];
        int counter = Integer.parseInt(counterString);
        trlrSegment.setCounter(counter);

        currentEntry.setTrlrSegment(trlrSegment);
        data.getTutdfEntryList().add(currentEntry);
        currentEntry = null;
    }

    private void tutdfIDHandler(String currentLine) throws ParseException {
        if(currentEntry == null){
            log.log(Level.INFO, ID_LOG_TAG + "Unexpected segment occurrence!");
            return;
        }

        String[] strArr = currentLine.split("\t");
        if(strArr.length != NUM_ID_FIELDS) return; // todo

        IDSegment idSegment = new IDSegment();

        String segmentTag = strArr[0];
        idSegment.setSegmentTag(segmentTag);

        String idTypeString = strArr[1];
        int idType = Integer.parseInt(idTypeString);
        idSegment.setIdType(idType);

        String seriesNumber = strArr[2];
        idSegment.setSeriesNumber(seriesNumber);

        String idNumber = strArr[3];
        idSegment.setIdNumber(idNumber);

        String issueDateString = strArr[4];
        Date issueDate = sdf.parse(issueDateString);
        idSegment.setIssueDate(issueDate);

        String issueAuthority = strArr[5];
        idSegment.setIssueAuthority(issueAuthority);

        String issueLocation = strArr[6];
        idSegment.setIssueLocation(issueLocation);

        String oldIDNumber = strArr[7];
        idSegment.setOldIDNumber(oldIDNumber);
        currentEntry.getIdSegmentList().add(idSegment); // todo
    }

    private void tutdfNAHandler(String currentLine) throws ParseException {
        if(currentEntry == null){
            log.log(Level.INFO, NA_LOG_TAG + "Unexpected segment occurrence!");
            return;
        }

        String[] strArr = currentLine.split("\t");
        if(strArr.length != NUM_NA_FIELDS) return; //todo

        NameSegment nameSegment = new NameSegment();

        String segmentTag = strArr[0];
        nameSegment.setSegmentTag(segmentTag);

        String surname = strArr[1];
        nameSegment.setSurname(surname);

        String patronymicName = strArr[2];
        nameSegment.setPatronymicName(patronymicName);

        String firstName = strArr[3];
        nameSegment.setFirstName(firstName);

        String emptyField1String = strArr[4];
        int emptyField1 = Integer.parseInt(emptyField1String); // todo ask about "empty numeric field"...
        nameSegment.setEmptyField1(emptyField1);

        String dateOfBirthString = strArr[5];
        Date dateOfBirth = sdf.parse(dateOfBirthString);
        nameSegment.setDateOfBirth(dateOfBirth);

        String placeOfBirth = strArr[6];
        nameSegment.setPlaceOfBirth(placeOfBirth);

        String emptyField2 = strArr[7];
        nameSegment.setEmptyField2(emptyField2);

        String emptyField3String = strArr[8];
        int emptyField3 = Integer.parseInt(emptyField3String);
        nameSegment.setEmptyField3(emptyField3);

        String emptyField4String = strArr[9];
        int emptyField4 = Integer.parseInt(emptyField4String);
        nameSegment.setEmptyField4(emptyField4);

        String remarksString = strArr[10];
        int remarks = Integer.parseInt(remarksString);
        nameSegment.setRemarks(remarks);

        String oldSurname = strArr[11];
        nameSegment.setOldSurname(oldSurname);

        String oldFirstName = strArr[12];
        nameSegment.setOldFirstName(oldFirstName);

        currentEntry.setNameSegment(nameSegment);
    }

    private void tutdfPNHandler(String currentLine) {
        if(currentEntry == null){
            log.log(Level.INFO, PN_LOG_TAG + "Unexpected segment occurrence!");
            return;
        }
        String[] strArr = currentLine.split("\t");
        if(strArr.length != NUM_NA_FIELDS) return; //todo
        
        PhoneNumberSegment phoneNumberSegment = new PhoneNumberSegment();
        
        String segmentTag = strArr[0];
        phoneNumberSegment.setSegmentTag(segmentTag);
        
        String number = strArr[1];
        phoneNumberSegment.setNumber(number);
        
        String typeString = strArr[2];
        int type = Integer.parseInt(typeString);
        phoneNumberSegment.setType(type);

        currentEntry.getPhoneNumberSegmentList().add(phoneNumberSegment);
    }

    private void tutdfTRHandler(String currentLine) throws ParseException {
        if(currentEntry == null){
            log.log(Level.INFO, TR_LOG_TAG + "Unexpected segment occurrence!");
            return;
        }
        String[] strArr = currentLine.split("\t");
        if(strArr.length != NUM_TR_FIELDS) return; //todo

        TransactionSegment transactionSegment = new TransactionSegment();

        String segmentTag = strArr[0];
        transactionSegment.setSegmentTag(segmentTag);

        String memberCode = strArr[1];
        transactionSegment.setMemberCode(memberCode);

        String accountNumber = strArr[2];
        transactionSegment.setAccountNumber(accountNumber);

        String accountTypeString = strArr[3];
        int accountType = Integer.parseInt(accountTypeString);
        transactionSegment.setAccountType(accountType);

        String accountRelationshipString = strArr[4];
        int accountRelationship = Integer.parseInt(accountRelationshipString);
        transactionSegment.setAccountRelationship(accountRelationship);

        String dateAccountOpenedString = strArr[5];
        Date dateAccountOpened = sdf.parse(dateAccountOpenedString);
        transactionSegment.setDateAccountOpened(dateAccountOpened);

        String dateOfLastPaymentString = strArr[6];
        Date dateOfLastPayment = sdf.parse(dateOfLastPaymentString);
        transactionSegment.setDateOfLastPayment(dateOfLastPayment);

        String accountRatingString = strArr[7];
        int accountRating = Integer.parseInt(accountRatingString);
        transactionSegment.setAccountRating(accountRating);

        String dateAccountRatingString = strArr[8];
        Date dateAccountRating = sdf.parse(dateAccountRatingString);
        transactionSegment.setDateAccountRating(dateAccountRating);

        String dateReportedString = strArr[9];
        Date dateReported = sdf.parse(dateReportedString);
        transactionSegment.setDateReported(dateReported);

        String creditLimit = strArr[10];
        transactionSegment.setCreditLimit(creditLimit);

        String balance = strArr[11];
        transactionSegment.setBalance(balance);

        String pastDue = strArr[12];
        transactionSegment.setPastDue(pastDue);

        String nextPayment = strArr[13];
        transactionSegment.setNextPayment(nextPayment);

        String creditPaymentFrequencyString = strArr[14];
        int creditPaymentFrequency = Integer.parseInt(creditPaymentFrequencyString);
        transactionSegment.setCreditPaymentFrequency(creditPaymentFrequency);

        String mop = strArr[15];
        transactionSegment.setMop(mop);

        String currencyCode = strArr[16];
        transactionSegment.setCurrencyCode(currencyCode);

         String collateralCodeString = strArr[17];
         int collateralCode = Integer.parseInt(collateralCodeString);
         transactionSegment.setCollateralCode(collateralCode);

         String dateOfContractTerminationString = strArr[18];
         Date dateOfContractTermination = sdf.parse(dateOfContractTerminationString);
         transactionSegment.setDateOfContractTermination(dateOfContractTermination);

         String datePaymentDueString = strArr[19];
         Date datePaymentDue = sdf.parse(datePaymentDueString);
         transactionSegment.setDatePaymentDue(datePaymentDue);

         String dateInterestPaymentDueString = strArr[20];
         Date dateInterestPaymentDue = sdf.parse(dateInterestPaymentDueString);
         transactionSegment.setDatePaymentDue(dateInterestPaymentDue);

         String interestPaymentFrequencyString = strArr[21];
         int interestPaymentFrequency = Integer.parseInt(interestPaymentFrequencyString);
         transactionSegment.setInterestPaymentFrequency(interestPaymentFrequency);

        String oldMemberCode = strArr[22];
         transactionSegment.setOldMemberCode(oldMemberCode);

         String oldAccountNumber = strArr[23];
         transactionSegment.setOldAccountNumber(oldAccountNumber);

         String amountOutstanding = strArr[24];
         transactionSegment.setAmountOutstanding(amountOutstanding);

         String guarantorIndicator = strArr[25];
         transactionSegment.setGuarantorIndicator(guarantorIndicator);

         String volumeOfDebtSecuredByGuarantee = strArr[26];
         transactionSegment.setVolumeOfDebtSecuredByBankGuarantee(volumeOfDebtSecuredByGuarantee); ;

         String guaranteeSum = strArr[27];
         transactionSegment.setGuaranteeSum(guaranteeSum);

         String guaranteeTemString = strArr[28];
         Date guaranteeTem = sdf.parse(guaranteeTemString);
         transactionSegment.setGuaranteeTem(guaranteeTem);

         String bankGuaranteeIndicator = strArr[29];
         transactionSegment.setBankGuaranteeIndicator(bankGuaranteeIndicator);

         String volumeOfDebtSecuredByBankGuarantee = strArr[30];
         transactionSegment.setVolumeOfDebtSecuredByBankGuarantee(volumeOfDebtSecuredByBankGuarantee);

         String bankGuaranteeSum = strArr[31];
         transactionSegment.setBankGuaranteeSum(bankGuaranteeSum);

         String bankGuaranteeTem = strArr[32];
         transactionSegment.setBankGuaranteeTem(bankGuaranteeTem);

         String collateralValue = strArr[33];
         transactionSegment.setCollateralValue(collateralValue);

         String collateralDateString  = strArr[34];
         Date collateralDate = sdf.parse(collateralDateString);
         transactionSegment.setCollateralDate(collateralDate);

         String collateralAgreementExpirationDateString = strArr[35];
         Date collateralAgreementExpirationDate = sdf.parse(collateralAgreementExpirationDateString);
         transactionSegment.setCollateralAgreementExpirationDate(collateralAgreementExpirationDate);

         String overallValueOfCredit = strArr[36];
         transactionSegment.setOverallValueOfCredit(overallValueOfCredit);

         String rightOfClaimAcquirersNames = strArr[37];
         transactionSegment.setRightOfClaimAcquirersNames(rightOfClaimAcquirersNames);

         String rightOfClaimAcquirersRegistrationData = strArr[38];
         transactionSegment.setRightOfClaimAcquirersRegistrationData(rightOfClaimAcquirersRegistrationData);

         String rightOfClaimAcquirersTaxpayerIDString = strArr[39];
         int rightOfClaimAcquirersTaxpayerID = Integer.parseInt(rightOfClaimAcquirersTaxpayerIDString);
         transactionSegment.setRightOfClaimAcquirersTaxpayerID(rightOfClaimAcquirersTaxpayerID);

         String rightOfClaimAcquirersSocialInsuranceNumberString = strArr[40];
         int rightOfClaimAcquirersSocialInsuranceNumber = Integer.parseInt(rightOfClaimAcquirersSocialInsuranceNumberString);
         transactionSegment.setRightOfClaimAcquirersSocialInsuranceNumber(rightOfClaimAcquirersSocialInsuranceNumber);

         String completePerformanceOfObligationsDateString = strArr[41];
         Date completePerformanceOfObligationsDate = sdf.parse(completePerformanceOfObligationsDateString);
         transactionSegment.setCompletePerformanceOfObligationsDate(completePerformanceOfObligationsDate);

         currentEntry.setTransactionSegment(transactionSegment);
    }

    private void tutdfTUTDFHandler(String currentLine) throws ParseException {

        if(currentEntry == null){
            currentEntry = new tutdfEntry();
        } else{
            log.log(Level.INFO, TUTDF_LOG_TAG + "Unexpected entry header!");
            return;
        }
        String[] strArr = currentLine.split("\t");
        if(strArr.length != NUM_TUTDF_FIELDS) return; //todo

        HeaderSegment headerSegment = new HeaderSegment();

        String segmentTag = strArr[0];
        headerSegment.setSegmentTag(segmentTag);

        String version = strArr[1];
        headerSegment.setVersion(version);

        String versionDateString = strArr[2];
        Date versionDate = sdf.parse(versionDateString);
        headerSegment.setVersionDate(versionDate);

        String memberCode = strArr[3];
        headerSegment.setMemberCode(memberCode);

        String cycleIdentification = strArr[4];
        headerSegment.setCycleIdentification(cycleIdentification);

        String reportedDateString = strArr[5];
        Date reportedDate = sdf.parse(reportedDateString);
        headerSegment.setReportDate(reportedDate);

        String authorizationCode = strArr[6];
        headerSegment.setAuthorizationCode(authorizationCode);

        String memberData = strArr[7];
        headerSegment.setMemberData(memberData);

        currentEntry.setHeaderSegment(headerSegment);

    }

    private SegmentTag segmentTagFromLine(String line){
        if(line.startsWith("TUTDF")) return SegmentTag.TUTDF;
        else if(line.startsWith("TRLR")) return SegmentTag.TRLR;
        else if(line.startsWith("ID")) return SegmentTag.ID;
        else if(line.startsWith("NA")) return SegmentTag.NA;
        else if(line.startsWith("PN")) return SegmentTag.PN;
        else if(line.startsWith("TR")) return SegmentTag.TR;
        else return SegmentTag.UNKNOWN;
    }

    private BufferedReader getBufferedReader(InputStream inStream)
            throws IOException {

        BufferedReader reader;
        if (inStream == null) {
            throw new IOException ("input stream is null!");
        }

        reader = new BufferedReader (new InputStreamReader(inStream, Charset.forName("windows-1251") ));
        return reader;

    }
}
