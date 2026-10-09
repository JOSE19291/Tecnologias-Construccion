public class VerificadorEdad {
    public boolean requiereINE(String tipoBebida) {
        if (tipoBebida.equals("Cerveza"))
            return true;
        else
            return false;
    }
}
