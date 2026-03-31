public class BeTheCompiler {
    // A runs forever 
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}
    // B No - no class name/ declaration
    public static void main(String [] args) {
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("small x");
    }
  }
}
    // C Needs a main 
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
    }
  }

