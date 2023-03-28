import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.function.Supplier;

public class TestCoche {
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero(){

        Coche nuevoCoche = new Coche();


        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
