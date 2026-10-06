public class SistemaBancario {
    public static void main(String[] args) throws Exception {
        System.out.println("---SITEMA BANCARIO LSP MALO");
        CuentaBancaria ahorro = new CuentaAhorro("CA-001", 10000);
        CuentaBancaria corriente = new CuentaCorriente("CO-002", 5000, 0);
        CuentaBancaria credito = new CuentaCredito("CR-002", 15000);

        Cliente cliente1 = new Cliente("001", ahorro, "Alexa");
        Cliente cliente2 = new Cliente("002", corriente, "Pamela");
        Cliente cliente3 = new Cliente("003", credito, "Vanesa");

        cliente1.depositar(5000);
        cliente2.retirar(2000);

        System.out.println("Cuentas ahorro");
        cliente1.mostrarInformacion();
        cliente1.depositar(5000);
        cliente1.retirar(1000);

        System.out.println("Intereses $" + cliente1.calcularIntereses());
        cliente2.mostrarInformacion();
        cliente2.retirar(6000);
        System.out.println("Saldo despues del retiro $" + cliente2.consultarSaldo());
        System.out.println("Interes por sobregiro: $" + cliente2.calcularIntereses());
        cliente3.mostrarInformacion();
        cliente3.retirar(5000);
        System.out.println("Deuda; $" + ((CuentaCredito) credito).consultarDeuda());
        System.out.println("Intereses: $" + cliente3.calcularIntereses());

        // LSP

        CuentaBancaria cuenta = new CuentaAhorro("AH-002", 5000);
        try {
            cuenta.pagarDeuda(1000);
        } catch (UnsupportedOperationException e) {
            System.out.println("LSP violado" + e.getMessage());
        }
    }
}
