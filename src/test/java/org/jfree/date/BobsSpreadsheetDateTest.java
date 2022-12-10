package org.jfree.date;

import junit.framework.TestCase;

public class BobsSpreadsheetDateTest extends TestCase {
    public void testLeapYearCount() throws Exception {
        assertEquals(0, SpreadsheetDate.leapYearCount(1900));
        assertEquals(0, SpreadsheetDate.leapYearCount(1901));
        assertEquals(0, SpreadsheetDate.leapYearCount(1902));
        assertEquals(0, SpreadsheetDate.leapYearCount(1903));
        assertEquals(1, SpreadsheetDate.leapYearCount(1904));
        assertEquals(1, SpreadsheetDate.leapYearCount(1905));
        assertEquals(1, SpreadsheetDate.leapYearCount(1906));
        assertEquals(1, SpreadsheetDate.leapYearCount(1907));
        assertEquals(2, SpreadsheetDate.leapYearCount(1908));
        assertEquals(24, SpreadsheetDate.leapYearCount(1999));
        assertEquals(25, SpreadsheetDate.leapYearCount(2001));
        assertEquals(49, SpreadsheetDate.leapYearCount(2101));
        assertEquals(73, SpreadsheetDate.leapYearCount(2201));
        assertEquals(97, SpreadsheetDate.leapYearCount(2301));
        assertEquals(122, SpreadsheetDate.leapYearCount(2401));
    }
}
