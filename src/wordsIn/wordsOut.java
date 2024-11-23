package wordsIn;

import java.util.Scanner;

public class wordsOut {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        wordsIn wordsIn = new wordsIn();

        System.out.println("Varsegod och skriv in ord! Avsluta med 'stop'.");

        //Kollar om användarens input är lika med stop.
        while (true) {
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            wordsIn.lineCount();
            wordsIn.wordCount(input);
            wordsIn.charCount(input);




        }
        //Skriver ut de olika variablerna
        wordsIn.printLineCount();
        wordsIn.printWordCount();
        wordsIn.printCharCount();


    }
}
