public class Histogram {
    public static int [] letterHist(String s) {
        int[] counts = new int[26];
        String lower = s.toLowerCase(); 
        for (char letter : lower.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {    
                int index = letter - 'a';
                counts[index]++;
            }
        }
    return counts;
    } 
}

/*Write a method called letterHist that takes a string as a
parameter and returns a histogram of the letters in the string. The zeroth
element of the histogram should contain the number of a’s in the string (upper
and lowercase); the 25th element should contain the number of z’s. Your
solution should traverse the string only once.*/