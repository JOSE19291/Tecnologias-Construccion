public class SistemaDeSeguridad
{
    private Camara camara;
    private SensorTemperatura sensor;
    private Alarma alarma;

    public SistemaDeSeguridad()
    {
        camara = new Camara();
        sensor = new SensorTemperatura();
        alarma = new Alarma();
    }

    public void activarSistema()
    {
        Console.WriteLine("======Activando sistema======");
        camara.encender();
        sensor.iniciar();
        alarma.habilitar();
        Console.WriteLine("======Sistema activado======");
    }
}