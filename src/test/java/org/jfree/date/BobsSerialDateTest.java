package org.jfree.date;

import junit.framework.TestCase;


public class BobsSerialDateTest extends TestCase {
    public void testIsValidWeekdayCode() throws Exception {
        for (int day = 1; day <= 7; day++)
            assertTrue(DayDate.isValidWeekdayCode(day));
        assertFalse(DayDate.isValidWeekdayCode(0));
        assertFalse(DayDate.isValidWeekdayCode(8));
    }

    public void testStringToWeekdayCode() throws Exception {

        assertEquals(-1, DayDate.stringToWeekdayCode("Hello"));
        assertEquals(DayDate.MONDAY, DayDate.stringToWeekdayCode("Monday"));
        assertEquals(DayDate.MONDAY, DayDate.stringToWeekdayCode("Mon"));
        assertEquals(DayDate.MONDAY,DayDate.stringToWeekdayCode("monday"));
        assertEquals(DayDate.MONDAY,DayDate.stringToWeekdayCode("MONDAY"));
        assertEquals(DayDate.MONDAY, DayDate.stringToWeekdayCode("mon"));

        assertEquals(DayDate.TUESDAY, DayDate.stringToWeekdayCode("Tuesday"));
        assertEquals(DayDate.TUESDAY, DayDate.stringToWeekdayCode("Tue"));
        assertEquals(DayDate.TUESDAY,DayDate.stringToWeekdayCode("tuesday"));
        assertEquals(DayDate.TUESDAY,DayDate.stringToWeekdayCode("TUESDAY"));
        assertEquals(DayDate.TUESDAY, DayDate.stringToWeekdayCode("tue"));
        //assertEquals(SerialDate.TUESDAY, SerialDate.stringToWeekdayCode("tues"));

        assertEquals(DayDate.WEDNESDAY, DayDate.stringToWeekdayCode("Wednesday"));
        assertEquals(DayDate.WEDNESDAY, DayDate.stringToWeekdayCode("Wed"));
        assertEquals(DayDate.WEDNESDAY,DayDate.stringToWeekdayCode("wednesday"));
        assertEquals(DayDate.WEDNESDAY,DayDate.stringToWeekdayCode("WEDNESDAY"));
        assertEquals(DayDate.WEDNESDAY, DayDate.stringToWeekdayCode("wed"));

        assertEquals(DayDate.THURSDAY, DayDate.stringToWeekdayCode("Thursday"));
        assertEquals(DayDate.THURSDAY, DayDate.stringToWeekdayCode("Thu"));
        assertEquals(DayDate.THURSDAY,DayDate.stringToWeekdayCode("thursday"));
        assertEquals(DayDate.THURSDAY,DayDate.stringToWeekdayCode("THURSDAY"));
        assertEquals(DayDate.THURSDAY, DayDate.stringToWeekdayCode("thu"));
        //assertEquals(SerialDate.THURSDAY, SerialDate.stringToWeekdayCode("thurs"));

        assertEquals(DayDate.FRIDAY, DayDate.stringToWeekdayCode("Friday"));
        assertEquals(DayDate.FRIDAY, DayDate.stringToWeekdayCode("Fri"));
        assertEquals(DayDate.FRIDAY,DayDate.stringToWeekdayCode("friday"));
        assertEquals(DayDate.FRIDAY,DayDate.stringToWeekdayCode("FRIDAY"));
        assertEquals(DayDate.FRIDAY, DayDate.stringToWeekdayCode("fri"));

        assertEquals(DayDate.SATURDAY, DayDate.stringToWeekdayCode("Saturday"));
        assertEquals(DayDate.SATURDAY, DayDate.stringToWeekdayCode("Sat"));
        assertEquals(DayDate.SATURDAY,DayDate.stringToWeekdayCode("saturday"));
        assertEquals(DayDate.SATURDAY,DayDate.stringToWeekdayCode("SATURDAY"));
        assertEquals(DayDate.SATURDAY, DayDate.stringToWeekdayCode("sat"));

        assertEquals(DayDate.SUNDAY, DayDate.stringToWeekdayCode("Sunday"));
        assertEquals(DayDate.SUNDAY, DayDate.stringToWeekdayCode("Sun"));
        assertEquals(DayDate.SUNDAY,DayDate.stringToWeekdayCode("sunday"));
        assertEquals(DayDate.SUNDAY,DayDate.stringToWeekdayCode("SUNDAY"));
        assertEquals(DayDate.SUNDAY, DayDate.stringToWeekdayCode("sun"));
    }

