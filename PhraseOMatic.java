public class PhraseOMatic {
    public static void main (String[] args) {
        
        // Three sets of words to choose from
        String[] wordListOne = {"",""};

        String[] wordListTwo = {"",""};

        String[] wordListThree = {"",""};

        // find out how many word are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]; 

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}
