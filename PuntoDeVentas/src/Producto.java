import java.util.List;

public class Producto implements ElementoVenta {
    private String nombre;
    private double precio;
    private String codigoDeBarras;
    private int cantidadEnStock;
    private double descuento;

    public Producto(String nombre, double precio, String codigoDeBarras, int cantidadEnStock, double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigoDeBarras = codigoDeBarras;
        this.cantidadEnStock = cantidadEnStock;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public double calcularPrecio() {
        return precio - (precio * descuento);
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
