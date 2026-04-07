
public class Date { 
    public static void main(String[] args) {
        
        String day = "Tuesday";
        String date = "7th";
        String month = "April";
        int year = 2026;

        String americanFormat = day + ", " + month + " " + date + ", " + year;
        String europeanFormat = day + " " + date + " " + month + " " + year;

        System.out.println(americanFormat);
        System.out.println(europeanFormat);


    }
    
}
