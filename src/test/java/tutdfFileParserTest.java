import model.TUTDFData;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by EGlushchenko on 28.07.2017.
 */
public class tutdfFileParserTest {
    tutdfFileParser parser;

    @Before
    public void init(){
        parser = new tutdfFileParser();
    }

    @Test
    public void tutdfTUTDFHandler() throws IOException, ParseException {

        ClassLoader classLoader = getClass().getClassLoader();
        TUTDFData data = parser.parseTUTDFFile(classLoader.getResourceAsStream("TUTDF Sample v 4.0 - BC_bankruptcy_20160805.txt"));
    }
}
