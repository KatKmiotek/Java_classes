import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer();
    }
    @Test
    public void canPrint(){
        printer.print(10, 2);
        assertEquals(30, printer.getSheetsOfPaperLeft());
        assertEquals(60, printer.getToner());
    }
    @Test
    public void cantPrint(){
        assertEquals(false, printer.print(10, 10));
    }
}
