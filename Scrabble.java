import java.util.Scanner;

public class Scrabble {
    public static boolean canSpell(String tiles, String word) {

        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);

            // find the letter in tiles
            int index = tiles.indexOf(letter);

            // if not found, fail
            if (index == -1) {
                return false;
            }

            // remove that letter from tiles
            String before = tiles.substring(0, index);
            String after = tiles.substring(index + 1);
            tiles = before + after;
        }
        return true;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your tiles: ");
        String tiles = in.nextLine();
        System.out.print("Enter your scrabble word: ");
        String word = in.nextLine();
        
        canSpell(tiles, word);


    }
}