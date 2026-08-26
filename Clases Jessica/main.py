from abc import ABC, abstractmethod

class Personaje(ABC):

    def_init_(self, nombre, vida):
    self.nombre = nombre
    self.vida = vida

    def recibir_danio(self, cantidad):
        self.vida -=cantidad
        print(f"{self.nombre} recibe {cantidad} de danio")
        print(f"vida restante: {self.vida}")

    @abstractmethod
    def atacar(self):
        pass

    class ICurable(ABC):

        @abstractmethods
        def curar(self, objetivo):
            pass

    class Guerrero(Personaje):
        def atacar(self):
            print(f"{self.nombre} ataca con su espada")

    class Mago(Personaje):
        def atacar(self):
            print(f"{self.nombre} ataca con bola de fuego")

        def curar(self, obejtivo):
            obejtivo.vida +=20
            print(f"{self.nombre} cura a {obejtivo.nombre} + 20 puntos de vida")

    class Soporte(Personaje):
        def atacar(self):
            print(f"{self.nombre} ataca con baston")

        def curar(self, obejtivo):
            obejtivo.vida +=20
            print(f"{self.nombre} cura a {obejtivo.nombre} + 20 puntos de vida")

    guerrero = Guerrero("Guerrero1", 100)
    mago = Mago("Mago1", 60)
    soporte = Soporte("Soporte1", 70)

    guerrero.atacar()
    mago.atacar()
    soporte.atacar()

    guerrero.recibir_danio(30)
    mago.curar(guerrero)
    soporte.curar(guerrero)

    print(f"vida final de {guerrero.nombre} : {guerrero.vida}")