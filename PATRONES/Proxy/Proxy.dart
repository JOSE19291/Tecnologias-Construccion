abstract class IReporte{
    void mostrar();
}

//IReporte

class ReporteVentas implements IReporte{
    @override
    void mostrar(){
        print(r'Ventas del dia: $2,500');
    }
}

//Proxy

class ProxyReporte implements IReporte{
    final ReporteVentas _reporte = ReporteVentas();
    final bool esAdministrador;
    
    ProxyReporte(this.esAdministrador);
    
    @override
    void mostrar(){
        if (esAdministrador){
            _reporte.mostrar();
        } else {
            print('acceso denegado por falta de permisos');
        }
    }
}

void main(){
    print('Acceso al administrador');
    IReporte accesoAdmin = new ProxyReporte(true);
    accesoAdmin.mostrar();
    
    print('\nAcceso al cajero');
    IReporte accesoCajero = new ProxyReporte(false);
    accesoCajero.mostrar();
}
















