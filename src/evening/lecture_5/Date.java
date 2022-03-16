// Created by Dayu Wang (dwang@stchas.edu) on 2022-03-16

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-03-16


package evening.lecture_5;

public class Date {
    // Date format
    public enum DateFormat { US, European, Asian };

    // Data fields
    private int year;  // Year part (e.g., 2022) of the date
    private int month;  // Month part (e.g., 3) of the date
    private int date;  // Date part (e.g., 16) of the date
    public static DateFormat format;  // Output format of the date

    // Constructors

    public Date() { format = DateFormat.US; }  // Default constructor

    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
        format = DateFormat.US;
    }

    // Getters

    public int getYear() { return year; }

    public int getMonth() { return month; }

    public int getDate() { return date; }

    // Setters

    public void setYear(int year) { this.year = year; }

    public void setMonth(int month) { this.month = month; }

    public void setDate(int date) { this.date = date; }

    // Method

    /** Writes the date in the standard console. */
    public void printDate() {
        if (format == DateFormat.US) { System.out.printf("%d/%d/%d\n", month, date, year); }
        if (format == DateFormat.European) { System.out.printf("%d/%d/%d\n", date, month, year); }
        if (format == DateFormat.Asian) { System.out.printf("%d-%d-%d\n", year, month, date); }
    }
}