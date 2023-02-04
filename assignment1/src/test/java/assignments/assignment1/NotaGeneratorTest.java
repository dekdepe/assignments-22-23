package assignments.assignment1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotaGeneratorTest {
    @Test
    public void testGenerateNota1(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String dateNow = dtf.format(now);
        assertEquals("", NotaGenerator.generateNota("", "", "", dateNow, 0));
    }

    @Test
    public void testGenerateId1(){
        assertEquals("", NotaGenerator.generateId("", ""));
    }

}
