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
        if (s.length() == 0) {
            return;
        }
        System.out.println(first(s));
        printString(rest(s));

    }

    public static void printBackward(String s) { 
         if (s.length() == 0) {
            return;
        }
        printBackward(rest(s));
        System.out.println(first(s));
    }    

    public static String reverseString(String s) {
        if (length(s) == 0) {
            return "";
        }
        return reverseString(rest(s)) + first(s);
    }

    public static boolean isPalindrome(String s) {
        if (length(s) <= 1) {
            return true;
        }
        /* had to use java method charisat, due to ambigous excercise constriants or flaw */
        if (first(s) != s.charAt(length(s)-1)) {
            return false;
        }
        
        return isPalindrome(middle(s));
    }
    
    
    public static void main(String[] args) {
        String test = "It's very hot today, I think I might melt";
        printString(test);
        printBackward(test);
        System.out.println(first(test));
        System.out.println(rest(test));
        System.out.println(middle(test));
        System.out.print(length(test));
        
    }
}

