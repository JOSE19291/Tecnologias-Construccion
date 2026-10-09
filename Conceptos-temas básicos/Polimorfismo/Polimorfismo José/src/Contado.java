public class Contado implements MetodoPago {

    private boolean Estadobilletes;

    public Contado(boolean Estadobilletes) {
        this.Estadobilletes = Estadobilletes;
    }

    @Override
    public boolean validar() {

        if (Estadobilletes == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void pagar(double monto) {
        System.out.println("El billete está en buen estado y se pago de forma correcta");
    }
}
