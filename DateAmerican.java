public class DateAmerican {
    public static void printAmerican(String day,String date,String month,int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day,String date,String month,int year){
        System.out.println(day + ", " + date + " " + month + ", " + year);
    }
        
    public static void main(String[] args) {
        String day = "Thursday";
        String date = "23rd";
        String month = "April";
        int year = 2026;
        
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
}
