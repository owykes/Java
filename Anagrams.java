public class Anagrams {
    public static boolean areAnagrams(String s, String t) {
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        String lower1 = s.toLowerCase();
        String lower2 = t.toLowerCase();

        for (char letter : lower1.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {
                int index = letter - 'a';
                counts1[index]++;
            }
        }
        
        for (char letter : lower2.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {
                int index = letter - 'a';
                counts2[index]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (counts1[i] != counts2[i]) {
                return false;
            }
        }
    return true;        
    }
           
    
    
}

/*Two words are anagrams if they contain the same letters and
the same number of each letter. For example, “stop” is an anagram of “pots”,
“allen downey” is an anagram of “well annoyed”, and “christopher mayfield”
is an anagram of “hi prof the camel is dry”. Write a method that takes two
strings and checks whether they are anagrams of each other */