package org.example;

public class GroceryCounter {
    private int[] digits;
    private int overflowCount;

    public GroceryCounter() {
        digits = new int[4];
        overflowCount = 0;
    }

    public void hundredths() {
        if (digits[3] == 9) {
            digits[3] = 0;
            tenths();
        } 
        else {
            digits[3]++;
        }
    }

    public void tenths() {
        if (digits[2] == 9) {
            digits[2] = 0;
            ones();
        } 
        else {
            digits[2]++;
        }
    }

    public void ones() {
        if (digits[1] == 9) {
            digits[1] = 0;
            tens();
        } 
        else {
            digits[1]++;
        }
    }

    public void tens() {
        if (digits[0] == 9) {
            digits[0] = 0;
            overflowCount++;
            hundredths();   
        } 
        else {
            digits[0]++;
        }
    }

    public void clear() {
        for (int i = 0; i < 4; i++) {
            digits[i] = 0;
        }
        overflowCount = 0;
    }

    public String total() {
        int dollars = digits[0] * 10 + digits[1];
        int cents = digits[2] * 10 + digits[3];

        String centsFormatted;
        if (cents < 10) {
            centsFormatted = "0" + cents;
        } 
        else {
            centsFormatted = "" + cents;
        }

        return "$" + dollars + "." + centsFormatted;
    }

    public int overflows() {
        return overflowCount;
    }
}