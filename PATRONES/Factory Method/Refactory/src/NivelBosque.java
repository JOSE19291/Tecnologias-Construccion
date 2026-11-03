public class NivelBosque extends Nivel {

    public NivelBosque() {
        super("Bosque obscuro");
    }

    @Override
    public Enemigo crearEnemigo() {
        return new Lobo();
    }
}
