package main

import "fmt"

type ClienteStripe struct {
	ClaveApi string
}

func (s *ClienteStripe) CobrarTarjeta(monto float64) bool {
	fmt.Printf("[API STRIPE] Enviando $%.2f con la clave %s", monto, s.ClaveApi)
	return true
}

type NotificadorSengrid struct {
	CorreoRemitente string
}

func (n *NotificadorSengrid) EnviarReciboCorreo(monto float64, correo string) {
	fmt.Printf("[API SENGRID] Enviando desde %s a %s la cantidad de %.2f", n.CorreoRemitente, correo, monto)
}

type ServicioPago struct {
	clienteStripe *ClienteStripe
	Notificador   *NotificadorSengrid
}

func NuevoServicioPago() *ServicioPago {
	return &ServicioPago{
		clienteStripe: &ClienteStripe{ClaveApi: "1"},
		Notificador:   &NotificadorSengrid{CorreoRemitente: "magdielito.com@gmail.com"},
	}
}

func (s *ServicioPago) ProcesarPago(monto float64, correo string) {
	if s.clienteStripe.CobrarTarjeta(monto) {
		s.Notificador.EnviarReciboCorreo(monto, correo)
	}
}

func main() {
	servicio := NuevoServicioPago()
	servicio.ProcesarPago(1500.01, "caballerosDelZodiaco@gmail.com")
}
