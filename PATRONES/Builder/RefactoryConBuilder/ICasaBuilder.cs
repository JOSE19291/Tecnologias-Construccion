public interface ICasaBuilder
{
    public ICasaBuilder ConPisos(int Pisos);
    public ICasaBuilder ConColor(string color);
    public ICasaBuilder ConMaterial();
    public ICasaBuilder ConTecho();
    public ICasaBuilder ConGaraje();
    public ICasaBuilder ConJardin();
    public ICasaBuilder ConAlberca();
    public Casa Build();
}