package oop_ex_1_7;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String toString() {
        return String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + year;
    }

}
