public class Abecedarian {
    public static boolean isAbecedarian(String word){
        char prev = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            char current = word.charAt(i);

            if ( current < prev) {
                return false;
            }
            prev = current;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAbecedarian("able"));
    }

}

