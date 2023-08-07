import java.util.List;

public interface ElementoVenta {
    public double calcularPrecio();
    public void agregarProductos(List<Producto> productoList, String codigoDeBarrasProductoAAgregar, int cantidadAAgregar);
    public void agregarServicios(List<Servicio> servicioList, String nombreServicioAAgregar);
}