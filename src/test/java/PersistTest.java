import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersistTest {

    @Test
    public void persistenceNumber() {
        // Se introduce el numero que se quiere utilizar para hacer las pruebas
        int result = Persist.persistence(39);
        assertEquals(3, result);
    }
}