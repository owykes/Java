import java.util.Scanner ;

public class Fermat {

    public static void theoremTest(int a, int b, int c, int n) {
        //
        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy Smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work");
        }
    }
    public static void main(String[] args) {
        // user input for all integars 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integar to represent a: ");
        int a = in.nextInt();
        System.out.print("Enter an integar to represent b: ");
        int b = in.nextInt();
        System.out.print("Enter an integar to represent c: ");
        int c = in.nextInt();
        System.out.print("Enter an integar to represent n: ");
        int n = in.nextInt();

        theoremTest(a, b, c, n);
    }
}
