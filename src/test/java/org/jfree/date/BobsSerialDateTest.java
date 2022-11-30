package org.jfree.date;

import junit.framework.TestCase;


public class BobsSerialDateTest extends TestCase {
    public void testIsValidWeekdayCode() throws Exception {
        for (int day = 1; day <= 7; day++)
            assertTrue(SerialDate.isValidWeekdayCode(day));
        assertFalse(SerialDate.isValidWeekdayCode(0));
        assertFalse(SerialDate.isValidWeekdayCode(8));
    }

    public void testStringToWeekdayCode() throws Exception {

        assertEquals(-1, SerialDate.stringToWeekdayCode("Hello"));
        assertEquals(SerialDate.MONDAY, SerialDate.stringToWeekdayCode("Monday"));
        assertEquals(SerialDate.MONDAY, SerialDate.stringToWeekdayCode("Mon"));
        assertEquals(SerialDate.MONDAY,SerialDate.stringToWeekdayCode("monday"));
        assertEquals(SerialDate.MONDAY,SerialDate.stringToWeekdayCode("MONDAY"));
        assertEquals(SerialDate.MONDAY, SerialDate.stringToWeekdayCode("mon"));

        assertEquals(SerialDate.TUESDAY, SerialDate.stringToWeekdayCode("Tuesday"));
        assertEquals(SerialDate.TUESDAY, SerialDate.stringToWeekdayCode("Tue"));
        assertEquals(SerialDate.TUESDAY,SerialDate.stringToWeekdayCode("tuesday"));
        assertEquals(SerialDate.TUESDAY,SerialDate.stringToWeekdayCode("TUESDAY"));
        assertEquals(SerialDate.TUESDAY, SerialDate.stringToWeekdayCode("tue"));
        //assertEquals(SerialDate.TUESDAY, SerialDate.stringToWeekdayCode("tues"));

        assertEquals(SerialDate.WEDNESDAY, SerialDate.stringToWeekdayCode("Wednesday"));
        assertEquals(SerialDate.WEDNESDAY, SerialDate.stringToWeekdayCode("Wed"));
        assertEquals(SerialDate.WEDNESDAY,SerialDate.stringToWeekdayCode("wednesday"));
        assertEquals(SerialDate.WEDNESDAY,SerialDate.stringToWeekdayCode("WEDNESDAY"));
        assertEquals(SerialDate.WEDNESDAY, SerialDate.stringToWeekdayCode("wed"));

        assertEquals(SerialDate.THURSDAY, SerialDate.stringToWeekdayCode("Thursday"));
        assertEquals(SerialDate.THURSDAY, SerialDate.stringToWeekdayCode("Thu"));
        assertEquals(SerialDate.THURSDAY,SerialDate.stringToWeekdayCode("thursday"));
        assertEquals(SerialDate.THURSDAY,SerialDate.stringToWeekdayCode("THURSDAY"));
        assertEquals(SerialDate.THURSDAY, SerialDate.stringToWeekdayCode("thu"));
        //assertEquals(SerialDate.THURSDAY, SerialDate.stringToWeekdayCode("thurs"));

        assertEquals(SerialDate.FRIDAY, SerialDate.stringToWeekdayCode("Friday"));
        assertEquals(SerialDate.FRIDAY, SerialDate.stringToWeekdayCode("Fri"));
        assertEquals(SerialDate.FRIDAY,SerialDate.stringToWeekdayCode("friday"));
        assertEquals(SerialDate.FRIDAY,SerialDate.stringToWeekdayCode("FRIDAY"));
        assertEquals(SerialDate.FRIDAY, SerialDate.stringToWeekdayCode("fri"));

        assertEquals(SerialDate.SATURDAY, SerialDate.stringToWeekdayCode("Saturday"));
        assertEquals(SerialDate.SATURDAY, SerialDate.stringToWeekdayCode("Sat"));
        assertEquals(SerialDate.SATURDAY,SerialDate.stringToWeekdayCode("saturday"));
        assertEquals(SerialDate.SATURDAY,SerialDate.stringToWeekdayCode("SATURDAY"));
        assertEquals(SerialDate.SATURDAY, SerialDate.stringToWeekdayCode("sat"));

        assertEquals(SerialDate.SUNDAY, SerialDate.stringToWeekdayCode("Sunday"));
        assertEquals(SerialDate.SUNDAY, SerialDate.stringToWeekdayCode("Sun"));
        assertEquals(SerialDate.SUNDAY,SerialDate.stringToWeekdayCode("sunday"));
        assertEquals(SerialDate.SUNDAY,SerialDate.stringToWeekdayCode("SUNDAY"));
        assertEquals(SerialDate.SUNDAY, SerialDate.stringToWeekdayCode("sun"));
    }

