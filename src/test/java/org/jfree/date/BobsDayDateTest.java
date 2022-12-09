package org.jfree.date;

import junit.framework.TestCase;


public class BobsDayDateTest extends TestCase {

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
        assertEquals(31, DayDate.lastDayOfMonth(Month.JANUARY, 1901));
        assertEquals(28, DayDate.lastDayOfMonth(Month.FEBRUARY, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(Month.MARCH, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(Month.APRIL, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(Month.MAY, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(Month.JUNE, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(Month.JULY, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(Month.AUGUST, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(Month.SEPTEMBER, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(Month.OCTOBER, 1901));
        assertEquals(30, DayDate.lastDayOfMonth(Month.NOVEMBER, 1901));
        assertEquals(31, DayDate.lastDayOfMonth(Month.DECEMBER, 1901));
        assertEquals(29, DayDate.lastDayOfMonth(Month.FEBRUARY, 1904));
    }

    public void testAddDays() throws Exception {
        DayDate newYears = d(1, Month.JANUARY, 1900);
        assertEquals(d(2, Month.JANUARY, 1900), DayDate.addDays(1, newYears));
        assertEquals(d(1, Month.FEBRUARY, 1900), DayDate.addDays(31, newYears));
        assertEquals(d(1, Month.JANUARY, 1901), DayDate.addDays(365, newYears));
        assertEquals(d(31, Month.DECEMBER, 1904), DayDate.addDays(5 * 365, newYears));
    }

    private static SpreadsheetDate d(int day, Month month, int year) {
        return new SpreadsheetDate(day, month, year);
    }

    public void testAddMonths() throws Exception {
        assertEquals(d(1, Month.FEBRUARY, 1900), DayDate.addMonths(1, d(1, Month.JANUARY, 1900)));
        assertEquals(d(28, Month.FEBRUARY, 1900), DayDate.addMonths(1, d(31, Month.JANUARY, 1900)));
        assertEquals(d(28, Month.FEBRUARY, 1900), DayDate.addMonths(1, d(30, Month.JANUARY, 1900)));
        assertEquals(d(28, Month.FEBRUARY, 1900), DayDate.addMonths(1, d(29, Month.JANUARY, 1900)));
        assertEquals(d(28, Month.FEBRUARY, 1900), DayDate.addMonths(1, d(28, Month.JANUARY, 1900)));
        assertEquals(d(27, Month.FEBRUARY, 1900), DayDate.addMonths(1, d(27, Month.JANUARY, 1900)));

        assertEquals(d(30, Month.JUNE, 1900), DayDate.addMonths(5, d(31, Month.JANUARY, 1900)));
        assertEquals(d(30, Month.JUNE, 1901), DayDate.addMonths(17, d(31, Month.JANUARY, 1900)));

        assertEquals(d(29, Month.FEBRUARY, 1904), DayDate.addMonths(49, d(31, Month.JANUARY, 1900)));

    }

    public void testAddYears() throws Exception {
        assertEquals(d(1, Month.JANUARY, 1901), DayDate.addYears(1, d(1, Month.JANUARY, 1900)));
        assertEquals(d(28, Month.FEBRUARY, 1905), DayDate.addYears(1, d(29, Month.FEBRUARY, 1904)));
        assertEquals(d(28, Month.FEBRUARY, 1905), DayDate.addYears(1, d(28, Month.FEBRUARY, 1904)));
        assertEquals(d(28, Month.FEBRUARY, 1904), DayDate.addYears(1, d(28, Month.FEBRUARY, 1903)));
    }

    public void testGetPreviousDayOfWeek() throws Exception {
        assertEquals(d(24, Month.FEBRUARY, 2006), DayDate.getPreviousDayOfWeek(Day.FRIDAY, d(1, Month.MARCH, 2006)));
        assertEquals(d(22, Month.FEBRUARY, 2006), DayDate.getPreviousDayOfWeek(Day.WEDNESDAY, d(1, Month.MARCH, 2006)));
        assertEquals(d(29, Month.FEBRUARY, 2004), DayDate.getPreviousDayOfWeek(Day.SUNDAY, d(3, Month.MARCH, 2004)));
        assertEquals(d(29, Month.DECEMBER, 2004), DayDate.getPreviousDayOfWeek(Day.WEDNESDAY, d(5, Month.JANUARY, 2005)));
    }

    public void testGetFollowingDayOfWeek() throws Exception {
        assertEquals(d(1, Month.JANUARY, 2005),DayDate.getFollowingDayOfWeek(Day.SATURDAY, d(25,Month.DECEMBER, 2004)));
        assertEquals(d(1, Month.JANUARY, 2005), DayDate.getFollowingDayOfWeek(Day.SATURDAY, d(26, Month.DECEMBER, 2004)));
        assertEquals(d(3, Month.MARCH, 2004), DayDate.getFollowingDayOfWeek(Day.WEDNESDAY, d(28, Month.FEBRUARY, 2004)));
    }

    public void testGetNearestDayOfWeek() throws Exception {
        assertEquals(d(16, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(16, Month.APRIL, 2006)));
        assertEquals(d(16, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(17, Month.APRIL, 2006)));
        assertEquals(d(16, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(18, Month.APRIL, 2006)));
        assertEquals(d(16, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(19, Month.APRIL, 2006)));
        assertEquals(d(23, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(20, Month.APRIL, 2006)));
        assertEquals(d(23, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(21, Month.APRIL, 2006)));
        assertEquals(d(23, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SUNDAY, d(22, Month.APRIL, 2006)));

        assertEquals(d(17, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(16,Month.APRIL, 2006)));
        assertEquals(d(17, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(17, Month.APRIL, 2006)));
        assertEquals(d(17, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(18, Month.APRIL, 2006)));
        assertEquals(d(17, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(19, Month.APRIL, 2006)));
        assertEquals(d(17, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(20, Month.APRIL, 2006)));
        assertEquals(d(24, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(21, Month.APRIL, 2006)));
        assertEquals(d(24, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.MONDAY, d(22, Month.APRIL, 2006)));

        assertEquals(d(18, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(16, Month.APRIL,2006)));
        assertEquals(d(18, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(17, Month.APRIL,2006)));
        assertEquals(d(18, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(18, Month.APRIL, 2006)));
        assertEquals(d(18, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(19, Month.APRIL, 2006)));
        assertEquals(d(18, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(20, Month.APRIL, 2006)));
        assertEquals(d(18, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(21, Month.APRIL, 2006)));
        assertEquals(d(25, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.TUESDAY, d(22, Month.APRIL, 2006)));

        assertEquals(d(19, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(16, Month.APRIL, 2006)));
        assertEquals(d(19, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(17, Month.APRIL, 2006)));
        assertEquals(d(19, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(18, Month.APRIL, 2006)));
        assertEquals(d(19, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(19, Month.APRIL, 2006)));
        assertEquals(d(19, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(20, Month.APRIL, 2006)));
        assertEquals(d(19, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(21, Month.APRIL, 2006)));
        assertEquals(d(19, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.WEDNESDAY, d(22, Month.APRIL, 2006)));

        assertEquals(d(13, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(16, Month.APRIL, 2006)));
        assertEquals(d(20, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(17, Month.APRIL, 2006)));
        assertEquals(d(20, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(18, Month.APRIL, 2006)));
        assertEquals(d(20, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(19, Month.APRIL, 2006)));
        assertEquals(d(20, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(20, Month.APRIL, 2006)));
        assertEquals(d(20, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(21, Month.APRIL, 2006)));
        assertEquals(d(20, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.THURSDAY, d(22, Month.APRIL, 2006)));

        assertEquals(d(14, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(16, Month.APRIL, 2006)));
        assertEquals(d(14, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(17, Month.APRIL, 2006)));
        assertEquals(d(21, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(18, Month.APRIL, 2006)));
        assertEquals(d(21, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(19, Month.APRIL, 2006)));
        assertEquals(d(21, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(20, Month.APRIL, 2006)));
        assertEquals(d(21, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(21, Month.APRIL, 2006)));
        assertEquals(d(21, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.FRIDAY, d(22, Month.APRIL, 2006)));

        assertEquals(d(15, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(16, Month.APRIL, 2006)));
        assertEquals(d(15, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(17, Month.APRIL, 2006)));
        assertEquals(d(15, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(18, Month.APRIL, 2006)));
        assertEquals(d(22, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(19, Month.APRIL, 2006)));
        assertEquals(d(22, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(20, Month.APRIL, 2006)));
        assertEquals(d(22, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(21, Month.APRIL, 2006)));
        assertEquals(d(22, Month.APRIL, 2006), DayDate.getNearestDayOfWeek(Day.SATURDAY, d(22, Month.APRIL, 2006)));
    }

    public void testEndOfCurrentMonth() throws Exception {
        DayDate d = DayDateFactory.makeDate(2);
        assertEquals(d(31, Month.JANUARY, 2006), d.getEndOfCurrentMonth(d(1, Month.JANUARY, 2006)));
        assertEquals(d(28, Month.FEBRUARY, 2006), d.getEndOfCurrentMonth(d(1, Month.FEBRUARY, 2006)));
        assertEquals(d(31, Month.MARCH, 2006), d.getEndOfCurrentMonth(d(1, Month.MARCH, 2006)));
        assertEquals(d(30, Month.APRIL, 2006), d.getEndOfCurrentMonth(d(1, Month.APRIL, 2006)));
        assertEquals(d(31, Month.MAY, 2006), d.getEndOfCurrentMonth(d(1, Month.MAY, 2006)));
        assertEquals(d(30, Month.JUNE, 2006), d.getEndOfCurrentMonth(d(1, Month.JUNE, 2006)));
        assertEquals(d(31, Month.JULY, 2006), d.getEndOfCurrentMonth(d(1, Month.JULY, 2006)));
        assertEquals(d(31, Month.AUGUST, 2006), d.getEndOfCurrentMonth(d(1, Month.AUGUST, 2006)));
        assertEquals(d(30, Month.SEPTEMBER, 2006), d.getEndOfCurrentMonth(d(1, Month.SEPTEMBER, 2006)));
        assertEquals(d(31, Month.OCTOBER, 2006), d.getEndOfCurrentMonth(d(1, Month.OCTOBER, 2006)));
        assertEquals(d(30, Month.NOVEMBER, 2006), d.getEndOfCurrentMonth(d(1, Month.NOVEMBER, 2006)));
        assertEquals(d(31, Month.DECEMBER, 2006), d.getEndOfCurrentMonth(d(1, Month.DECEMBER, 2006)));
        assertEquals(d(29, Month.FEBRUARY, 2008), d.getEndOfCurrentMonth(d(1, Month.FEBRUARY, 2008)));
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
