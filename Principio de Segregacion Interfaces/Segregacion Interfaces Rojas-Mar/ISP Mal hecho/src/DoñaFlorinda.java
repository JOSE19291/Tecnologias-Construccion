public class DoñaFlorinda implements  AccionesPersonajes{

    private final String nombre = "Doña Florinda";

    @Override
    public void darGolpe(){
        System.out.println(nombre + " Da una cachetada a Don ramon");
    }

    @Override 
    public void pagarRenta(){
        System.out.println(nombre + " Paga la renta de 5K");
    }

    @Override 
    public void cobrarRenta(){
        throw new UnsupportedOperationException(nombre + " : No es dueño de la vecindad");
    }

    @Override 
    public void jugar(){
        throw new UnsupportedOperationException(nombre + " No juega a nada");
    }

    @Override 
    public void llorar(){
        throw new UnsupportedOperationException(nombre + " Las mujeres no lloran, facturan");
    }
}
