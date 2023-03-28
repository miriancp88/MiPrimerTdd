public class Coche {
    public int velocidad;

    public void acelerarMIRIAN(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerarMIRIAN(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad<0) velocidad = 0;
    }
}
