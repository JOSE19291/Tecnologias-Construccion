public abstract class Enemigo {

    public int ataque;
    public int vida;
    public String nombre;

    public Enemigo(int ataque, int vida, String nombre) {
        this.ataque = ataque;
        this.vida = vida;
        this.nombre = nombre;
    }

    public abstract void atacar();

    public void recibirDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

}