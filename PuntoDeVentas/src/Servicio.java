import java.util.List;

public class Servicio implements ElementoVenta {
    private String nombre;
    private String descripcion;
    private double precio;

    public Servicio(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void agregarProductos(List<Producto> productoList, String codigoDeBarrasProductoAAgregar, int cantidadAAgregar) {

    }

    @Override
    public void agregarServicios(List<Servicio> servicioList, String nombreServicioAAgregar) {

    }

    public String getPrecio() {
        return String.valueOf(precio);
    }
}