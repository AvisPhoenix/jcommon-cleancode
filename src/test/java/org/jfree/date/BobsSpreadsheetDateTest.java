package org.jfree.date;

import junit.framework.TestCase;

public class BobsSpreadsheetDateTest extends TestCase {
    public void testLeapYearCount() throws Exception {
        assertEquals(0, DayUtil.leapYearCount(1900));
        assertEquals(0, DayUtil.leapYearCount(1901));
        assertEquals(0, DayUtil.leapYearCount(1902));
        assertEquals(0, DayUtil.leapYearCount(1903));
        assertEquals(1, DayUtil.leapYearCount(1904));
        assertEquals(1, DayUtil.leapYearCount(1905));
        assertEquals(1, DayUtil.leapYearCount(1906));
        assertEquals(1, DayUtil.leapYearCount(1907));
        assertEquals(2, DayUtil.leapYearCount(1908));
        assertEquals(24, DayUtil.leapYearCount(1999));
        assertEquals(25, DayUtil.leapYearCount(2001));
        assertEquals(49, DayUtil.leapYearCount(2101));
        assertEquals(73, DayUtil.leapYearCount(2201));
        assertEquals(97, DayUtil.leapYearCount(2301));
        assertEquals(122, DayUtil.leapYearCount(2401));
    }
}
