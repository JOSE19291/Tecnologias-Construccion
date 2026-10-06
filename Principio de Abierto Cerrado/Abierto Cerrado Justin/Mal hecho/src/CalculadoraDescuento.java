public class CalculadoraDescuento {
    public double aplicarDescuento(String tipoDescuento, double subtotal) {
        if (tipoDescuento.equals("Descuento Navidad")) {
            return subtotal * 0.90;
        } else if (tipoDescuento.equals("Sin descuento")) {
            return subtotal;
        } else {
            throw new IllegalArgumentException("Descuento no valido");
        }
    }
}
