public class TargetHeartRate {

    private String name;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public TargetHeartRate(String name, String lastName, int month, int day, int year) {
        this.name = name;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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


    private int ageInYears;

    public void convertAgeInYears(int yearOfBirth){
        ageInYears = 2015 - yearOfBirth;
    }


    public int maxHeartRate(){
        return  220 - ageInYears;
    }

    public void targetHeartRate(){
        System.out.printf("The target heart rate is %.2f - %.2f", maxHeartRate() * 0.55, maxHeartRate() * 0.85);
    }
}
