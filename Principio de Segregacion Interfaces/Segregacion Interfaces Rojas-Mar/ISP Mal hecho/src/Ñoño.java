public class Ñoño implements AccionesPersonajes{
    
    private final String nombre = "Ñoñio"; 

    @Override
    public void darGolpe(){
        System.out.println(nombre + " Es un niño, no pega");
    }

    @Override 
    public void pagarRenta(){
        throw new UnsupportedOperationException(nombre + " No paga renta, su papa es el dueño");
    }

    @Override 
    public void cobrarRenta(){
        throw new UnsupportedOperationException(nombre + " : No es dueño de la vecindad");
    }

    @Override 
    public void jugar(){
        System.out.println(nombre + " Juega con su pelota en la playa");
    }

    @Override 
    public void llorar(){
        System.out.println(nombre + " Ñoño Llora");
    }

}
