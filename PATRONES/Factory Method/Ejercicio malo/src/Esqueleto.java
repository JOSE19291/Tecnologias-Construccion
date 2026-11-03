public class Esqueleto extends Enemigo {

    public Esqueleto() {
        super(75, 150, "Esqueleto");
    }

    public void atacar() {
        System.out.println("El esqueleto te pega con su espada y te quita " + this.ataque + " de ataque");
    }

}
