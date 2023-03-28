import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCoche {
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero_MIRIAN() {
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_MIRIAN() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerarMIRIAN(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void test_al_descelerar_un_coche_su_velocidad_disminuye_MIRIAN() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerarMIRIAN(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void test_al_acelerar_un_coche_su_velocidad_no_puede_ser_mernor_que_cero_MIRIAN() {
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerarMIRIAN(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

}