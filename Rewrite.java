public class Rewrite {
    public static void main(String[] args) {
        int x = 4;
        // refactored code into one single if statement using && 
        if (x > 0 && x < 10) {
            System.out.println("positive single digit number.");
        }
    }
}
