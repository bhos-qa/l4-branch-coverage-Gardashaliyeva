package org.example;

import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

class ClassroomMethodsTest {
    @Test
    public void testConvertToBinary() {
        ClassroomMethods cm = new ClassroomMethods();
        assertEquals("1101", cm.convertToBinary(13));
        assertEquals("1001", cm.convertToBinary(9));
        assertEquals("11111", cm.convertToBinary(31));
        assertEquals("0", cm.convertToBinary(0));
    }

    @Test
    public void testCalculateHypotenuse() {
        ClassroomMethods cm = new ClassroomMethods();
        assertEquals(5.0, cm.calculateHypotenuse(3.0, 4.0), 0.0001);
        assertEquals(13.0, cm.calculateHypotenuse(5.0, 12.0), 0.0001);
        assertEquals(17.088, cm.calculateHypotenuse(8.0, 15.0), 0.001);
    }

    @Test
    public void testIsLeapYear() {
        ClassroomMethods cm = new ClassroomMethods();
        assertTrue(cm.isLeapYear(2020));
        assertFalse(cm.isLeapYear(2021));
        assertTrue(cm.isLeapYear(2000));
        assertFalse(cm.isLeapYear(1900));
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
        assertEquals(0, cm.countVowels("Rhythm"));
        assertEquals(5, cm.countVowels("AEIOUaeiou"));
        assertEquals(0, cm.countVowels(""));
    }
}






