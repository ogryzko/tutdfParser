package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EGlushchenko on 28.07.2017.
 */
public class TUTDFData {
    List<TUTDFEntry> tutdfEntryList = new ArrayList<TUTDFEntry>();

    public List<TUTDFEntry> getTutdfEntryList() {
        return tutdfEntryList;
    }

    public void setTutdfEntryList(List<TUTDFEntry> tutdfEntryList) {
        this.tutdfEntryList = tutdfEntryList;
    }
}
