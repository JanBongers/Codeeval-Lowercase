package nl.bongers;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void main() throws Exception {
        Main.main(new String[]{"resource/line-file.txt"});
        assertEquals("this is an uppercase line", outContent.toString().trim());
    }
}