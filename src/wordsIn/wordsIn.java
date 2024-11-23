package wordsIn;

public class wordsIn {

    //Sätter variabler
    private int lines = 0;
    private int words = 0;
    private int characters = 0;
    public String ord;

    public int lineCount() {
        //Ökar antalet rader med 1 med varje input
        lines += 1;

        return lines;
    }

    public int charCount(String input) {
        //Ökar antal bokstäver
        characters += input.length();
        return characters;
    }

    public int wordCount(String input) {
        //Ökar antal ord
        //Delar på en string där det finns mellanslag
        String[] wordsLength = input.split("\\s+");
        words += wordsLength.length;
        return words;

    }


    public void printCharCount() {
        //skriver ut antalet bokstäver
        System.out.println("Du har skrivit " + characters + " bokstäver.");
    }


    public void printLineCount() {
        //skriver ut antalet rader
        System.out.println("Du har skrivit: " + lines + " rader.");
    }

    public void printWordCount() {
        //skriver ut antalet ord
        System.out.println("Du har skrivit " + words + " ord.");
    }

    public String getOrd() {
        //retunerar ord för testfall.
        return ord;
    }

    public void setWords(String ord) {
        //Sätter ord för testfall.
        this.ord = ord;
    }
}


