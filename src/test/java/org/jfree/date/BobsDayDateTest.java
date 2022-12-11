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
        assertEquals(d(2, Month.JANUARY, 1900), newYears.plusDays(1));
        assertEquals(d(1, Month.FEBRUARY, 1900), newYears.plusDays(31));
        assertEquals(d(1, Month.JANUARY, 1901), newYears.plusDays(365));
        assertEquals(d(31, Month.DECEMBER, 1904), newYears.plusDays(5 * 365));
    }

    private static SpreadsheetDate d(int day, Month month, int year) {
        return new SpreadsheetDate(day, month, year);
    }

    public void testAddMonths() throws Exception {
        assertEquals(d(1, Month.FEBRUARY, 1900),  d(1, Month.JANUARY, 1900).plusMonths(1));
        assertEquals(d(28, Month.FEBRUARY, 1900),  d(31, Month.JANUARY, 1900).plusMonths(1));
        assertEquals(d(28, Month.FEBRUARY, 1900),  d(30, Month.JANUARY, 1900).plusMonths(1));
        assertEquals(d(28, Month.FEBRUARY, 1900),  d(29, Month.JANUARY, 1900).plusMonths(1));
        assertEquals(d(28, Month.FEBRUARY, 1900),  d(28, Month.JANUARY, 1900).plusMonths(1));
        assertEquals(d(27, Month.FEBRUARY, 1900),  d(27, Month.JANUARY, 1900).plusMonths(1));

        assertEquals(d(30, Month.JUNE, 1900),  d(31, Month.JANUARY, 1900).plusMonths(5));
        assertEquals(d(30, Month.JUNE, 1901),  d(31, Month.JANUARY, 1900).plusMonths(17));

        assertEquals(d(29, Month.FEBRUARY, 1904),  d(31, Month.JANUARY, 1900).plusMonths(49));

    }

    public void testAddYears() throws Exception {
        assertEquals(d(1, Month.JANUARY, 1901), d(1, Month.JANUARY, 1900).plusYears(1));
        assertEquals(d(28, Month.FEBRUARY, 1905), d(29, Month.FEBRUARY, 1904).plusYears(1));
        assertEquals(d(28, Month.FEBRUARY, 1905), d(28, Month.FEBRUARY, 1904).plusYears(1));
        assertEquals(d(28, Month.FEBRUARY, 1904), d(28, Month.FEBRUARY, 1903).plusYears(1));
    }

    public void testGetPreviousDayOfWeek() throws Exception {
        assertEquals(d(24, Month.FEBRUARY, 2006), d(1, Month.MARCH, 2006).getPreviousDayOfWeek(Day.FRIDAY));
        assertEquals(d(22, Month.FEBRUARY, 2006),  d(1, Month.MARCH, 2006).getPreviousDayOfWeek(Day.WEDNESDAY));
        assertEquals(d(29, Month.FEBRUARY, 2004),  d(3, Month.MARCH, 2004).getPreviousDayOfWeek(Day.SUNDAY));
        assertEquals(d(29, Month.DECEMBER, 2004),  d(5, Month.JANUARY, 2005).getPreviousDayOfWeek(Day.WEDNESDAY));
    }

    public void testGetFollowingDayOfWeek() throws Exception {
        assertEquals(d(1, Month.JANUARY, 2005), d(25,Month.DECEMBER, 2004).getFollowingDayOfWeek(Day.SATURDAY));
        assertEquals(d(1, Month.JANUARY, 2005),  d(26, Month.DECEMBER, 2004).getFollowingDayOfWeek(Day.SATURDAY));
        assertEquals(d(3, Month.MARCH, 2004),  d(28, Month.FEBRUARY, 2004).getFollowingDayOfWeek(Day.WEDNESDAY));
    }

    public void testGetNearestDayOfWeek() throws Exception {
        assertEquals(d(16, Month.APRIL, 2006),  d(16, Month.APRIL, 2006).getNearestDayOfWeek(Day.SUNDAY));
        assertEquals(d(16, Month.APRIL, 2006),  d(17, Month.APRIL, 2006).getNearestDayOfWeek(Day.SUNDAY));
        assertEquals(d(16, Month.APRIL, 2006),  d(18, Month.APRIL, 2006).getNearestDayOfWeek(Day.SUNDAY));
        assertEquals(d(16, Month.APRIL, 2006),  d(19, Month.APRIL, 2006).getNearestDayOfWeek(Day.SUNDAY));
        assertEquals(d(23, Month.APRIL, 2006),  d(20, Month.APRIL, 2006).getNearestDayOfWeek(Day.SUNDAY));
        assertEquals(d(23, Month.APRIL, 2006),  d(21, Month.APRIL, 2006).getNearestDayOfWeek(Day.SUNDAY));
        assertEquals(d(23, Month.APRIL, 2006),  d(22, Month.APRIL, 2006).getNearestDayOfWeek(Day.SUNDAY));

        assertEquals(d(17, Month.APRIL, 2006),  d(16,Month.APRIL, 2006).getNearestDayOfWeek(Day.MONDAY));
        assertEquals(d(17, Month.APRIL, 2006),  d(17, Month.APRIL, 2006).getNearestDayOfWeek(Day.MONDAY));
        assertEquals(d(17, Month.APRIL, 2006),  d(18, Month.APRIL, 2006).getNearestDayOfWeek(Day.MONDAY));
        assertEquals(d(17, Month.APRIL, 2006),  d(19, Month.APRIL, 2006).getNearestDayOfWeek(Day.MONDAY));
        assertEquals(d(17, Month.APRIL, 2006),  d(20, Month.APRIL, 2006).getNearestDayOfWeek(Day.MONDAY));
        assertEquals(d(24, Month.APRIL, 2006),  d(21, Month.APRIL, 2006).getNearestDayOfWeek(Day.MONDAY));
        assertEquals(d(24, Month.APRIL, 2006),  d(22, Month.APRIL, 2006).getNearestDayOfWeek(Day.MONDAY));

        assertEquals(d(18, Month.APRIL, 2006),  d(16, Month.APRIL,2006).getNearestDayOfWeek(Day.TUESDAY));
        assertEquals(d(18, Month.APRIL, 2006),  d(17, Month.APRIL,2006).getNearestDayOfWeek(Day.TUESDAY));
        assertEquals(d(18, Month.APRIL, 2006),  d(18, Month.APRIL, 2006).getNearestDayOfWeek(Day.TUESDAY));
        assertEquals(d(18, Month.APRIL, 2006),  d(19, Month.APRIL, 2006).getNearestDayOfWeek(Day.TUESDAY));
        assertEquals(d(18, Month.APRIL, 2006),  d(20, Month.APRIL, 2006).getNearestDayOfWeek(Day.TUESDAY));
        assertEquals(d(18, Month.APRIL, 2006),  d(21, Month.APRIL, 2006).getNearestDayOfWeek(Day.TUESDAY));
        assertEquals(d(25, Month.APRIL, 2006),  d(22, Month.APRIL, 2006).getNearestDayOfWeek(Day.TUESDAY));

        assertEquals(d(19, Month.APRIL, 2006),  d(16, Month.APRIL, 2006).getNearestDayOfWeek(Day.WEDNESDAY));
        assertEquals(d(19, Month.APRIL, 2006),  d(17, Month.APRIL, 2006).getNearestDayOfWeek(Day.WEDNESDAY));
        assertEquals(d(19, Month.APRIL, 2006),  d(18, Month.APRIL, 2006).getNearestDayOfWeek(Day.WEDNESDAY));
        assertEquals(d(19, Month.APRIL, 2006),  d(19, Month.APRIL, 2006).getNearestDayOfWeek(Day.WEDNESDAY));
        assertEquals(d(19, Month.APRIL, 2006),  d(20, Month.APRIL, 2006).getNearestDayOfWeek(Day.WEDNESDAY));
        assertEquals(d(19, Month.APRIL, 2006),  d(21, Month.APRIL, 2006).getNearestDayOfWeek(Day.WEDNESDAY));
        assertEquals(d(19, Month.APRIL, 2006),  d(22, Month.APRIL, 2006).getNearestDayOfWeek(Day.WEDNESDAY));

        assertEquals(d(13, Month.APRIL, 2006),  d(16, Month.APRIL, 2006).getNearestDayOfWeek(Day.THURSDAY));
        assertEquals(d(20, Month.APRIL, 2006),  d(17, Month.APRIL, 2006).getNearestDayOfWeek(Day.THURSDAY));
        assertEquals(d(20, Month.APRIL, 2006),  d(18, Month.APRIL, 2006).getNearestDayOfWeek(Day.THURSDAY));
        assertEquals(d(20, Month.APRIL, 2006),  d(19, Month.APRIL, 2006).getNearestDayOfWeek(Day.THURSDAY));
        assertEquals(d(20, Month.APRIL, 2006),  d(20, Month.APRIL, 2006).getNearestDayOfWeek(Day.THURSDAY));
        assertEquals(d(20, Month.APRIL, 2006),  d(21, Month.APRIL, 2006).getNearestDayOfWeek(Day.THURSDAY));
        assertEquals(d(20, Month.APRIL, 2006),  d(22, Month.APRIL, 2006).getNearestDayOfWeek(Day.THURSDAY));

        assertEquals(d(14, Month.APRIL, 2006),  d(16, Month.APRIL, 2006).getNearestDayOfWeek(Day.FRIDAY));
        assertEquals(d(14, Month.APRIL, 2006),  d(17, Month.APRIL, 2006).getNearestDayOfWeek(Day.FRIDAY));
        assertEquals(d(21, Month.APRIL, 2006),  d(18, Month.APRIL, 2006).getNearestDayOfWeek(Day.FRIDAY));
        assertEquals(d(21, Month.APRIL, 2006),  d(19, Month.APRIL, 2006).getNearestDayOfWeek(Day.FRIDAY));
        assertEquals(d(21, Month.APRIL, 2006),  d(20, Month.APRIL, 2006).getNearestDayOfWeek(Day.FRIDAY));
        assertEquals(d(21, Month.APRIL, 2006),  d(21, Month.APRIL, 2006).getNearestDayOfWeek(Day.FRIDAY));
        assertEquals(d(21, Month.APRIL, 2006),  d(22, Month.APRIL, 2006).getNearestDayOfWeek(Day.FRIDAY));

        assertEquals(d(15, Month.APRIL, 2006),  d(16, Month.APRIL, 2006).getNearestDayOfWeek(Day.SATURDAY));
        assertEquals(d(15, Month.APRIL, 2006),  d(17, Month.APRIL, 2006).getNearestDayOfWeek(Day.SATURDAY));
        assertEquals(d(15, Month.APRIL, 2006),  d(18, Month.APRIL, 2006).getNearestDayOfWeek(Day.SATURDAY));
        assertEquals(d(22, Month.APRIL, 2006),  d(19, Month.APRIL, 2006).getNearestDayOfWeek(Day.SATURDAY));
        assertEquals(d(22, Month.APRIL, 2006),  d(20, Month.APRIL, 2006).getNearestDayOfWeek(Day.SATURDAY));
        assertEquals(d(22, Month.APRIL, 2006),  d(21, Month.APRIL, 2006).getNearestDayOfWeek(Day.SATURDAY));
        assertEquals(d(22, Month.APRIL, 2006),  d(22, Month.APRIL, 2006).getNearestDayOfWeek(Day.SATURDAY));
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
