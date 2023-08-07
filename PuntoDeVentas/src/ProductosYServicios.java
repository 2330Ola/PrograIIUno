import java.util.List;

public class ProductosYServicios {
    public List<Producto> crearProductos(List<Producto> productoList, String nombre, double precio, String codigoDeBarras, int cantidadEnStock, double descuento) {
        Producto nuevoProducto = new Producto(nombre, precio, codigoDeBarras, cantidadEnStock, descuento);
        productoList.add(nuevoProducto);
        return productoList;
    }
    public List<Servicio> crearServicios(List<Servicio> servicios, String nombre, String descripcion, double precio) {
        Servicio nuevoServicio = new Servicio(nombre, descripcion, precio);
        servicios.add(nuevoServicio);
        return servicios;
    }
}