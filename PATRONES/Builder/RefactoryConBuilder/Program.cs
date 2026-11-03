using System;
public class Program

{
    public static void Main()
    {
        Casa personalizada = new CasaBuilder()
        .ConAlberca()
        .ConColor("Azul Cielo")
        .ConTecho()
        .ConMaterial()
        .Build();

        Casa personalizada1 = new CasaBuilderModerna()
        .ConPisos(2)
        .ConColor("Amarillo lava")
        .ConTecho()
        .ConMaterial()
        .Build();

        Director director = new Director(new CasaBuilder());
        Director director1 = new Director(new CasaBuilderModerna());

        Casa basica = director.ConstruirCasaBasica();
        Casa menosBasica = director1.ConstruirCasaDeLujo();
        Casa deLujo = director.ConstruirCasaDeLujo();

        personalizada.Mostrar();
        personalizada1.Mostrar();
        basica.Mostrar();
        deLujo.Mostrar();
        menosBasica.Mostrar();
    }
}
