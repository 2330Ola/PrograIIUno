import java.util.List;

public class PuntoDeVenta {
    public void CrearVenta(CarritoDeCompras carritoDeCompras) {
        System.out.println("Recibo de venta");
        carritoDeCompras.listarCarrito();
        System.out.println("Total: " + carritoDeCompras.calcularPrecio());
        System.out.println("Gracias por su compra");
    }
}