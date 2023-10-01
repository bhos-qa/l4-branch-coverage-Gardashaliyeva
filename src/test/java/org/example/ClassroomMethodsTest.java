package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

class ClassroomMethodsTest {
    @Test
    public void testConvertToBinary() {
        ClassroomMethods cm = new ClassroomMethods();
        assertEquals("1101", cm.convertToBinary(13));
    }

    @Test
    public void testCalculateHypotenuse() {
        ClassroomMethods cm = new ClassroomMethods();
        assertEquals(5.0, cm.calculateHypotenuse(3.0, 4.0), 0.0001);
    }

    @Test
    public void testIsLeapYear() {
        ClassroomMethods cm = new ClassroomMethods();
        assertTrue(cm.isLeapYear(2020));
    }

    @Test
    public void testReverseArray() {
        ClassroomMethods cm = new ClassroomMethods();
        String[] original = {"apple", "banana", "cherry", "date"};
        String[] reversed = cm.reverseArray(original);
        String[] expected = {"date", "cherry", "banana", "apple"};
        assertArrayEquals(expected, reversed);

        String[] emptyArray = {};
        String[] reversedEmpty = cm.reverseArray(emptyArray);
        String[] expectedEmpty = {};
        assertArrayEquals(expectedEmpty, reversedEmpty);
    }

    @Test
    public void testCountVowels() {
        ClassroomMethods cm = new ClassroomMethods();
        assertEquals(3, cm.countVowels("Hello"));
    }
}






