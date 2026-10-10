package main

import "fmt"

type AdaptadorMercadoPago struct {
	TokenAcess string
}

func (mp *AdaptadorMercadoPago) Cobrar(monto float64) error {
	fmt.Printf("[Mercado Pago] Cobro relaizado por el monto de %.2f con el token %s", monto, mp.TokenAcess)
	return nil
}
