import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Ñoño noño = new Ñoño();
        DonRamon donRamon = new DonRamon();
        ProfeJirafales jirafales = new ProfeJirafales();

        // Interfaz para el profe Jirafales
        List<Educador> educadores = List.of(jirafales);
        for (Educador e : educadores){
            e.impartirClase();
            e.pasarLista();
            e.hacerCoraje();
        }

        // Interfaz para Don Mamon
        List<Inquilino> inquilinos = List.of(donRamon);
        for (Inquilino i : inquilinos){
            i.pagarRenta();
        }

        //Interfaz para Habitante
        List<Habitante> Habitantes = List.of(donRamon, jirafales);
        for (Habitante h : Habitantes){
            h.interactuarConElChavo();
        }

        //Interfaz para niño
        List<Niño> niños = List.of(ñoño);
        for (Niño n : niños){
            n.llorar();
            n.cantar();
        }

    }
}
