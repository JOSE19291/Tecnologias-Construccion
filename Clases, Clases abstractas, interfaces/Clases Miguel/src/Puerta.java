public class Puerta implements ActivablePorRedstone {
    @Override
    public void activar() {
        System.out.println("Puerta se abre y se activa");
    }

    @Override
    public void desactivar() {
        System.out.println("Puerta se le manda la señal y se cierra");
    }
}
