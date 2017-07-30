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

    @Before
    public void init() throws ParseException {
        parser = new TUTDFFileParser();
        sampleBC = new TUTDFData();
        TUTDFEntry sampleBCEntry = new TUTDFEntry();
        sampleBCEntry.setHeaderSegment(
                parser.parseHeaderSegment("TUTDF\t4.0r\t20150701\t1301ZZ013006\t\t20160102\t4d9e6s8w"));
        sampleBCEntry.getIdSegmentList().add(
                parser.parseIdSegment("ID01\t21\t19 12\t982429\t20120707\tОУФМС России по Москве"));
        sampleBCEntry.setNameSegment(parser.parseNameSegment("NA01\tПортугалин\tСергеевич\tПетр\t\t19880710\tМосква"));
        sampleBCEntry.setTrlrSegment(parser.parseTRLRSegment("TRLR"));
        sampleBC.getTutdfEntryList().add(sampleBCEntry);
    }

    @Test
    public void tutdfTUTDFHandler() throws IOException, ParseException {
        ClassLoader classLoader = getClass().getClassLoader();
        TUTDFData data = parser.parseTUTDFFile(classLoader.getResourceAsStream(
                "TUTDF Sample v 4.0 - BC_bankruptcy_20160805.txt"));
        assertEquals(sampleBC, data);
    }
}
