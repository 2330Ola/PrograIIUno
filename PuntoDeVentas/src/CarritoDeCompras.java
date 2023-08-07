import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras implements ElementoVenta {
    private List<Producto> productos = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();
    private double total;

    public CarritoDeCompras() {}
    public CarritoDeCompras(List<Producto> productos, List<Servicio> servicios, double total) {
        this.productos = productos;
        this.servicios = servicios;
        this.total = total;
    }

    @Override
    public double calcularPrecio() {
        total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        for (Servicio servicio : servicios) {
            total += servicio.calcularPrecio();
        }
        return total;
    }

    @Override
    public void agregarProductos(List<Producto> productoList, String codigoDeBarrasProductoAAgregar, int cantidadAAgregar) {
        for (Producto producto : productoList) {
            if (producto.getCodigoDeBarras().equals(codigoDeBarrasProductoAAgregar)) {
                for (int i = 0; i < cantidadAAgregar; i++) {
                    productos.add(producto);
                }
            }
        }
    }

    @Override
    public void agregarServicios(List<Servicio> servicioList, String nombreServicioAAgregar) {
        for (Servicio servicio : servicioList) {
            if (servicio.getNombre().equals(nombreServicioAAgregar)) {
                servicios.add(servicio);
            }
        }
    }

    public void eliminarProductos(Producto producto) {
        productos.remove(producto);
    }

    public void eliminarServicios(Servicio servicio) {
        servicios.remove(servicio);
    }

    public void listarCarrito() {
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " " + producto.getPrecio());
        }
        System.out.println("Servicios:");
        for (Servicio servicio : servicios) {
            System.out.println(servicio.getNombre() + " " + servicio.getPrecio());
        }
    }
}