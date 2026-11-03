public class Dragon extends Enemigo {

    public Dragon() {
        super(60, 200, "Dragon");
    }

    public void atacar() {
        System.out.println("El dragon escupe su fuegooo y te quita: " + this.ataque + " de vida");
    }

}
