package org.jfree.date;

import junit.framework.TestCase;


public class BobsSerialDateTest extends TestCase {
    public void testIsValidWeekdayCode() throws Exception {
        
        assertEquals( Day.SUNDAY, Day.fromInt(1));
        assertEquals( Day.MONDAY, Day.fromInt(2));
        assertEquals( Day.TUESDAY, Day.fromInt(3));
        assertEquals( Day.WEDNESDAY, Day.fromInt(4));
        assertEquals( Day.THURSDAY, Day.fromInt(5));
        assertEquals( Day.FRIDAY, Day.fromInt(6));
        assertEquals( Day.SATURDAY, Day.fromInt(7));

        try {
            Day.fromInt(-1);
            fail("Invalid Day Code should throw exception");
        } catch (IllegalArgumentException e) {
        }
        try {
            Day.fromInt(0);
            fail("Invalid Day Code should throw exception");
        } catch (IllegalArgumentException e) {
        }
        try {
            Day.fromInt(8);
            fail("Invalid Day Code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testStringToWeekdayCode() throws Exception {

        assertEquals(-1, DayDate.stringToWeekdayCode("Hello"));
        assertEquals(Day.MONDAY.toInt(), DayDate.stringToWeekdayCode("Monday"));
        assertEquals(Day.MONDAY.toInt(), DayDate.stringToWeekdayCode("Mon"));
        assertEquals(Day.MONDAY.toInt(),DayDate.stringToWeekdayCode("monday"));
        assertEquals(Day.MONDAY.toInt(),DayDate.stringToWeekdayCode("MONDAY"));
        assertEquals(Day.MONDAY.toInt(), DayDate.stringToWeekdayCode("mon"));

        assertEquals(Day.TUESDAY.toInt(), DayDate.stringToWeekdayCode("Tuesday"));
        assertEquals(Day.TUESDAY.toInt(), DayDate.stringToWeekdayCode("Tue"));
        assertEquals(Day.TUESDAY.toInt(),DayDate.stringToWeekdayCode("tuesday"));
        assertEquals(Day.TUESDAY.toInt(),DayDate.stringToWeekdayCode("TUESDAY"));
        assertEquals(Day.TUESDAY.toInt(), DayDate.stringToWeekdayCode("tue"));
        //assertEquals(SerialDate.TUESDAY, SerialDate.stringToWeekdayCode("tues"));

        assertEquals(Day.WEDNESDAY.toInt(), DayDate.stringToWeekdayCode("Wednesday"));
        assertEquals(Day.WEDNESDAY.toInt(), DayDate.stringToWeekdayCode("Wed"));
        assertEquals(Day.WEDNESDAY.toInt(),DayDate.stringToWeekdayCode("wednesday"));
        assertEquals(Day.WEDNESDAY.toInt(),DayDate.stringToWeekdayCode("WEDNESDAY"));
        assertEquals(Day.WEDNESDAY.toInt(), DayDate.stringToWeekdayCode("wed"));

        assertEquals(Day.THURSDAY.toInt(), DayDate.stringToWeekdayCode("Thursday"));
        assertEquals(Day.THURSDAY.toInt(), DayDate.stringToWeekdayCode("Thu"));
        assertEquals(Day.THURSDAY.toInt(),DayDate.stringToWeekdayCode("thursday"));
        assertEquals(Day.THURSDAY.toInt(),DayDate.stringToWeekdayCode("THURSDAY"));
        assertEquals(Day.THURSDAY.toInt(), DayDate.stringToWeekdayCode("thu"));
        //assertEquals(SerialDate.THURSDAY, SerialDate.stringToWeekdayCode("thurs"));

        assertEquals(Day.FRIDAY.toInt(), DayDate.stringToWeekdayCode("Friday"));
        assertEquals(Day.FRIDAY.toInt(), DayDate.stringToWeekdayCode("Fri"));
        assertEquals(Day.FRIDAY.toInt(),DayDate.stringToWeekdayCode("friday"));
        assertEquals(Day.FRIDAY.toInt(),DayDate.stringToWeekdayCode("FRIDAY"));
        assertEquals(Day.FRIDAY.toInt(), DayDate.stringToWeekdayCode("fri"));

        assertEquals(Day.SATURDAY.toInt(), DayDate.stringToWeekdayCode("Saturday"));
        assertEquals(Day.SATURDAY.toInt(), DayDate.stringToWeekdayCode("Sat"));
        assertEquals(Day.SATURDAY.toInt(),DayDate.stringToWeekdayCode("saturday"));
        assertEquals(Day.SATURDAY.toInt(),DayDate.stringToWeekdayCode("SATURDAY"));
        assertEquals(Day.SATURDAY.toInt(), DayDate.stringToWeekdayCode("sat"));

        assertEquals(Day.SUNDAY.toInt(), DayDate.stringToWeekdayCode("Sunday"));
        assertEquals(Day.SUNDAY.toInt(), DayDate.stringToWeekdayCode("Sun"));
        assertEquals(Day.SUNDAY.toInt(),DayDate.stringToWeekdayCode("sunday"));
        assertEquals(Day.SUNDAY.toInt(),DayDate.stringToWeekdayCode("SUNDAY"));
        assertEquals(Day.SUNDAY.toInt(), DayDate.stringToWeekdayCode("sun"));
    }

    public void testWeekdayCodeToString() throws Exception {
        assertEquals("Sunday", DayDate.weekdayCodeToString(Day.SUNDAY));
        assertEquals("Monday", DayDate.weekdayCodeToString(Day.MONDAY));
        assertEquals("Tuesday", DayDate.weekdayCodeToString(Day.TUESDAY));
        assertEquals("Wednesday", DayDate.weekdayCodeToString(Day.WEDNESDAY));
        assertEquals("Thursday", DayDate.weekdayCodeToString(Day.THURSDAY));
        assertEquals("Friday", DayDate.weekdayCodeToString(Day.FRIDAY));
        assertEquals("Saturday", DayDate.weekdayCodeToString(Day.SATURDAY));
    }

    public void testMonthToQuarter() throws Exception {
        assertEquals(1, DayDate.monthCodeToQuarter(DayDate.Month.JANUARY));
        assertEquals(1, DayDate.monthCodeToQuarter(DayDate.Month.FEBRUARY));
        assertEquals(1, DayDate.monthCodeToQuarter(DayDate.Month.MARCH));
        assertEquals(2, DayDate.monthCodeToQuarter(DayDate.Month.APRIL));
        assertEquals(2, DayDate.monthCodeToQuarter(DayDate.Month.MAY));
        assertEquals(2, DayDate.monthCodeToQuarter(DayDate.Month.JUNE));
        assertEquals(3, DayDate.monthCodeToQuarter(DayDate.Month.JULY));
        assertEquals(3, DayDate.monthCodeToQuarter(DayDate.Month.AUGUST));
        assertEquals(3, DayDate.monthCodeToQuarter(DayDate.Month.SEPTEMBER));
        assertEquals(4, DayDate.monthCodeToQuarter(DayDate.Month.OCTOBER));
        assertEquals(4, DayDate.monthCodeToQuarter(DayDate.Month.NOVEMBER));
        assertEquals(4, DayDate.monthCodeToQuarter(DayDate.Month.DECEMBER));

        try {
            DayDate.Month.make(-1);
            fail("Invalid Month Code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testMonthCodeToString() throws Exception {
        assertEquals("January", DayDate.monthCodeToString(DayDate.Month.JANUARY));
        assertEquals("February", DayDate.monthCodeToString(DayDate.Month.FEBRUARY));
        assertEquals("March", DayDate.monthCodeToString(DayDate.Month.MARCH));
        assertEquals("April", DayDate.monthCodeToString(DayDate.Month.APRIL));
        assertEquals("May", DayDate.monthCodeToString(DayDate.Month.MAY));
        assertEquals("June", DayDate.monthCodeToString(DayDate.Month.JUNE));
        assertEquals("July", DayDate.monthCodeToString(DayDate.Month.JULY));
        assertEquals("August", DayDate.monthCodeToString(DayDate.Month.AUGUST));
        assertEquals("September", DayDate.monthCodeToString(DayDate.Month.SEPTEMBER));
        assertEquals("October", DayDate.monthCodeToString(DayDate.Month.OCTOBER));
        assertEquals("November", DayDate.monthCodeToString(DayDate.Month.NOVEMBER));
        assertEquals("December", DayDate.monthCodeToString(DayDate.Month.DECEMBER));

        assertEquals("Jan", DayDate.monthCodeToString(DayDate.Month.JANUARY, true));
        assertEquals("Feb", DayDate.monthCodeToString(DayDate.Month.FEBRUARY, true));
        assertEquals("Mar", DayDate.monthCodeToString(DayDate.Month.MARCH, true));
        assertEquals("Apr", DayDate.monthCodeToString(DayDate.Month.APRIL, true));
        assertEquals("May", DayDate.monthCodeToString(DayDate.Month.MAY, true));
        assertEquals("Jun", DayDate.monthCodeToString(DayDate.Month.JUNE, true));
        assertEquals("Jul", DayDate.monthCodeToString(DayDate.Month.JULY, true));
        assertEquals("Aug", DayDate.monthCodeToString(DayDate.Month.AUGUST, true));
        assertEquals("Sep", DayDate.monthCodeToString(DayDate.Month.SEPTEMBER, true));
        assertEquals("Oct", DayDate.monthCodeToString(DayDate.Month.OCTOBER, true));
        assertEquals("Nov", DayDate.monthCodeToString(DayDate.Month.NOVEMBER, true));
        assertEquals("Dec", DayDate.monthCodeToString(DayDate.Month.DECEMBER, true));

        try {
            DayDate.Month.make(-1);
            fail("Invalid month code should throw exception");
        } catch (IllegalArgumentException e) {
        }

    }

    public void testStringToMonthCode() throws Exception {
        assertEquals(DayDate.Month.JANUARY.index, DayDate.stringToMonthCode("1"));
        assertEquals(DayDate.Month.FEBRUARY.index, DayDate.stringToMonthCode("2"));
        assertEquals(DayDate.Month.MARCH.index, DayDate.stringToMonthCode("3"));
        assertEquals(DayDate.Month.APRIL.index, DayDate.stringToMonthCode("4"));
        assertEquals(DayDate.Month.MAY.index, DayDate.stringToMonthCode("5"));
        assertEquals(DayDate.Month.JUNE.index, DayDate.stringToMonthCode("6"));
        assertEquals(DayDate.Month.JULY.index, DayDate.stringToMonthCode("7"));
        assertEquals(DayDate.Month.AUGUST.index, DayDate.stringToMonthCode("8"));
        assertEquals(DayDate.Month.SEPTEMBER.index, DayDate.stringToMonthCode("9"));
        assertEquals(DayDate.Month.OCTOBER.index, DayDate.stringToMonthCode("10"));
        assertEquals(DayDate.Month.NOVEMBER.index, DayDate.stringToMonthCode("11"));
        assertEquals(DayDate.Month.DECEMBER.index, DayDate.stringToMonthCode("12"));

        assertEquals(-1, DayDate.stringToMonthCode("0"));
        assertEquals(-1, DayDate.stringToMonthCode("13"));

        assertEquals(-1, DayDate.stringToMonthCode("Hello"));

        for (DayDate.Month m : DayDate.Month.values()) {
            assertEquals(m.index, DayDate.stringToMonthCode(DayDate.monthCodeToString(m, false)));
            assertEquals(m.index, DayDate.stringToMonthCode(DayDate.monthCodeToString(m, true)));
        }

        assertEquals(1,DayDate.stringToMonthCode("jan"));
        assertEquals(2,DayDate.stringToMonthCode("feb"));
        assertEquals(3,DayDate.stringToMonthCode("mar"));
        assertEquals(4,DayDate.stringToMonthCode("apr"));
        assertEquals(5,DayDate.stringToMonthCode("may"));
        assertEquals(6,DayDate.stringToMonthCode("jun"));
        assertEquals(7,DayDate.stringToMonthCode("jul"));
        assertEquals(8,DayDate.stringToMonthCode("aug"));
        assertEquals(9,DayDate.stringToMonthCode("sep"));
        assertEquals(10,DayDate.stringToMonthCode("oct"));
        assertEquals(11,DayDate.stringToMonthCode("nov"));
        assertEquals(12,DayDate.stringToMonthCode("dec"));

        assertEquals(1,DayDate.stringToMonthCode("JAN"));
        assertEquals(2,DayDate.stringToMonthCode("FEB"));
        assertEquals(3,DayDate.stringToMonthCode("MAR"));
        assertEquals(4,DayDate.stringToMonthCode("APR"));
        assertEquals(5,DayDate.stringToMonthCode("MAY"));
        assertEquals(6,DayDate.stringToMonthCode("JUN"));
        assertEquals(7,DayDate.stringToMonthCode("JUL"));
        assertEquals(8,DayDate.stringToMonthCode("AUG"));
        assertEquals(9,DayDate.stringToMonthCode("SEP"));
        assertEquals(10,DayDate.stringToMonthCode("OCT"));
        assertEquals(11,DayDate.stringToMonthCode("NOV"));
        assertEquals(12,DayDate.stringToMonthCode("DEC"));

        assertEquals(1,DayDate.stringToMonthCode("january"));
        assertEquals(2,DayDate.stringToMonthCode("february"));
        assertEquals(3,DayDate.stringToMonthCode("march"));
        assertEquals(4,DayDate.stringToMonthCode("april"));
        assertEquals(5,DayDate.stringToMonthCode("may"));
        assertEquals(6,DayDate.stringToMonthCode("june"));
        assertEquals(7,DayDate.stringToMonthCode("july"));
        assertEquals(8,DayDate.stringToMonthCode("august"));
        assertEquals(9,DayDate.stringToMonthCode("september"));
        assertEquals(10,DayDate.stringToMonthCode("october"));
        assertEquals(11,DayDate.stringToMonthCode("november"));
        assertEquals(12,DayDate.stringToMonthCode("december"));

        assertEquals(1,DayDate.stringToMonthCode("JANUARY"));
        assertEquals(2,DayDate.stringToMonthCode("FEBRUARY"));
        assertEquals(3,DayDate.stringToMonthCode("MAR"));
        assertEquals(4,DayDate.stringToMonthCode("APRIL"));
        assertEquals(5,DayDate.stringToMonthCode("MAY"));
        assertEquals(6,DayDate.stringToMonthCode("JUNE"));
        assertEquals(7,DayDate.stringToMonthCode("JULY"));
        assertEquals(8,DayDate.stringToMonthCode("AUGUST"));
        assertEquals(9,DayDate.stringToMonthCode("SEPTEMBER"));
        assertEquals(10,DayDate.stringToMonthCode("OCTOBER"));
        assertEquals(11,DayDate.stringToMonthCode("NOVEMBER"));
        assertEquals(12,DayDate.stringToMonthCode("DECEMBER"));
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
        assertEquals("Preceding", DayDate.relativeToString(DayDate.PRECEDING));
        assertEquals("Nearest", DayDate.relativeToString(DayDate.NEAREST));
        assertEquals("Following", DayDate.relativeToString(DayDate.FOLLOWING));

        try {
            DayDate.relativeToString(-1000);
            fail("Invalid relative code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

}
