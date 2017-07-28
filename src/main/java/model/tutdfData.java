package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EGlushchenko on 28.07.2017.
 */
public class tutdfData {
    List<tutdfEntry> tutdfEntryList = new ArrayList<tutdfEntry>();

    public List<tutdfEntry> getTutdfEntryList() {
        return tutdfEntryList;
    }

    public void setTutdfEntryList(List<tutdfEntry> tutdfEntryList) {
        this.tutdfEntryList = tutdfEntryList;
    }
}
