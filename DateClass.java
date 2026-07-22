public class DateClass {
    private int year;
    private int month;
    private int day; 

    public DateClass() {
        this.day = 1;
        this.month = 1;
        this.year = 1900;
    }

    public DateClass(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        DateClass birthday = new DateClass(1992, 6, 22);

    }
}
