public class DonRamon implements Inquilino, Habitante, Educador{
    
    private String nombre = "Don ramon";

    @Override 
    public void pagarRenta(){
        System.out.println(nombre + " le jura al señor barriga que si pagara");
    }

    @Override 
    public void interactuarConElChavo(){
        System.out.println(nombre + " Le pega a el chavo");
    }

    @Override 
    public void impartirClase(){
        System.out.println(nombre + " esto significa PELIGRO!!!");
    }

    @Override 
    public void hacerCoraje(){
        System.out.println(nombre + " le grita al chavo REPROBADO");
    }

    @Override 
    public void pasarLista(){
        System.out.println(nombre + " le dice al chavo reprobado");
    }
}
