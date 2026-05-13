import java.util.Scanner;

public class Doubloon {
    public static boolean isDoubloon(String word) {
        String lowerCaseWord = word.toLowerCase();
        
        for (int i = 0; i < lowerCaseWord.length(); i++) {
            int counter = 0;
            
            for (int j = 0; j < lowerCaseWord.length(); j++) {
                if (lowerCaseWord.charAt(i) == lowerCaseWord.charAt(j)) {
                    counter++;
                }     
            }               
            if (counter != 2) {
                return false;                    
            }
        }  
        return true;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        System.out.println(isDoubloon(word));
    }
}
