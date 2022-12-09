package org.jfree.date;

import junit.framework.TestCase;

public class BobsDayTest extends TestCase {
    public void testIsValidWeekday() throws Exception {
        
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

    public void testParse() throws Exception {

        assertEquals(Day.MONDAY, Day.parse("Monday"));
        assertEquals(Day.MONDAY, Day.parse("Mon"));
        assertEquals(Day.MONDAY,Day.parse("monday"));
        assertEquals(Day.MONDAY,Day.parse("MONDAY"));
        assertEquals(Day.MONDAY, Day.parse("mon"));

        assertEquals(Day.TUESDAY, Day.parse("Tuesday"));
        assertEquals(Day.TUESDAY, Day.parse("Tue"));
        assertEquals(Day.TUESDAY,Day.parse("tuesday"));
        assertEquals(Day.TUESDAY,Day.parse("TUESDAY"));
        assertEquals(Day.TUESDAY, Day.parse("tue"));
        //assertEquals(SerialDate.TUESDAY, SerialDate.parseCode("tues"));

        assertEquals(Day.WEDNESDAY, Day.parse("Wednesday"));
        assertEquals(Day.WEDNESDAY, Day.parse("Wed"));
        assertEquals(Day.WEDNESDAY,Day.parse("wednesday"));
        assertEquals(Day.WEDNESDAY,Day.parse("WEDNESDAY"));
        assertEquals(Day.WEDNESDAY, Day.parse("wed"));

        assertEquals(Day.THURSDAY, Day.parse("Thursday"));
        assertEquals(Day.THURSDAY, Day.parse("Thu"));
        assertEquals(Day.THURSDAY,Day.parse("thursday"));
        assertEquals(Day.THURSDAY,Day.parse("THURSDAY"));
        assertEquals(Day.THURSDAY, Day.parse("thu"));
        //assertEquals(SerialDate.THURSDAY, SerialDate.parseCode("thurs"));

        assertEquals(Day.FRIDAY, Day.parse("Friday"));
        assertEquals(Day.FRIDAY, Day.parse("Fri"));
        assertEquals(Day.FRIDAY,Day.parse("friday"));
        assertEquals(Day.FRIDAY,Day.parse("FRIDAY"));
        assertEquals(Day.FRIDAY, Day.parse("fri"));

        assertEquals(Day.SATURDAY, Day.parse("Saturday"));
        assertEquals(Day.SATURDAY, Day.parse("Sat"));
        assertEquals(Day.SATURDAY,Day.parse("saturday"));
        assertEquals(Day.SATURDAY,Day.parse("SATURDAY"));
        assertEquals(Day.SATURDAY, Day.parse("sat"));

        assertEquals(Day.SUNDAY, Day.parse("Sunday"));
        assertEquals(Day.SUNDAY, Day.parse("Sun"));
        assertEquals(Day.SUNDAY,Day.parse("sunday"));
        assertEquals(Day.SUNDAY,Day.parse("SUNDAY"));
        assertEquals(Day.SUNDAY, Day.parse("sun"));
    }

    public void testWeekdayToString() throws Exception {
        assertEquals("Sunday", Day.SUNDAY.toString());
        assertEquals("Monday", Day.MONDAY.toString());
        assertEquals("Tuesday", Day.TUESDAY.toString());
        assertEquals("Wednesday", Day.WEDNESDAY.toString());
        assertEquals("Thursday", Day.THURSDAY.toString());
        assertEquals("Friday", Day.FRIDAY.toString());
        assertEquals("Saturday", Day.SATURDAY.toString());
    }
}