    public void testWeekdayCodeToString() throws Exception {
        assertEquals("Sunday", SerialDate.weekdayCodeToString(SerialDate.SUNDAY));
        assertEquals("Monday", SerialDate.weekdayCodeToString(SerialDate.MONDAY));
        assertEquals("Tuesday", SerialDate.weekdayCodeToString(SerialDate.TUESDAY));
        assertEquals("Wednesday", SerialDate.weekdayCodeToString(SerialDate.WEDNESDAY));
        assertEquals("Thursday", SerialDate.weekdayCodeToString(SerialDate.THURSDAY));
        assertEquals("Friday", SerialDate.weekdayCodeToString(SerialDate.FRIDAY));
        assertEquals("Saturday", SerialDate.weekdayCodeToString(SerialDate.SATURDAY));
    }

    public void testIsValidMonthCode() throws Exception {
        for (int i = 1; i <= 12; i++)
            assertTrue(SerialDate.isValidMonthCode(i));
        assertFalse(SerialDate.isValidMonthCode(0));
        assertFalse(SerialDate.isValidMonthCode(13));
    }

    public void testMonthToQuarter() throws Exception {
        assertEquals(1, SerialDate.monthCodeToQuarter(MonthConstants.JANUARY));
        assertEquals(1, SerialDate.monthCodeToQuarter(MonthConstants.FEBRUARY));
        assertEquals(1, SerialDate.monthCodeToQuarter(MonthConstants.MARCH));
        assertEquals(2, SerialDate.monthCodeToQuarter(MonthConstants.APRIL));
        assertEquals(2, SerialDate.monthCodeToQuarter(MonthConstants.MAY));
        assertEquals(2, SerialDate.monthCodeToQuarter(MonthConstants.JUNE));
        assertEquals(3, SerialDate.monthCodeToQuarter(MonthConstants.JULY));
        assertEquals(3, SerialDate.monthCodeToQuarter(MonthConstants.AUGUST));
        assertEquals(3, SerialDate.monthCodeToQuarter(MonthConstants.SEPTEMBER));
        assertEquals(4, SerialDate.monthCodeToQuarter(MonthConstants.OCTOBER));
        assertEquals(4, SerialDate.monthCodeToQuarter(MonthConstants.NOVEMBER));
        assertEquals(4, SerialDate.monthCodeToQuarter(MonthConstants.DECEMBER));

        try {
            SerialDate.monthCodeToQuarter(-1);
            fail("Invalid Month Code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testMonthCodeToString() throws Exception {
        assertEquals("January", SerialDate.monthCodeToString(MonthConstants.JANUARY));
        assertEquals("February", SerialDate.monthCodeToString(MonthConstants.FEBRUARY));
        assertEquals("March", SerialDate.monthCodeToString(MonthConstants.MARCH));
        assertEquals("April", SerialDate.monthCodeToString(MonthConstants.APRIL));
        assertEquals("May", SerialDate.monthCodeToString(MonthConstants.MAY));
        assertEquals("June", SerialDate.monthCodeToString(MonthConstants.JUNE));
        assertEquals("July", SerialDate.monthCodeToString(MonthConstants.JULY));
        assertEquals("August", SerialDate.monthCodeToString(MonthConstants.AUGUST));
        assertEquals("September", SerialDate.monthCodeToString(MonthConstants.SEPTEMBER));
        assertEquals("October", SerialDate.monthCodeToString(MonthConstants.OCTOBER));
        assertEquals("November", SerialDate.monthCodeToString(MonthConstants.NOVEMBER));
        assertEquals("December", SerialDate.monthCodeToString(MonthConstants.DECEMBER));

        assertEquals("Jan", SerialDate.monthCodeToString(MonthConstants.JANUARY, true));
        assertEquals("Feb", SerialDate.monthCodeToString(MonthConstants.FEBRUARY, true));
        assertEquals("Mar", SerialDate.monthCodeToString(MonthConstants.MARCH, true));
        assertEquals("Apr", SerialDate.monthCodeToString(MonthConstants.APRIL, true));
        assertEquals("May", SerialDate.monthCodeToString(MonthConstants.MAY, true));
        assertEquals("Jun", SerialDate.monthCodeToString(MonthConstants.JUNE, true));
        assertEquals("Jul", SerialDate.monthCodeToString(MonthConstants.JULY, true));
        assertEquals("Aug", SerialDate.monthCodeToString(MonthConstants.AUGUST, true));
        assertEquals("Sep", SerialDate.monthCodeToString(MonthConstants.SEPTEMBER, true));
        assertEquals("Oct", SerialDate.monthCodeToString(MonthConstants.OCTOBER, true));
        assertEquals("Nov", SerialDate.monthCodeToString(MonthConstants.NOVEMBER, true));
        assertEquals("Dec", SerialDate.monthCodeToString(MonthConstants.DECEMBER, true));

        try {
            SerialDate.monthCodeToString(-1);
            fail("Invalid month code should throw exception");
        } catch (IllegalArgumentException e) {
        }

    }

    public void testStringToMonthCode() throws Exception {
        assertEquals(MonthConstants.JANUARY, SerialDate.stringToMonthCode("1"));
        assertEquals(MonthConstants.FEBRUARY, SerialDate.stringToMonthCode("2"));
        assertEquals(MonthConstants.MARCH, SerialDate.stringToMonthCode("3"));
        assertEquals(MonthConstants.APRIL, SerialDate.stringToMonthCode("4"));
        assertEquals(MonthConstants.MAY, SerialDate.stringToMonthCode("5"));
        assertEquals(MonthConstants.JUNE, SerialDate.stringToMonthCode("6"));
        assertEquals(MonthConstants.JULY, SerialDate.stringToMonthCode("7"));
        assertEquals(MonthConstants.AUGUST, SerialDate.stringToMonthCode("8"));
        assertEquals(MonthConstants.SEPTEMBER, SerialDate.stringToMonthCode("9"));
        assertEquals(MonthConstants.OCTOBER, SerialDate.stringToMonthCode("10"));
        assertEquals(MonthConstants.NOVEMBER, SerialDate.stringToMonthCode("11"));
        assertEquals(MonthConstants.DECEMBER, SerialDate.stringToMonthCode("12"));

        assertEquals(-1, SerialDate.stringToMonthCode("0"));
        assertEquals(-1, SerialDate.stringToMonthCode("13"));

        assertEquals(-1, SerialDate.stringToMonthCode("Hello"));

        for (int m = 1; m <= 12; m++) {
            assertEquals(m, SerialDate.stringToMonthCode(SerialDate.monthCodeToString(m, false)));
            assertEquals(m, SerialDate.stringToMonthCode(SerialDate.monthCodeToString(m, true)));
        }

        assertEquals(1,SerialDate.stringToMonthCode("jan"));
        assertEquals(2,SerialDate.stringToMonthCode("feb"));
        assertEquals(3,SerialDate.stringToMonthCode("mar"));
        assertEquals(4,SerialDate.stringToMonthCode("apr"));
        assertEquals(5,SerialDate.stringToMonthCode("may"));
        assertEquals(6,SerialDate.stringToMonthCode("jun"));
        assertEquals(7,SerialDate.stringToMonthCode("jul"));
        assertEquals(8,SerialDate.stringToMonthCode("aug"));
        assertEquals(9,SerialDate.stringToMonthCode("sep"));
        assertEquals(10,SerialDate.stringToMonthCode("oct"));
        assertEquals(11,SerialDate.stringToMonthCode("nov"));
        assertEquals(12,SerialDate.stringToMonthCode("dec"));

        assertEquals(1,SerialDate.stringToMonthCode("JAN"));
        assertEquals(2,SerialDate.stringToMonthCode("FEB"));
        assertEquals(3,SerialDate.stringToMonthCode("MAR"));
        assertEquals(4,SerialDate.stringToMonthCode("APR"));
        assertEquals(5,SerialDate.stringToMonthCode("MAY"));
        assertEquals(6,SerialDate.stringToMonthCode("JUN"));
        assertEquals(7,SerialDate.stringToMonthCode("JUL"));
        assertEquals(8,SerialDate.stringToMonthCode("AUG"));
        assertEquals(9,SerialDate.stringToMonthCode("SEP"));
        assertEquals(10,SerialDate.stringToMonthCode("OCT"));
        assertEquals(11,SerialDate.stringToMonthCode("NOV"));
        assertEquals(12,SerialDate.stringToMonthCode("DEC"));

        assertEquals(1,SerialDate.stringToMonthCode("january"));
        assertEquals(2,SerialDate.stringToMonthCode("february"));
        assertEquals(3,SerialDate.stringToMonthCode("march"));
        assertEquals(4,SerialDate.stringToMonthCode("april"));
        assertEquals(5,SerialDate.stringToMonthCode("may"));
        assertEquals(6,SerialDate.stringToMonthCode("june"));
        assertEquals(7,SerialDate.stringToMonthCode("july"));
        assertEquals(8,SerialDate.stringToMonthCode("august"));
        assertEquals(9,SerialDate.stringToMonthCode("september"));
        assertEquals(10,SerialDate.stringToMonthCode("october"));
        assertEquals(11,SerialDate.stringToMonthCode("november"));
        assertEquals(12,SerialDate.stringToMonthCode("december"));

        assertEquals(1,SerialDate.stringToMonthCode("JANUARY"));
        assertEquals(2,SerialDate.stringToMonthCode("FEBRUARY"));
        assertEquals(3,SerialDate.stringToMonthCode("MAR"));
        assertEquals(4,SerialDate.stringToMonthCode("APRIL"));
        assertEquals(5,SerialDate.stringToMonthCode("MAY"));
        assertEquals(6,SerialDate.stringToMonthCode("JUNE"));
        assertEquals(7,SerialDate.stringToMonthCode("JULY"));
        assertEquals(8,SerialDate.stringToMonthCode("AUGUST"));
        assertEquals(9,SerialDate.stringToMonthCode("SEPTEMBER"));
        assertEquals(10,SerialDate.stringToMonthCode("OCTOBER"));
        assertEquals(11,SerialDate.stringToMonthCode("NOVEMBER"));
        assertEquals(12,SerialDate.stringToMonthCode("DECEMBER"));
    }

    public void testIsValidWeekInMonthCode() throws Exception {
        for (int w = 0; w <= 4; w++) {
            assertTrue(SerialDate.isValidWeekInMonthCode(w));
        }
        assertFalse(SerialDate.isValidWeekInMonthCode(5));
    }

    public void testIsLeapYear() throws Exception {
        assertFalse(SerialDate.isLeapYear(1900));
        assertFalse(SerialDate.isLeapYear(1901));
        assertFalse(SerialDate.isLeapYear(1902));
        assertFalse(SerialDate.isLeapYear(1903));
        assertTrue(SerialDate.isLeapYear(1904));
        assertTrue(SerialDate.isLeapYear(1908));
        assertFalse(SerialDate.isLeapYear(1955));
        assertTrue(SerialDate.isLeapYear(1964));
        assertTrue(SerialDate.isLeapYear(1980));
        assertTrue(SerialDate.isLeapYear(2000));
        assertFalse(SerialDate.isLeapYear(2001));
        assertFalse(SerialDate.isLeapYear(2100));
    }

    public void testLeapYearCount() throws Exception {
        assertEquals(0, SerialDate.leapYearCount(1900));
        assertEquals(0, SerialDate.leapYearCount(1901));
        assertEquals(0, SerialDate.leapYearCount(1902));
        assertEquals(0, SerialDate.leapYearCount(1903));
        assertEquals(1, SerialDate.leapYearCount(1904));
        assertEquals(1, SerialDate.leapYearCount(1905));
        assertEquals(1, SerialDate.leapYearCount(1906));
        assertEquals(1, SerialDate.leapYearCount(1907));
        assertEquals(2, SerialDate.leapYearCount(1908));
        assertEquals(24, SerialDate.leapYearCount(1999));
        assertEquals(25, SerialDate.leapYearCount(2001));
        assertEquals(49, SerialDate.leapYearCount(2101));
        assertEquals(73, SerialDate.leapYearCount(2201));
        assertEquals(97, SerialDate.leapYearCount(2301));
        assertEquals(122, SerialDate.leapYearCount(2401));
    }

    public void testLastDayOfMonth() throws Exception {
        assertEquals(31, SerialDate.lastDayOfMonth(MonthConstants.JANUARY, 1901));
        assertEquals(28, SerialDate.lastDayOfMonth(MonthConstants.FEBRUARY, 1901));
        assertEquals(31, SerialDate.lastDayOfMonth(MonthConstants.MARCH, 1901));
        assertEquals(30, SerialDate.lastDayOfMonth(MonthConstants.APRIL, 1901));
        assertEquals(31, SerialDate.lastDayOfMonth(MonthConstants.MAY, 1901));
        assertEquals(30, SerialDate.lastDayOfMonth(MonthConstants.JUNE, 1901));
        assertEquals(31, SerialDate.lastDayOfMonth(MonthConstants.JULY, 1901));
        assertEquals(31, SerialDate.lastDayOfMonth(MonthConstants.AUGUST, 1901));
        assertEquals(30, SerialDate.lastDayOfMonth(MonthConstants.SEPTEMBER, 1901));
        assertEquals(31, SerialDate.lastDayOfMonth(MonthConstants.OCTOBER, 1901));
        assertEquals(30, SerialDate.lastDayOfMonth(MonthConstants.NOVEMBER, 1901));
        assertEquals(31, SerialDate.lastDayOfMonth(MonthConstants.DECEMBER, 1901));
        assertEquals(29, SerialDate.lastDayOfMonth(MonthConstants.FEBRUARY, 1904));
    }

    public void testAddDays() throws Exception {
        SerialDate newYears = d(1, MonthConstants.JANUARY, 1900);
        assertEquals(d(2, MonthConstants.JANUARY, 1900), SerialDate.addDays(1, newYears));
        assertEquals(d(1, MonthConstants.FEBRUARY, 1900), SerialDate.addDays(31, newYears));
        assertEquals(d(1, MonthConstants.JANUARY, 1901), SerialDate.addDays(365, newYears));
        assertEquals(d(31, MonthConstants.DECEMBER, 1904), SerialDate.addDays(5 * 365, newYears));
    }

    private static SpreadsheetDate d(int day, int month, int year) {
        return new SpreadsheetDate(day, month, year);
    }

    public void testAddMonths() throws Exception {
        assertEquals(d(1, MonthConstants.FEBRUARY, 1900), SerialDate.addMonths(1, d(1, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1900), SerialDate.addMonths(1, d(31, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1900), SerialDate.addMonths(1, d(30, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1900), SerialDate.addMonths(1, d(29, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1900), SerialDate.addMonths(1, d(28, MonthConstants.JANUARY, 1900)));
        assertEquals(d(27, MonthConstants.FEBRUARY, 1900), SerialDate.addMonths(1, d(27, MonthConstants.JANUARY, 1900)));

        assertEquals(d(30, MonthConstants.JUNE, 1900), SerialDate.addMonths(5, d(31, MonthConstants.JANUARY, 1900)));
        assertEquals(d(30, MonthConstants.JUNE, 1901), SerialDate.addMonths(17, d(31, MonthConstants.JANUARY, 1900)));

        assertEquals(d(29, MonthConstants.FEBRUARY, 1904), SerialDate.addMonths(49, d(31, MonthConstants.JANUARY, 1900)));

    }

    public void testAddYears() throws Exception {
        assertEquals(d(1, MonthConstants.JANUARY, 1901), SerialDate.addYears(1, d(1, MonthConstants.JANUARY, 1900)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1905), SerialDate.addYears(1, d(29, MonthConstants.FEBRUARY, 1904)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1905), SerialDate.addYears(1, d(28, MonthConstants.FEBRUARY, 1904)));
        assertEquals(d(28, MonthConstants.FEBRUARY, 1904), SerialDate.addYears(1, d(28, MonthConstants.FEBRUARY, 1903)));
    }

    public void testGetPreviousDayOfWeek() throws Exception {
        assertEquals(d(24, MonthConstants.FEBRUARY, 2006), SerialDate.getPreviousDayOfWeek(SerialDate.FRIDAY, d(1, MonthConstants.MARCH, 2006)));
        assertEquals(d(22, MonthConstants.FEBRUARY, 2006), SerialDate.getPreviousDayOfWeek(SerialDate.WEDNESDAY, d(1, MonthConstants.MARCH, 2006)));
        assertEquals(d(29, MonthConstants.FEBRUARY, 2004), SerialDate.getPreviousDayOfWeek(SerialDate.SUNDAY, d(3, MonthConstants.MARCH, 2004)));
        assertEquals(d(29, MonthConstants.DECEMBER, 2004), SerialDate.getPreviousDayOfWeek(SerialDate.WEDNESDAY, d(5, MonthConstants.JANUARY, 2005)));

        try {
            SerialDate.getPreviousDayOfWeek(-1, d(1, MonthConstants.JANUARY, 2006));
            fail("Invalid day of week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testGetFollowingDayOfWeek() throws Exception {
        // assertEquals(d(1, MonthConstants.JANUARY, 2005),SerialDate.getFollowingDayOfWeek(SerialDate.SATURDAY, d(25,
        // MonthConstants.DECEMBER, 2004)));
        assertEquals(d(1, MonthConstants.JANUARY, 2005), SerialDate.getFollowingDayOfWeek(SerialDate.SATURDAY, d(26, MonthConstants.DECEMBER, 2004)));
        assertEquals(d(3, MonthConstants.MARCH, 2004), SerialDate.getFollowingDayOfWeek(SerialDate.WEDNESDAY, d(28, MonthConstants.FEBRUARY, 2004)));

        try {
            SerialDate.getFollowingDayOfWeek(-1, d(1, MonthConstants.JANUARY, 2006));
            fail("Invalid day of week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testGetNearestDayOfWeek() throws Exception {
        assertEquals(d(16, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SUNDAY, d(16, MonthConstants.APRIL, 2006)));
        assertEquals(d(16, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SUNDAY, d(17, MonthConstants.APRIL, 2006)));
        assertEquals(d(16, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SUNDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(16, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SUNDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(23, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SUNDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(23, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SUNDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(23, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SUNDAY, d(22, MonthConstants.APRIL, 2006)));

        // todo assertEquals(d(17, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.MONDAY, d(16,
        // MonthConstants.APRIL, 2006)));
        assertEquals(d(17, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.MONDAY, d(17, MonthConstants.APRIL, 2006)));
        assertEquals(d(17, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.MONDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(17, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.MONDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(17, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.MONDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(24, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.MONDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(24, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.MONDAY, d(22, MonthConstants.APRIL, 2006)));

        // assertEquals(d(18, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.TUESDAY, d(16, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(18, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.TUESDAY, d(17, MonthConstants.APRIL,
        // 2006)));
        assertEquals(d(18, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.TUESDAY, d(18, MonthConstants.APRIL, 2006)));
        assertEquals(d(18, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.TUESDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(18, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.TUESDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(18, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.TUESDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(25, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.TUESDAY, d(22, MonthConstants.APRIL, 2006)));

        // assertEquals(d(19, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.WEDNESDAY, d(16, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(19, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.WEDNESDAY, d(17, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(19, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.WEDNESDAY, d(18, MonthConstants.APRIL,
        // 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.WEDNESDAY, d(19, MonthConstants.APRIL, 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.WEDNESDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.WEDNESDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(19, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.WEDNESDAY, d(22, MonthConstants.APRIL, 2006)));

        // assertEquals(d(13, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.THURSDAY, d(16, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(20, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.THURSDAY, d(17, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(20, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.THURSDAY, d(18, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(20, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.THURSDAY, d(19, MonthConstants.APRIL,
        // 2006)));
        assertEquals(d(20, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.THURSDAY, d(20, MonthConstants.APRIL, 2006)));
        assertEquals(d(20, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.THURSDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(20, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.THURSDAY, d(22, MonthConstants.APRIL, 2006)));

        // assertEquals(d(14, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.FRIDAY, d(16, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(14, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.FRIDAY, d(17, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(21, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.FRIDAY, d(18, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(21, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.FRIDAY, d(19, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(21, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.FRIDAY, d(20, MonthConstants.APRIL,
        // 2006)));
        assertEquals(d(21, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.FRIDAY, d(21, MonthConstants.APRIL, 2006)));
        assertEquals(d(21, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.FRIDAY, d(22, MonthConstants.APRIL, 2006)));

        // assertEquals(d(15, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SATURDAY, d(16, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(15, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SATURDAY, d(17, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(15, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SATURDAY, d(18, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(22, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SATURDAY, d(19, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(22, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SATURDAY, d(20, MonthConstants.APRIL,
        // 2006)));
        // assertEquals(d(22, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SATURDAY, d(21, MonthConstants.APRIL,
        // 2006)));
        assertEquals(d(22, MonthConstants.APRIL, 2006), SerialDate.getNearestDayOfWeek(SerialDate.SATURDAY, d(22, MonthConstants.APRIL, 2006)));

        try {
            SerialDate.getNearestDayOfWeek(-1, d(1, MonthConstants.JANUARY, 2006));
            fail("Invalid day of week code should throw exception");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testEndOfCurrentMonth() throws Exception {
        SerialDate d = SerialDate.createInstance(2);
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
        assertEquals("First", SerialDate.weekInMonthToString(SerialDate.FIRST_WEEK_IN_MONTH));
        assertEquals("Second", SerialDate.weekInMonthToString(SerialDate.SECOND_WEEK_IN_MONTH));
        assertEquals("Third", SerialDate.weekInMonthToString(SerialDate.THIRD_WEEK_IN_MONTH));
        assertEquals("Fourth", SerialDate.weekInMonthToString(SerialDate.FOURTH_WEEK_IN_MONTH));
        assertEquals("Last", SerialDate.weekInMonthToString(SerialDate.LAST_WEEK_IN_MONTH));

        // todo try {
        // SerialDate.weekInMonthToString(-1);
        // fail("Invalid week code should throw exception");
        // } catch (IllegalArgumentException e) {
        // }
    }

    public void testRelativeToString() throws Exception {
        assertEquals("Preceding", SerialDate.relativeToString(SerialDate.PRECEDING));
        assertEquals("Nearest", SerialDate.relativeToString(SerialDate.NEAREST));
        assertEquals("Following", SerialDate.relativeToString(SerialDate.FOLLOWING));

        // todo try {
        // SerialDate.relativeToString(-1000);
        // fail("Invalid relative code should throw exception");
        // } catch (IllegalArgumentException e) {
        // }
    }

}
