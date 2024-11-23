package wordsIn;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class wordsInTest {

    @Test
    public void lineCountTest() {
        //Testar antal lines

        //Skapar ett nytt objekt som hämtar från wordsIn
        wordsIn testar = new wordsIn();

        //Sätter faktiska värdet
        int actual = testar.lineCount();

        //Värdet vi förväntar oss att få
        int expected = 1;
        assertEquals(expected, actual);
    }



    @Test
    public void hejWordTest(){
        //Testar om användaren skrivit hej

        //Skapar ett nytt objekt som hämtar från wordsIn
        wordsIn testarHej = new wordsIn();

        //Sätter värdet till "hej"
        testarHej.setWords("hej");

        //Värdet som vi får
        String actual = testarHej.getOrd();

        //Värdet vi förväntar oss att få
        String expected = "hej";
        assertEquals(expected, actual);


    }
    @Test
    public void charCountTest() {
        //Skapar ett nytt objekt som hämtar från wordsIn
        wordsIn charTest = new wordsIn();
        int actual = charTest.lineCount();

        //Värdet vi förväntar oss att få
        int expected = 1;
        assertEquals(expected, actual);
    }


}
