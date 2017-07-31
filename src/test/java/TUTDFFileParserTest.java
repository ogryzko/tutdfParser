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
    TUTDFData sampleCLGRBG;

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

        sampleCLGRBG = new TUTDFData();
        TUTDFEntry sampleCLGRBGEntry = new TUTDFEntry();
        sampleCLGRBGEntry.setHeaderSegment(parser.parseHeaderSegment("TUTDF\t4.0r\t20150701\t9999ZZ999999\t\t20151002\t12345678\t"));
        sampleCLGRBGEntry.getIdSegmentList().add(parser.parseIdSegment("ID01\t21\t12 09\t655346\t20100707\tОУФМС России\t\t"));
        sampleCLGRBGEntry.setNameSegment(parser.parseNameSegment("NA01\tПетри\tВадимович\tОлег\t\t19831210\tМосква\t\t\t\t\t\t"));
        sampleCLGRBGEntry.setTransactionSegment(parser.parseTransactionSegment("TR01\t9999ZZ999999\t375578533344\t16\t1\t20150401\t19000102\t0\t20150401\t20150401\t2200\t0\t0\t1000\t3\t0\tRUB\t01\t20150501\t20150501\t20150501\t3\t\t\t1000\tG\tP\t100\t20150501\tB\tP\t100\t20150501\t1000\t20150401\t20150501\t100, 000\t\t\t\t20150501\t"));
        sampleCLGRBGEntry.setTrlrSegment(parser.parseTRLRSegment("TRLR\t"));
        sampleCLGRBG.getTutdfEntryList().add(sampleCLGRBGEntry);

        String s = "TUTDF\t4.0r\t20150701\t9999ZZ999999\t\t20151002\t12345678\t\n" +
                "ID01\t21\t12 09\t655346\t20100707\tОУФМС России\t\t\n" +
                "NA01\tПетри\tВадимович\tОлег\t\t19831210\tМосква\t\t\t\t\t\t\n" +
                "AD01\t2\t363240\t\t\t\t\tМосква\t\tГагарина\t\t\t\t\t\t\n" +
                "AD02\t1\t363240\t\t\t\t\tМосква\t\tГагарина\t\t\t\t\t\t\n" +
                "CL01\t2\t16\t500\t20150401\t20150501\n" +
                "CL02\t3\t19\t600\t20150402\t20150501\n" +
                "GR01\t70076768567685658664866485648664856456453547\tP\t700\t20150403\n" +
                "GR02\t5\tP\t800\t20150404\n" +
                "BG01\t6\tP\t200\t20150405\n" +
                "BG02\t7\tP\t900\t20150406\n" +
                "TR01\t9999ZZ999999\t375578533344\t16\t1\t20150401\t19000102\t0\t20150401\t20150401\t2200\t0\t0\t1000\t3\t0\tRUB\t01\t20150501\t20150501\t20150501\t3\t\t\t1000\tG\tP\t100\t20150501\tB\tP\t100\t20150501\t1000\t20150401\t20150501\t100,000\t\t\t\t20150501\t\n" +
                "TRLR\t\n";
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

    @Test
    public void testParseFileCLGRBGExample() throws IOException, ParseException {
        ClassLoader classLoader = getClass().getClassLoader();
        TUTDFData data = parser.parseTUTDFFile(classLoader.getResourceAsStream(
                "TUTDF Sample v 4.0 - CL_GR_BG_20160224.txt"));
        assertEquals(sampleCLGRBG, data);
    }
}
