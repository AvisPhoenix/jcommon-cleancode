package org.jfree.date;

import junit.framework.TestCase;


public class BobsDayDateTest extends TestCase {
    

    public void testMonthToQuarter() throws Exception {
        assertEquals(1, DayDate.monthToQuarter(DayDate.Month.JANUARY));
        assertEquals(1, DayDate.monthToQuarter(DayDate.Month.FEBRUARY));
        assertEquals(1, DayDate.monthToQuarter(DayDate.Month.MARCH));
        assertEquals(2, DayDate.monthToQuarter(DayDate.Month.APRIL));
        assertEquals(2, DayDate.monthToQuarter(DayDate.Month.MAY));
        assertEquals(2, DayDate.monthToQuarter(DayDate.Month.JUNE));
        assertEquals(3, DayDate.monthToQuarter(DayDate.Month.JULY));
        assertEquals(3, DayDate.monthToQuarter(DayDate.Month.AUGUST));
        assertEquals(3, DayDate.monthToQuarter(DayDate.Month.SEPTEMBER));
        assertEquals(4, DayDate.monthToQuarter(DayDate.Month.OCTOBER));
        assertEquals(4, DayDate.monthToQuarter(DayDate.Month.NOVEMBER));
        assertEquals(4, DayDate.monthToQuarter(DayDate.Month.DECEMBER));

        try {
            DayDate.Month.make(-1);
            fail("Invalid Month Code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testMonthToString() throws Exception {
        assertEquals("January", DayDate.monthToString(DayDate.Month.JANUARY));
        assertEquals("February", DayDate.monthToString(DayDate.Month.FEBRUARY));
        assertEquals("March", DayDate.monthToString(DayDate.Month.MARCH));
        assertEquals("April", DayDate.monthToString(DayDate.Month.APRIL));
        assertEquals("May", DayDate.monthToString(DayDate.Month.MAY));
        assertEquals("June", DayDate.monthToString(DayDate.Month.JUNE));
        assertEquals("July", DayDate.monthToString(DayDate.Month.JULY));
        assertEquals("August", DayDate.monthToString(DayDate.Month.AUGUST));
        assertEquals("September", DayDate.monthToString(DayDate.Month.SEPTEMBER));
        assertEquals("October", DayDate.monthToString(DayDate.Month.OCTOBER));
        assertEquals("November", DayDate.monthToString(DayDate.Month.NOVEMBER));
        assertEquals("December", DayDate.monthToString(DayDate.Month.DECEMBER));

        assertEquals("Jan", DayDate.monthToString(DayDate.Month.JANUARY, true));
        assertEquals("Feb", DayDate.monthToString(DayDate.Month.FEBRUARY, true));
        assertEquals("Mar", DayDate.monthToString(DayDate.Month.MARCH, true));
        assertEquals("Apr", DayDate.monthToString(DayDate.Month.APRIL, true));
        assertEquals("May", DayDate.monthToString(DayDate.Month.MAY, true));
        assertEquals("Jun", DayDate.monthToString(DayDate.Month.JUNE, true));
        assertEquals("Jul", DayDate.monthToString(DayDate.Month.JULY, true));
        assertEquals("Aug", DayDate.monthToString(DayDate.Month.AUGUST, true));
        assertEquals("Sep", DayDate.monthToString(DayDate.Month.SEPTEMBER, true));
        assertEquals("Oct", DayDate.monthToString(DayDate.Month.OCTOBER, true));
        assertEquals("Nov", DayDate.monthToString(DayDate.Month.NOVEMBER, true));
        assertEquals("Dec", DayDate.monthToString(DayDate.Month.DECEMBER, true));

        try {
            DayDate.Month.make(-1);
            fail("Invalid month code should throw exception");
        } catch (IllegalArgumentException e) {
        }

    }

    public void testStringToMonth() throws Exception {
        assertEquals(DayDate.Month.JANUARY, DayDate.stringToMonth("1"));
        assertEquals(DayDate.Month.FEBRUARY, DayDate.stringToMonth("2"));
        assertEquals(DayDate.Month.MARCH, DayDate.stringToMonth("3"));
        assertEquals(DayDate.Month.APRIL, DayDate.stringToMonth("4"));
        assertEquals(DayDate.Month.MAY, DayDate.stringToMonth("5"));
        assertEquals(DayDate.Month.JUNE, DayDate.stringToMonth("6"));
        assertEquals(DayDate.Month.JULY, DayDate.stringToMonth("7"));
        assertEquals(DayDate.Month.AUGUST, DayDate.stringToMonth("8"));
        assertEquals(DayDate.Month.SEPTEMBER, DayDate.stringToMonth("9"));
        assertEquals(DayDate.Month.OCTOBER, DayDate.stringToMonth("10"));
        assertEquals(DayDate.Month.NOVEMBER, DayDate.stringToMonth("11"));
        assertEquals(DayDate.Month.DECEMBER, DayDate.stringToMonth("12"));

        try {
            DayDate.stringToMonth("0");
            fail("Invalid month code should throw exception");
        } catch (IllegalArgumentException e) {
        }

        try {
            DayDate.stringToMonth("13");
            fail("Invalid month code should throw exception");
        } catch (IllegalArgumentException e) {
        }

        try {
            DayDate.stringToMonth("Hello");
            fail("Invalid month code should throw exception");
        } catch (IllegalArgumentException e) {
        }

        for (DayDate.Month m : DayDate.Month.values()) {
            assertEquals(m, DayDate.stringToMonth(DayDate.monthToString(m, false)));
            assertEquals(m, DayDate.stringToMonth(DayDate.monthToString(m, true)));
        }

        assertEquals(DayDate.Month.JANUARY,DayDate.stringToMonth("jan"));
        assertEquals(DayDate.Month.FEBRUARY,DayDate.stringToMonth("feb"));
        assertEquals(DayDate.Month.MARCH,DayDate.stringToMonth("mar"));
        assertEquals(DayDate.Month.APRIL,DayDate.stringToMonth("apr"));
        assertEquals(DayDate.Month.MAY,DayDate.stringToMonth("may"));
        assertEquals(DayDate.Month.JUNE,DayDate.stringToMonth("jun"));
        assertEquals(DayDate.Month.JULY,DayDate.stringToMonth("jul"));
        assertEquals(DayDate.Month.AUGUST,DayDate.stringToMonth("aug"));
        assertEquals(DayDate.Month.SEPTEMBER,DayDate.stringToMonth("sep"));
        assertEquals(DayDate.Month.OCTOBER,DayDate.stringToMonth("oct"));
        assertEquals(DayDate.Month.NOVEMBER,DayDate.stringToMonth("nov"));
        assertEquals(DayDate.Month.DECEMBER,DayDate.stringToMonth("dec"));

        assertEquals(DayDate.Month.JANUARY,DayDate.stringToMonth("JAN"));
        assertEquals(DayDate.Month.FEBRUARY,DayDate.stringToMonth("FEB"));
        assertEquals(DayDate.Month.MARCH,DayDate.stringToMonth("MAR"));
        assertEquals(DayDate.Month.APRIL,DayDate.stringToMonth("APR"));
        assertEquals(DayDate.Month.MAY,DayDate.stringToMonth("MAY"));
        assertEquals(DayDate.Month.JUNE,DayDate.stringToMonth("JUN"));
        assertEquals(DayDate.Month.JULY,DayDate.stringToMonth("JUL"));
        assertEquals(DayDate.Month.AUGUST,DayDate.stringToMonth("AUG"));
        assertEquals(DayDate.Month.SEPTEMBER,DayDate.stringToMonth("SEP"));
        assertEquals(DayDate.Month.OCTOBER,DayDate.stringToMonth("OCT"));
        assertEquals(DayDate.Month.NOVEMBER,DayDate.stringToMonth("NOV"));
        assertEquals(DayDate.Month.DECEMBER,DayDate.stringToMonth("DEC"));

        assertEquals(DayDate.Month.JANUARY,DayDate.stringToMonth("january"));
        assertEquals(DayDate.Month.FEBRUARY,DayDate.stringToMonth("february"));
        assertEquals(DayDate.Month.MARCH,DayDate.stringToMonth("march"));
        assertEquals(DayDate.Month.APRIL,DayDate.stringToMonth("april"));
        assertEquals(DayDate.Month.MAY,DayDate.stringToMonth("may"));
        assertEquals(DayDate.Month.JUNE,DayDate.stringToMonth("june"));
        assertEquals(DayDate.Month.JULY,DayDate.stringToMonth("july"));
        assertEquals(DayDate.Month.AUGUST,DayDate.stringToMonth("august"));
        assertEquals(DayDate.Month.SEPTEMBER,DayDate.stringToMonth("september"));
        assertEquals(DayDate.Month.OCTOBER,DayDate.stringToMonth("october"));
        assertEquals(DayDate.Month.NOVEMBER,DayDate.stringToMonth("november"));
        assertEquals(DayDate.Month.DECEMBER,DayDate.stringToMonth("december"));

        assertEquals(DayDate.Month.JANUARY,DayDate.stringToMonth("JANUARY"));
        assertEquals(DayDate.Month.FEBRUARY,DayDate.stringToMonth("FEBRUARY"));
        assertEquals(DayDate.Month.MARCH,DayDate.stringToMonth("MAR"));
        assertEquals(DayDate.Month.APRIL,DayDate.stringToMonth("APRIL"));
        assertEquals(DayDate.Month.MAY,DayDate.stringToMonth("MAY"));
        assertEquals(DayDate.Month.JUNE,DayDate.stringToMonth("JUNE"));
        assertEquals(DayDate.Month.JULY,DayDate.stringToMonth("JULY"));
        assertEquals(DayDate.Month.AUGUST,DayDate.stringToMonth("AUGUST"));
        assertEquals(DayDate.Month.SEPTEMBER,DayDate.stringToMonth("SEPTEMBER"));
        assertEquals(DayDate.Month.OCTOBER,DayDate.stringToMonth("OCTOBER"));
        assertEquals(DayDate.Month.NOVEMBER,DayDate.stringToMonth("NOVEMBER"));
        assertEquals(DayDate.Month.DECEMBER,DayDate.stringToMonth("DECEMBER"));
    }

    public void testIsLeapYear() throws Exception {
        assertFalse(DayDate.isLeapYear(1900));
        assertFalse(DayDate.isLeapYear(1901));
        assertFalse(DayDate.isLeapYear(1902));
        assertFalse(DayDate.isLeapYear(1903));
        assertTrue(DayDate.isLeapYear(1904));
        assertTrue(DayDate.isLeapYear(1908));
        assertFalse(DayDate.isLeapYear(1955));
        assertTrue(DayDate.isLeapYear(1964));
        assertTrue(DayDate.isLeapYear(1980));
        assertTrue(DayDate.isLeapYear(2000));
        assertFalse(DayDate.isLeapYear(2001));
        assertFalse(DayDate.isLeapYear(2100));
    }

    public void testLeapYearCount() throws Exception {
        assertEquals(0, DayDate.leapYearCount(1900));
        assertEquals(0, DayDate.leapYearCount(1901));
        assertEquals(0, DayDate.leapYearCount(1902));
        assertEquals(0, DayDate.leapYearCount(1903));
        assertEquals(1, DayDate.leapYearCount(1904));
        assertEquals(1, DayDate.leapYearCount(1905));
        assertEquals(1, DayDate.leapYearCount(1906));
        assertEquals(1, DayDate.leapYearCount(1907));
        assertEquals(2, DayDate.leapYearCount(1908));
        assertEquals(24, DayDate.leapYearCount(1999));
        assertEquals(25, DayDate.leapYearCount(2001));
        assertEquals(49, DayDate.leapYearCount(2101));
        assertEquals(73, DayDate.leapYearCount(2201));
        assertEquals(97, DayDate.leapYearCount(2301));
        assertEquals(122, DayDate.leapYearCount(2401));
    }

    public void testLastDayOfMonth() throws Exception {
        assertEquals(31, DayDate.lastDayOfMonth(DayDate.Month.JANUARY, 1901));
        assertEquals(28, DayDate.lastDayOfMonth(DayDate.Month.FEBRUARY, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(DayDate.Month.MARCH, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(DayDate.Month.APRIL, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(DayDate.Month.MAY, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(DayDate.Month.JUNE, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(DayDate.Month.JULY, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(DayDate.Month.AUGUST, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(DayDate.Month.SEPTEMBER, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(DayDate.Month.OCTOBER, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(DayDate.Month.NOVEMBER, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(DayDate.Month.DECEMBER, 1901));
        assertEquals(29, DayDate.lastDayOfMonth(DayDate.Month.FEBRUARY, 1904));
    }

    public void testAddDays() throws Exception {
        DayDate newYears = d(1, DayDate.Month.JANUARY, 1900);
        assertEquals(d(2, DayDate.Month.JANUARY, 1900), DayDate.addDays(1, newYears));
        assertEquals(d(1, DayDate.Month.FEBRUARY, 1900), DayDate.addDays(31, newYears));
        assertEquals(d(1, DayDate.Month.JANUARY, 1901), DayDate.addDays(365, newYears));
        assertEquals(d(31, DayDate.Month.DECEMBER, 1904), DayDate.addDays(5 * 365, newYears));
    }

    private static SpreadsheetDate d(int day, DayDate.Month month, int year) {
        return new SpreadsheetDate(day, month, year);
    }

    public void testAddMonths() throws Exception {
        assertEquals(d(1, DayDate.Month.FEBRUARY, 1900), DayDate.addMonths(1, d(1, DayDate.Month.JANUARY, 1900)));
        assertEquals(d(28, DayDate.Month.FEBRUARY, 1900), DayDate.addMonths(1, d(31, DayDate.Month.JANUARY, 1900)));
        assertEquals(d(28, DayDate.Month.FEBRUARY, 1900), DayDate.addMonths(1, d(30, DayDate.Month.JANUARY, 1900)));
        assertEquals(d(28, DayDate.Month.FEBRUARY, 1900), DayDate.addMonths(1, d(29, DayDate.Month.JANUARY, 1900)));
        assertEquals(d(28, DayDate.Month.FEBRUARY, 1900), DayDate.addMonths(1, d(28, DayDate.Month.JANUARY, 1900)));
        assertEquals(d(27, DayDate.Month.FEBRUARY, 1900), DayDate.addMonths(1, d(27, DayDate.Month.JANUARY, 1900)));

        assertEquals(d(30, DayDate.Month.JUNE, 1900), DayDate.addMonths(5, d(31, DayDate.Month.JANUARY, 1900)));
        assertEquals(d(30, DayDate.Month.JUNE, 1901), DayDate.addMonths(17, d(31, DayDate.Month.JANUARY, 1900)));

        assertEquals(d(29, DayDate.Month.FEBRUARY, 1904), DayDate.addMonths(49, d(31, DayDate.Month.JANUARY, 1900)));

    }

    public void testAddYears() throws Exception {
        assertEquals(d(1, DayDate.Month.JANUARY, 1901), DayDate.addYears(1, d(1, DayDate.Month.JANUARY, 1900)));
        assertEquals(d(28, DayDate.Month.FEBRUARY, 1905), DayDate.addYears(1, d(29, DayDate.Month.FEBRUARY, 1904)));
        assertEquals(d(28, DayDate.Month.FEBRUARY, 1905), DayDate.addYears(1, d(28, DayDate.Month.FEBRUARY, 1904)));
        assertEquals(d(28, DayDate.Month.FEBRUARY, 1904), DayDate.addYears(1, d(28, DayDate.Month.FEBRUARY, 1903)));
    }

    public void testGetPreviousDayOfWeek() throws Exception {
        assertEquals(d(24, DayDate.Month.FEBRUARY, 2006), DayDate.getPreviousDayOfWeek(Day.FRIDAY, d(1, DayDate.Month.MARCH, 2006)));
        assertEquals(d(22, DayDate.Month.FEBRUARY, 2006), DayDate.getPreviousDayOfWeek(Day.WEDNESDAY, d(1, DayDate.Month.MARCH, 2006)));
        assertEquals(d(29, DayDate.Month.FEBRUARY, 2004), DayDate.getPreviousDayOfWeek(Day.SUNDAY, d(3, DayDate.Month.MARCH, 2004)));
        assertEquals(d(29, DayDate.Month.DECEMBER, 2004), DayDate.getPreviousDayOfWeek(Day.WEDNESDAY, d(5, DayDate.Month.JANUARY, 2005)));
    }

    public void testGetFollowingDayOfWeek() throws Exception {
        assertEquals(d(1, DayDate.Month.JANUARY, 2005),DayDate.getFollowingDayOfWeek(Day.SATURDAY, d(25,DayDate.Month.DECEMBER, 2004)));
        assertEquals(d(1, DayDate.Month.JANUARY, 2005), DayDate.getFollowingDayOfWeek(Day.SATURDAY, d(26, DayDate.Month.DECEMBER, 2004)));
        assertEquals(d(3, DayDate.Month.MARCH, 2004), DayDate.getFollowingDayOfWeek(Day.WEDNESDAY, d(28, DayDate.Month.FEBRUARY, 2004)));
    }

    public void testGetNearestDayOfWeek() throws Exception {
        assertEquals(d(16, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(16, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(16, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(16, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(23, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(23, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(23, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(16,DayDate.Month.APRIL, 2006)));
        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(24, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(24, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(16, DayDate.Month.APRIL,2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(17, DayDate.Month.APRIL,2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(25, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(13, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(14, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(14, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(15, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(15, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(15, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(22, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(22, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(22, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(22, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(22, DayDate.Month.APRIL, 2006)));
    }

    public void testEndOfCurrentMonth() throws Exception {
        DayDate d = DayDateFactory.makeDate(2);
        assertEquals(d(31, DayDate.Month.JANUARY, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.JANUARY, 2006)));
        assertEquals(d(28, DayDate.Month.FEBRUARY, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.FEBRUARY, 2006)));
        assertEquals(d(31, DayDate.Month.MARCH, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.MARCH, 2006)));
        assertEquals(d(30, DayDate.Month.APRIL, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.APRIL, 2006)));
        assertEquals(d(31, DayDate.Month.MAY, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.MAY, 2006)));
        assertEquals(d(30, DayDate.Month.JUNE, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.JUNE, 2006)));
        assertEquals(d(31, DayDate.Month.JULY, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.JULY, 2006)));
        assertEquals(d(31, DayDate.Month.AUGUST, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.AUGUST, 2006)));
        assertEquals(d(30, DayDate.Month.SEPTEMBER, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.SEPTEMBER, 2006)));
        assertEquals(d(31, DayDate.Month.OCTOBER, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.OCTOBER, 2006)));
        assertEquals(d(30, DayDate.Month.NOVEMBER, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.NOVEMBER, 2006)));
        assertEquals(d(31, DayDate.Month.DECEMBER, 2006), d.getEndOfCurrentMonth(d(1, DayDate.Month.DECEMBER, 2006)));
        assertEquals(d(29, DayDate.Month.FEBRUARY, 2008), d.getEndOfCurrentMonth(d(1, DayDate.Month.FEBRUARY, 2008)));
    }

    public void testWeekInMonthToString() throws Exception {
        assertEquals("First", DayDate.weekInMonthToString(WeekInMonth.FIRST));
        assertEquals("Second", DayDate.weekInMonthToString(WeekInMonth.SECOND));
        assertEquals("Third", DayDate.weekInMonthToString(WeekInMonth.THIRD));
        assertEquals("Fourth", DayDate.weekInMonthToString(WeekInMonth.FOURTH));
        assertEquals("Last", DayDate.weekInMonthToString(WeekInMonth.LAST));
    }

    public void testRelativeToString() throws Exception {
        assertEquals("Preceding", DayDate.relativeToString( WeekdayRange.LAST));
        assertEquals("Nearest", DayDate.relativeToString( WeekdayRange.NEAREST));
        assertEquals("Following", DayDate.relativeToString( WeekdayRange.NEXT));
    }

}
