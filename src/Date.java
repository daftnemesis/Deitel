//Program that shows a date in a format of mm/dd/yyyy

public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        if (month < 13 && month > 0) {
            this.month = month;
        }

        if (day < 31 && day > 0) {
            this.day = day;
        }

        this.year = year;

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate(){
        System.out.printf("%d/%d/%d", month, day, year);
    }
}
