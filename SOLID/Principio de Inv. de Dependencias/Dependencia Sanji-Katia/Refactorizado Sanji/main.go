package main

import "fmt"

func main() {
	fmt.Println("===== Entorno Real =====")

	pasarelaReal := &AdaptadorMercadoPago{TokenAcess: "123!#$"}
	emisorReal := &AdaptadorTwilio{IdentificadorCuenta: "54321&%$#"}

	servicioReal := NuevoServicioPago(pasarelaReal, emisorReal)
	_ = servicioReal.ProcesarPago("changotremendo@gmail.com", 1500)

	fmt.Println("===== Entorno Prueba =====")

	pasarelaMock := &SimuladorPasarela{DebeFallar: false}
	emisorMock := &SimuladorEmisor{}

	servicioMock := NuevoServicioPago(pasarelaMock, emisorMock)
	_ = servicioMock.ProcesarPago("tilintravieso@gmail.com", 3000)
}
