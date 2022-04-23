// Created by Dayu Wang (dwang@stchas.edu) on 2021-04-17

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-04-22


package hybrid.lecture_4;

public class Date {
    // An enum representing the formats of a date
    public enum DateFormat {US, Euro, Asian}

    // Data fields
    private int year;  // Year of the date
    private int month;  // Month of the date
    private int dayOfMonth;  // Day-of-month of the date
    public static DateFormat format;  // Format of the date
    
    // Constructors
    
    public Date() { format = DateFormat.US; }  // Default constructor
    
    public Date(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        format = DateFormat.US;
    }
    
    // Getters

    /** Returns the year of the date.
        @return: year of the date
    */
    public int getYear() { return year; }

    /** Returns the month of the date.
        @return: month of the date
    */
    public int getMonth() { return month; }

    /** Returns the day-of-month of the date.
        @return: day-of-month of the date
    */
    public int getDayOfMonth() { return dayOfMonth; }
    
    // Setters

    /** Updates the year of the date.
        @param year: updated value of the year of the date
    */
    public void setYear(int year) { this.year = year; }

    /** Updates the month of the date.
        @param month: updated value of the month of the date
    */
    public void setMonth(int month) { this.month = month; }

    /** Updates the day-of-month of the date.
        @param dayOfMonth: updated value of the day-of-month of the date
    */
    public void setDayOfMonth(int dayOfMonth) { this.dayOfMonth = dayOfMonth; }
    
    // Method

    /** Customizes the output format of the date.
        @return: a string representing the output format of the date
    */
    @Override
    public String toString() {
        switch (format) {
            case US:
                return String.format("%02d/%02d/%04d", month, dayOfMonth, year);
            case Euro:
                return String.format("%02d/%02d/%04d", dayOfMonth, month, year);
            case Asian:
                return String.format("%04d-%02d-%02d", year, month, dayOfMonth);
        }
        return "";  // Avoid warnings.
    }
}