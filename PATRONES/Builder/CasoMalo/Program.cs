using System;

public class Casa
{
    public int Pisos { get; set; }
    public string Color { get; set; }
    public bool TieneTecho { get; set; }
    public bool TieneGarage { get; set; }
    public bool TieneAlberca { get; set; }
    public bool TieneJardin { get; set; }

    public Casa(int pisos) 
    : this(pisos, "Blanco") {}
    public Casa(int pisos, string color) 
    : this(pisos,color,true) {}
    public Casa(int pisos, string color, bool techo) 
    : this(pisos, color,techo, false) { }
    public Casa(int pisos, string color, bool techo, bool garage)
    : this(pisos, color, techo, garage, false) { }

    public Casa(int pisos, string color, bool techo, bool garage, bool alberca)
    : this(pisos, color, techo, garage,alberca, false) { }


    public Casa(int pisos, string color, bool techo, bool garage, bool alberca, bool jardin)
    {
        Pisos = pisos;
        Color = color;
        TieneTecho = techo;
        TieneGarage = garage;
        TieneAlberca = alberca;
        TieneJardin = jardin;
    }
    public decimal CalcularCosto()
    {
        decimal costo = 500000 * Pisos;
        if (TieneTecho) costo += 100000m;
        if (TieneGaraje) costo += 40000m;
        if (TieneAlberca) costo += 100000m;
        if (TieneJardin) costo += 100000m;
    }

    public void Mostrar()
    {
        System.Console.WriteLine($"Casa con {Pisos} pisos | Color{Color}");
        System.Console.WriteLine($"Techo {TieneTecho} | Garaje{TieneGarage}");
        System.Console.WriteLine($"Casa con {Pisos} pisos | Color{Color}");
    }

    public class CasaConAlberca : Casa
    {
        public CasaConAlberca(int pisos, string color)
            : base(pisos, color, true, );
    }

    public class CasaConGaraje : Casa
    {
        public CasaConGaraje(int pisos, string color)
        : base(pisos, color, true);
    }
    
    public class CasaConGarajeYAlberca : Casa
    {
        
    }

} 