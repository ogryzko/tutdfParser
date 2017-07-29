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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TUTDFData)) return false;

        TUTDFData tutdfData = (TUTDFData) o;

        return getTutdfEntryList() != null ? getTutdfEntryList().equals(tutdfData.getTutdfEntryList()) : tutdfData.getTutdfEntryList() == null;

    }

    @Override
    public int hashCode() {
        return getTutdfEntryList() != null ? getTutdfEntryList().hashCode() : 0;
    }
}
