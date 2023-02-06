package assignments.assignment1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotaGeneratorTest {
    @Test
    public void testGenerateNota1() {
        String solution = "ID    : BOCI-08203712389-79\n" +
                "Paket : reguler\n" +
                "Harga :\n" +
                "20 kg x 10000 = 200000\n" +
                "tanggal terima  : 01/02/2023\n" +
                "tanggal selesai : 04/02/2023";
        assertEquals(solution, NotaGenerator.generateNota("BOCI-08203712389-79",
                "reguler", 20, "01/02/2023"));
    }

    @Test
    public void testGenerateId1() {
        assertEquals("DEK-082212345678-75", NotaGenerator.generateId("Dek Depe", "082212345678"));
    }

}
