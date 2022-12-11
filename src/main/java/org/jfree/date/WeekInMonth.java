package org.jfree.date;

public enum WeekInMonth {
    FIRST(1), SECOND(2), THIRD(3), FOURTH(4), LAST(0);

    public final int index;

    WeekInMonth(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        switch (this) {
            case FIRST : return "First";
            case SECOND : return "Second";
            case THIRD : return "Third";
            case FOURTH : return "Fourth";
            case LAST : return "Last";
        }
        return "";
    }
}
