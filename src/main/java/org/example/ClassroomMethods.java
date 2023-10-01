package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClassroomMethods {

    public double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public String convertToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public int calculateGCD(int num1, int num2, int num3) {
        return calculateGCD(calculateGCD(num1, num2), num3);
    }

    private int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public double calculateHypotenuse(double side1, double side2) {
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }
        return reversed;
    }

    public int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public void main(String[]args) {

        Path tempDir;
            try {
                // Create a temporary directory
                tempDir = Files.createTempDirectory("temp_directory");

                System.out.println("Created temporary directory: " + tempDir.toAbsolutePath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
