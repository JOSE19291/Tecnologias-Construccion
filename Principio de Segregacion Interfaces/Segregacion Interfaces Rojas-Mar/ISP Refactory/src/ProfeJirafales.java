public class ProfeJirafales implements Educador{
    
    private String nombre = "Profesor Jirafales";

    @Override
    public void pasarLista(){
        System.out.println(nombre + " Pasa la lista de la clase");
    }

    @Override 
    public void impartirClase(){
        System.out.println(nombre + "da una clase de historia aburrida");
    }

    @Override 
    public void hacerCoraje(){
        System.out.println(" TA TA TA TA TA");
    }

}