    public void testWeekdayCodeToString() throws Exception {
        assertEquals("Sunday", DayDate.weekdayCodeToString(DayDate.SUNDAY));
        assertEquals("Monday", DayDate.weekdayCodeToString(DayDate.MONDAY));
        assertEquals("Tuesday", DayDate.weekdayCodeToString(DayDate.TUESDAY));
        assertEquals("Wednesday", DayDate.weekdayCodeToString(DayDate.WEDNESDAY));
        assertEquals("Thursday", DayDate.weekdayCodeToString(DayDate.THURSDAY));
        assertEquals("Friday", DayDate.weekdayCodeToString(DayDate.FRIDAY));
        assertEquals("Saturday", DayDate.weekdayCodeToString(DayDate.SATURDAY));
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

    public void testIsValidWeekInMonthCode() throws Exception {
        for (int w = 1; w <= 4; w++) {
            assertTrue(DayDate.isValidWeekInMonthCode(DayDate.Month.make(w)));
        }
        assertFalse(DayDate.isValidWeekInMonthCode(DayDate.Month.make(5)));
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
        assertEquals(d(24, DayDate.Month.FEBRUARY, 2006), DayDate.getPreviousDayOfWeek(DayDate.FRIDAY, d(1, DayDate.Month.MARCH, 2006)));
        assertEquals(d(22, DayDate.Month.FEBRUARY, 2006), DayDate.getPreviousDayOfWeek(DayDate.WEDNESDAY, d(1, DayDate.Month.MARCH, 2006)));
        assertEquals(d(29, DayDate.Month.FEBRUARY, 2004), DayDate.getPreviousDayOfWeek(DayDate.SUNDAY, d(3, DayDate.Month.MARCH, 2004)));
        assertEquals(d(29, DayDate.Month.DECEMBER, 2004), DayDate.getPreviousDayOfWeek(DayDate.WEDNESDAY, d(5, DayDate.Month.JANUARY, 2005)));

        try {
            DayDate.getPreviousDayOfWeek(-1, d(1, DayDate.Month.JANUARY, 2006));
            fail("Invalid day of week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testGetFollowingDayOfWeek() throws Exception {
        assertEquals(d(1, DayDate.Month.JANUARY, 2005),DayDate.getFollowingDayOfWeek(DayDate.SATURDAY, d(25,DayDate.Month.DECEMBER, 2004)));
        assertEquals(d(1, DayDate.Month.JANUARY, 2005), DayDate.getFollowingDayOfWeek(DayDate.SATURDAY, d(26, DayDate.Month.DECEMBER, 2004)));
        assertEquals(d(3, DayDate.Month.MARCH, 2004), DayDate.getFollowingDayOfWeek(DayDate.WEDNESDAY, d(28, DayDate.Month.FEBRUARY, 2004)));

        try {
            DayDate.getFollowingDayOfWeek(-1, d(1, DayDate.Month.JANUARY, 2006));
            fail("Invalid day of week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testGetNearestDayOfWeek() throws Exception {
        assertEquals(d(16, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(16, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(16, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(16, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(23, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(23, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(23, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(16,DayDate.Month.APRIL, 2006)));
        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(17, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(24, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(24, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(16, DayDate.Month.APRIL,2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(17, DayDate.Month.APRIL,2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(18, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(25, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(19, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(13, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(20, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(14, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(14, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(21, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(22, DayDate.Month.APRIL, 2006)));

        assertEquals(d(15, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(16, DayDate.Month.APRIL, 2006)));
        assertEquals(d(15, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(17, DayDate.Month.APRIL, 2006)));
        assertEquals(d(15, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(18, DayDate.Month.APRIL, 2006)));
        assertEquals(d(22, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(19, DayDate.Month.APRIL, 2006)));
        assertEquals(d(22, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(20, DayDate.Month.APRIL, 2006)));
        assertEquals(d(22, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(21, DayDate.Month.APRIL, 2006)));
        assertEquals(d(22, DayDate.Month.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(22, DayDate.Month.APRIL, 2006)));

        try {
            DayDate.getNearestDayOfWeek(-1, d(1, DayDate.Month.JANUARY, 2006));
            fail("Invalid day of week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
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
        assertEquals("First", DayDate.weekInMonthToString(DayDate.FIRST_WEEK_IN_MONTH));
        assertEquals("Second", DayDate.weekInMonthToString(DayDate.SECOND_WEEK_IN_MONTH));
        assertEquals("Third", DayDate.weekInMonthToString(DayDate.THIRD_WEEK_IN_MONTH));
        assertEquals("Fourth", DayDate.weekInMonthToString(DayDate.FOURTH_WEEK_IN_MONTH));
        assertEquals("Last", DayDate.weekInMonthToString(DayDate.LAST_WEEK_IN_MONTH));

        try {
            DayDate.weekInMonthToString(-1);
            fail("Invalid week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
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
