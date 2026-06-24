public class Recurse {
    /**
     * Returns the first character of the given string
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
    *Returns all but the first letter of the given String.
    */
    public static String rest(String s){
        return s.substring(1);
    }

    /**
    *Returns all but the first and last letter of the String.
    */
    public static String middle(String s) {
        return s.substring(1, s.length()-1);
    }

    /**
    *Returns the length of the given String.
    */
    public static int length(String s){
        return s.length();
    }
    /**
     * 
     */
    public static void printString(String s) {
        for (char letter : s.toCharArray()) {
            System.out.println(letter);
        } 

    }

    public static void reverseString(String s) {
        
    
    }
    public static void main(String[] args) {
        String test = "It's very hot today, I think I might melt";
        System.out.println(first(test));
        System.out.println(rest(test));
        System.out.println(middle(test));
        System.out.print(length(test));
    
    }
}

