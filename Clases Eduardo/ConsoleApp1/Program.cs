Guerrero guerrero1 = new Guerrero("Justin");
Mago mago1 = new Mago("Cristoper");

System.Console.WriteLine("Duelo");
System.Console.WriteLine($"{mago1.nombre} vs {guerrero1.nombre}");

while (mago1.estadoVida && guerrero1.estadoVida)
{
    System.Console.WriteLine("1. Guerrero Ataca a mago");
    System.Console.WriteLine("2. Mago ataca a guerrero");
    System.Console.WriteLine("3. Mago usa habilidad");
    System.Console.WriteLine("Elija una opcion");

    string? opcion = Console.ReadLine();
    switch (opcion)
    {
        case "1":
        
    }
}