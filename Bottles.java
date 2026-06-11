public class Bottles {
    public static void bottlesOfBeer(int bottles){
        if (bottles == 0) {
            endVerse(); 
            return;   
        }        
        mainVerse(bottles);
    }   
    
    public static String bottleText(int bottles) {
        if (bottles == 0) {
            return "no bottles";
        }
        if (bottles == 1) {
            return "one bottle";
        }      
        return bottles + " bottles";
    }

    public static void mainVerse(int bottles) {
        System.out.printf("%s of beer on the wall \n", bottleText(bottles));
        System.out.printf("%s of beer \n", bottleText(bottles));
        System.out.println("ya' take one down, ya' pass it around");
        System.out.printf("%s of beer on the wall\n\n" , bottleText(bottles -1));
        bottlesOfBeer(bottles -1);
    }

    public static void endVerse() {
        System.out.println("No bottles of beer on the wall");
        System.out.println("no bottles of beer,");                    
        System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");                 
        System.out.println("’cause there are no more bottles of beer on the wall!");
    }

    public static void main(String[] args) {
        bottlesOfBeer(99);
    }


}