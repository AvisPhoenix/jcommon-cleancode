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

    public void testIsValidMonthCode() throws Exception {
        for (int i = 1; i <= 12; i++)
            assertTrue(DayDate.isValidMonthCode(i));
        assertFalse(DayDate.isValidMonthCode(0));
        assertFalse(DayDate.isValidMonthCode(13));
    }

    public void testMonthToQuarter() throws Exception {
        assertEquals(1, DayDate.monthCodeToQuarter(MonthConstants.JANUARY));
        assertEquals(1, DayDate.monthCodeToQuarter(MonthConstants.FEBRUARY));
        assertEquals(1, DayDate.monthCodeToQuarter(MonthConstants.MARCH));
        assertEquals(2, DayDate.monthCodeToQuarter(MonthConstants.APRIL));
        assertEquals(2, DayDate.monthCodeToQuarter(MonthConstants.MAY));
        assertEquals(2, DayDate.monthCodeToQuarter(MonthConstants.JUNE));
        assertEquals(3, DayDate.monthCodeToQuarter(MonthConstants.JULY));
        assertEquals(3, DayDate.monthCodeToQuarter(MonthConstants.AUGUST));
        assertEquals(3, DayDate.monthCodeToQuarter(MonthConstants.SEPTEMBER));
        assertEquals(4, DayDate.monthCodeToQuarter(MonthConstants.OCTOBER));
        assertEquals(4, DayDate.monthCodeToQuarter(MonthConstants.NOVEMBER));
        assertEquals(4, DayDate.monthCodeToQuarter(MonthConstants.DECEMBER));

        try {
            DayDate.monthCodeToQuarter(-1);
            fail("Invalid Month Code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testMonthCodeToString() throws Exception {
        assertEquals("January", DayDate.monthCodeToString(MonthConstants.JANUARY));
        assertEquals("February", DayDate.monthCodeToString(MonthConstants.FEBRUARY));
        assertEquals("March", DayDate.monthCodeToString(MonthConstants.MARCH));
        assertEquals("April", DayDate.monthCodeToString(MonthConstants.APRIL));
        assertEquals("May", DayDate.monthCodeToString(MonthConstants.MAY));
        assertEquals("June", DayDate.monthCodeToString(MonthConstants.JUNE));
        assertEquals("July", DayDate.monthCodeToString(MonthConstants.JULY));
        assertEquals("August", DayDate.monthCodeToString(MonthConstants.AUGUST));
        assertEquals("September", DayDate.monthCodeToString(MonthConstants.SEPTEMBER));
        assertEquals("October", DayDate.monthCodeToString(MonthConstants.OCTOBER));
        assertEquals("November", DayDate.monthCodeToString(MonthConstants.NOVEMBER));
        assertEquals("December", DayDate.monthCodeToString(MonthConstants.DECEMBER));

        assertEquals("Jan", DayDate.monthCodeToString(MonthConstants.JANUARY, true));
        assertEquals("Feb", DayDate.monthCodeToString(MonthConstants.FEBRUARY, true));
        assertEquals("Mar", DayDate.monthCodeToString(MonthConstants.MARCH, true));
        assertEquals("Apr", DayDate.monthCodeToString(MonthConstants.APRIL, true));
        assertEquals("May", DayDate.monthCodeToString(MonthConstants.MAY, true));
        assertEquals("Jun", DayDate.monthCodeToString(MonthConstants.JUNE, true));
        assertEquals("Jul", DayDate.monthCodeToString(MonthConstants.JULY, true));
        assertEquals("Aug", DayDate.monthCodeToString(MonthConstants.AUGUST, true));
        assertEquals("Sep", DayDate.monthCodeToString(MonthConstants.SEPTEMBER, true));
        assertEquals("Oct", DayDate.monthCodeToString(MonthConstants.OCTOBER, true));
        assertEquals("Nov", DayDate.monthCodeToString(MonthConstants.NOVEMBER, true));
        assertEquals("Dec", DayDate.monthCodeToString(MonthConstants.DECEMBER, true));

        try {
            DayDate.monthCodeToString(-1);
            fail("Invalid month code should throw exception");
        } catch (IllegalArgumentException e) {
        }

    }

    public void testStringToMonthCode() throws Exception {
        assertEquals(MonthConstants.JANUARY, DayDate.stringToMonthCode("1"));
        assertEquals(MonthConstants.FEBRUARY, DayDate.stringToMonthCode("2"));
        assertEquals(MonthConstants.MARCH, DayDate.stringToMonthCode("3"));
        assertEquals(MonthConstants.APRIL, DayDate.stringToMonthCode("4"));
        assertEquals(MonthConstants.MAY, DayDate.stringToMonthCode("5"));
        assertEquals(MonthConstants.JUNE, DayDate.stringToMonthCode("6"));
        assertEquals(MonthConstants.JULY, DayDate.stringToMonthCode("7"));
        assertEquals(MonthConstants.AUGUST, DayDate.stringToMonthCode("8"));
        assertEquals(MonthConstants.SEPTEMBER, DayDate.stringToMonthCode("9"));
        assertEquals(MonthConstants.OCTOBER, DayDate.stringToMonthCode("10"));
        assertEquals(MonthConstants.NOVEMBER, DayDate.stringToMonthCode("11"));
        assertEquals(MonthConstants.DECEMBER, DayDate.stringToMonthCode("12"));

        assertEquals(-1, DayDate.stringToMonthCode("0"));
        assertEquals(-1, DayDate.stringToMonthCode("13"));

        assertEquals(-1, DayDate.stringToMonthCode("Hello"));

        for (int m = 1; m <= 12; m++) {
            assertEquals(m, DayDate.stringToMonthCode(DayDate.monthCodeToString(m, false)));
            assertEquals(m, DayDate.stringToMonthCode(DayDate.monthCodeToString(m, true)));
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
        for (int w = 0; w <= 4; w++) {
            assertTrue(DayDate.isValidWeekInMonthCode(w));
        }
        assertFalse(DayDate.isValidWeekInMonthCode(5));
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
        assertEquals(31, DayDate.lastDayOfMonth(MonthConstants.JANUARY, 1901));
        assertEquals(28, DayDate.lastDayOfMonth(MonthConstants.FEBRUARY, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(MonthConstants.MARCH, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(MonthConstants.APRIL, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(MonthConstants.MAY, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(MonthConstants.JUNE, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(MonthConstants.JULY, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(MonthConstants.AUGUST, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(MonthConstants.SEPTEMBER, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(MonthConstants.OCTOBER, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(MonthConstants.NOVEMBER, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(MonthConstants.DECEMBER, 1901));
        assertEquals(29, DayDate.lastDayOfMonth(MonthConstants.FEBRUARY, 1904));
    }

    public void testAddDays() throws Exception {
        DayDate newYears = d(1, MonthConstants.JANUARY, 1900);
        assertEquals(d(2, MonthConstants.JANUARY, 1900), DayDate.addDays(1, newYears));
        assertEquals(d(1, MonthConstants.FEBRUARY, 1900), DayDate.addDays(31, newYears));
        assertEquals(d(1, MonthConstants.JANUARY, 1901), DayDate.addDays(365, newYears));
        assertEquals(d(31, MonthConstants.DECEMBER, 1904), DayDate.addDays(5 * 365, newYears));
    }

    private static SpreadsheetDate d(int day, int month, int year) {
        return new SpreadsheetDate(day, month, year);
    }

    public void testAddMonths() throws Exception {
        assertEquals(d(1, MonthConstants.FEBRUARY, 1900), DayDate.addMonths(1, d(1, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1900), DayDate.addMonths(1, d(31, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1900), DayDate.addMonths(1, d(30, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1900), DayDate.addMonths(1, d(29, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1900), DayDate.addMonths(1, d(28, MonthConstants.JANUARY, 1900)));
        assertEquals(d(27, MonthConstants.FEBRUARY, 1900), DayDate.addMonths(1, d(27, MonthConstants.JANUARY, 1900)));

        assertEquals(d(30, MonthConstants.JUNE, 1900), DayDate.addMonths(5, d(31, MonthConstants.JANUARY, 1900)));
        assertEquals(d(30, MonthConstants.JUNE, 1901), DayDate.addMonths(17, d(31, MonthConstants.JANUARY, 1900)));

        assertEquals(d(29, MonthConstants.FEBRUARY, 1904), DayDate.addMonths(49, d(31, MonthConstants.JANUARY, 1900)));

    }

    public void testAddYears() throws Exception {
        assertEquals(d(1, MonthConstants.JANUARY, 1901), DayDate.addYears(1, d(1, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1905), DayDate.addYears(1, d(29, MonthConstants.FEBRUARY, 1904)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1905), DayDate.addYears(1, d(28, MonthConstants.FEBRUARY, 1904)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1904), DayDate.addYears(1, d(28, MonthConstants.FEBRUARY, 1903)));
    }

    public void testGetPreviousDayOfWeek() throws Exception {
        assertEquals(d(24, MonthConstants.FEBRUARY, 2006), DayDate.getPreviousDayOfWeek(DayDate.FRIDAY, d(1, MonthConstants.MARCH, 2006)));
        assertEquals(d(22, MonthConstants.FEBRUARY, 2006), DayDate.getPreviousDayOfWeek(DayDate.WEDNESDAY, d(1, MonthConstants.MARCH, 2006)));
        assertEquals(d(29, MonthConstants.FEBRUARY, 2004), DayDate.getPreviousDayOfWeek(DayDate.SUNDAY, d(3, MonthConstants.MARCH, 2004)));
        assertEquals(d(29, MonthConstants.DECEMBER, 2004), DayDate.getPreviousDayOfWeek(DayDate.WEDNESDAY, d(5, MonthConstants.JANUARY, 2005)));

        try {
            DayDate.getPreviousDayOfWeek(-1, d(1, MonthConstants.JANUARY, 2006));
            fail("Invalid day of week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testGetFollowingDayOfWeek() throws Exception {
        assertEquals(d(1, MonthConstants.JANUARY, 2005),DayDate.getFollowingDayOfWeek(DayDate.SATURDAY, d(25,MonthConstants.DECEMBER, 2004)));
        assertEquals(d(1, MonthConstants.JANUARY, 2005), DayDate.getFollowingDayOfWeek(DayDate.SATURDAY, d(26, MonthConstants.DECEMBER, 2004)));
        assertEquals(d(3, MonthConstants.MARCH, 2004), DayDate.getFollowingDayOfWeek(DayDate.WEDNESDAY, d(28, MonthConstants.FEBRUARY, 2004)));

        try {
            DayDate.getFollowingDayOfWeek(-1, d(1, MonthConstants.JANUARY, 2006));
            fail("Invalid day of week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testGetNearestDayOfWeek() throws Exception {
        assertEquals(d(16, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(16, MonthConstants.APRIL, 2006)));
        assertEquals(d(16, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(17, MonthConstants.APRIL, 2006)));
        assertEquals(d(16, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(16, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(23, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(23, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(23, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SUNDAY, d(22, MonthConstants.APRIL, 2006)));

        assertEquals(d(17, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(16,MonthConstants.APRIL, 2006)));
        assertEquals(d(17, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(17, MonthConstants.APRIL, 2006)));
        assertEquals(d(17, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(17, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(17, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(24, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(24, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.MONDAY, d(22, MonthConstants.APRIL, 2006)));

        assertEquals(d(18, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(16, MonthConstants.APRIL,2006)));
        assertEquals(d(18, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(17, MonthConstants.APRIL,2006)));
        assertEquals(d(18, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(18, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(18, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(18, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(25, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.TUESDAY, d(22, MonthConstants.APRIL, 2006)));

        assertEquals(d(19, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(16, MonthConstants.APRIL, 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(17, MonthConstants.APRIL, 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.WEDNESDAY, d(22, MonthConstants.APRIL, 2006)));

        assertEquals(d(13, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(16, MonthConstants.APRIL, 2006)));
        assertEquals(d(20, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(17, MonthConstants.APRIL, 2006)));
        assertEquals(d(20, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(20, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(20, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(20, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(20, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.THURSDAY, d(22, MonthConstants.APRIL, 2006)));

        assertEquals(d(14, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(16, MonthConstants.APRIL, 2006)));
        assertEquals(d(14, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(17, MonthConstants.APRIL, 2006)));
        assertEquals(d(21, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(21, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(21, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(21, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(21, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.FRIDAY, d(22, MonthConstants.APRIL, 2006)));

        assertEquals(d(15, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(16, MonthConstants.APRIL, 2006)));
        assertEquals(d(15, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(17, MonthConstants.APRIL, 2006)));
        assertEquals(d(15, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(22, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(22, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(22, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(22, MonthConstants.APRIL, 2006), DayDate.getNearestDayOfWeek(DayDate.SATURDAY, d(22, MonthConstants.APRIL, 2006)));

        try {
            DayDate.getNearestDayOfWeek(-1, d(1, MonthConstants.JANUARY, 2006));
            fail("Invalid day of week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testEndOfCurrentMonth() throws Exception {
        DayDate d = DayDate.createInstance(2);
        assertEquals(d(31, MonthConstants.JANUARY, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.JANUARY, 2006)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.FEBRUARY, 2006)));
        assertEquals(d(31, MonthConstants.MARCH, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.MARCH, 2006)));
        assertEquals(d(30, MonthConstants.APRIL, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.APRIL, 2006)));
        assertEquals(d(31, MonthConstants.MAY, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.MAY, 2006)));
        assertEquals(d(30, MonthConstants.JUNE, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.JUNE, 2006)));
        assertEquals(d(31, MonthConstants.JULY, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.JULY, 2006)));
        assertEquals(d(31, MonthConstants.AUGUST, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.AUGUST, 2006)));
        assertEquals(d(30, MonthConstants.SEPTEMBER, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.SEPTEMBER, 2006)));
        assertEquals(d(31, MonthConstants.OCTOBER, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.OCTOBER, 2006)));
        assertEquals(d(30, MonthConstants.NOVEMBER, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.NOVEMBER, 2006)));
        assertEquals(d(31, MonthConstants.DECEMBER, 2006), d.getEndOfCurrentMonth(d(1, MonthConstants.DECEMBER, 2006)));
        assertEquals(d(29, MonthConstants.FEBRUARY, 2008), d.getEndOfCurrentMonth(d(1, MonthConstants.FEBRUARY, 2008)));
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
