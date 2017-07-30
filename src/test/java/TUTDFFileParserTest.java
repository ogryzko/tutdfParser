import model.TUTDFData;
import model.TUTDFEntry;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

import static org.junit.Assert.assertEquals;

/**
 * Created by EGlushchenko on 28.07.2017.
 */
public class TUTDFFileParserTest {
    TUTDFFileParser parser;
    TUTDFData sampleBC;
    TUTDFData sampleTR;

    @Before
    public void init() throws ParseException {
        parser = new TUTDFFileParser();
        sampleBC = new TUTDFData();
        TUTDFEntry sampleBCEntry = new TUTDFEntry();
        sampleBCEntry.setHeaderSegment(
                parser.parseHeaderSegment("TUTDF\t4.0r\t20150701\t1301ZZ013006\t\t20160102\t4d9e6s8w\t"));
        sampleBCEntry.getIdSegmentList().add(
                parser.parseIdSegment("ID01\t21\t19 12\t982429\t20120707\tОУФМС России по Москве\t\t"));
        sampleBCEntry.setNameSegment(parser.parseNameSegment("NA01\tПортугалин\tСергеевич\tПетр\t\t19880710\tМосква\t\t\t\t\t\t"));
        sampleBCEntry.setTrlrSegment(parser.parseTRLRSegment("TRLR\t"));
        sampleBC.getTutdfEntryList().add(sampleBCEntry);

        sampleTR = new TUTDFData();
        TUTDFEntry sampleTREntry = new TUTDFEntry();
        sampleTREntry.setHeaderSegment(
                parser.parseHeaderSegment("TUTDF\t4.0r\t20150701\t9999ZZ999999\t\t20160713\t12879654\t"));
        sampleTREntry.getIdSegmentList().add(
                parser.parseIdSegment("ID01\t21\t7955\t765022\t20051107\tИглинским РОВД РБ\tИглинским РОВД РБ\t"));
        sampleTREntry.setNameSegment(
                parser.parseNameSegment(
                        "NA01\tНотреалова\tИвановна\tТатьяна\t\t19850904\tпос.МУрман Мирского района РБ\t\t\t\t\t\t"));
        sampleTREntry.setTransactionSegment(
                parser.parseTransactionSegment(
                        "TR01\t1452pp011001\t45859874585\t09\t1\t20160610\t20160712\t00\t20160713\t20160713\t5000\t0\t0\t0\t7\t1\tRUB\t\t20160701\t20160701\t20160701\t7\t\t\t0\tN\t\t\t\tN\t\t\t\t\t\t\t\t\t\t\t\t"));
        sampleTREntry.setTrlrSegment(parser.parseTRLRSegment("TRLR\t"));
        sampleTR.getTutdfEntryList().add(sampleTREntry);

        /*"TUTDF\t4.0r\t20150701\t9999ZZ999999\t\t20160713\t12879654\t\n" +
                "ID01\t21\t7955\t765022\t20051107\tИглинским РОВД РБ\tИглинским РОВД РБ\t\n" +
                "NA01\tНотреалова\tИвановна\tТатьяна\t\t19850904\tпос.МУрман Мирского района РБ\t\t\t\t\t\t\n" +
                "AD01\t1\t\tRU\t2\t\t\tС.Урман\t28\tГоголя,\t28\t\t\t\t\t\n" +
                "AD02\t2\t\tRU\t2\t\t\tС.Урман\t28\tГоголя,\t28\t\t\t\t\t\n" +
                "TR01\t1452pp011001\t45859874585\t09\t1\t20160610\t20160712\t00\t20160713\t20160713\t5000\t0\t0\t0\t7\t1\tRUB\t\t20160701\t20160701\t20160701\t7\t\t\t0\tN\t\t\t\tN\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "TRLR\t\n"*/
    }

    @Test
    public void testParseFileBCExample() throws IOException, ParseException {
        ClassLoader classLoader = getClass().getClassLoader();
        TUTDFData data = parser.parseTUTDFFile(classLoader.getResourceAsStream(
                "TUTDF Sample v 4.0 - BC_bankruptcy_20160805.txt"));
        assertEquals(sampleBC, data);
    }

    @Test
    public void testParseFileTRExample() throws IOException, ParseException {
        ClassLoader classLoader = getClass().getClassLoader();
        TUTDFData data = parser.parseTUTDFFile(classLoader.getResourceAsStream(
                "TUTDF Sample v 4.0 - TR_20160805.txt"));
        assertEquals(sampleTR, data);
    }
}
