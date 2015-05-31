import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by Gregory on 5/23/15.
 */
public class Lab1Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    //test that the constructor creates a full array from a text file
    //otherwise, gracefully fails
    @Test
    public void constructor_fails_gracefully_on_null_file(){
        //arrange/act
        Lab1 l = new Lab1("inputData.txt");

        //assert
            assertNull(l.fileReader); //file is null

        //since it's null, make sure it outputs a message
            assertEquals("File not found.", outContent.toString());
    }

}
