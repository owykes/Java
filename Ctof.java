import java.util.Scanner ;

public class Ctof {
    public static void main(String[] args) {
        /*converts Celcius to Fahrenheit */
        Scanner in = new Scanner(System.in);
        double c, f;
    
        System.out.print("Enter a temperature in Celsius: ");
        c = in.nextDouble();
        f = c * 9 / 5 + 32;
        System.out.printf("%.1f C = %.1f F\n", c, f);
    }
}

