public class App {
    public static void main(String[] args) throws Exception {
        donRamon Ramon = new donRamon();
        DoñaFlorinda Florinda = new DoñaFlorinda();
        Ñoño ñoño = new Ñoño();

        System.out.println("===La vesinda del shavo===");

        Ramon.darGolpe();

        try{
            Ramon.cobrarRenta();
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            Ramon.pagarRenta();
        } catch 
    }
}
