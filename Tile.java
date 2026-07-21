public class Tile {
    //instance variables
    private char letter;
    private int value;
    
    //constructors
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    
    //getters
    public char getLetter() {
        return this.letter;
    }

    public int getValue() {
        return this.value;
    }

    //setters
    public void setLetter() {
        this.letter = letter;
    }

    public void setValue() {
        this.value = value;
    }

    public static void printTile(Tile tile) {
        System.out.printf("The letter %c is worth %d points%n", tile.letter, tile.value);
    }


    public String toString() {
        return String.format("The letter %c is worth %d points%n", this.letter, this.value);
    }
    
    public boolean equals(Tile that) {
        return this.value == that.value
            && this.letter == that.letter;

    }

    
    public static void main(String[] args) {
        Tile tile = new Tile('Z', 10);   
        printTile(tile); 
    }
}


