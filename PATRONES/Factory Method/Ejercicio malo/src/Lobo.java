public class Lobo extends Enemigo {
    public Lobo() {
        super(50, 100, "Lobo");

    }

    public void atacar() {
        System.out.println("El lobo te muerde y te quita: " + this.ataque + " de vida");
    }

}
