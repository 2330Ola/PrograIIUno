import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Producto> productoList = new ArrayList<>();
    private static List<Servicio> servicioList = new ArrayList<>();
    private static CarritoDeCompras carritoDeCompras = new CarritoDeCompras();
    public static void main(String[] args) {
        productoList.add(new Producto("Azucar", 1.5, "P1", 10, 0.0));
        Scanner opcion = new Scanner(System.in);
        while (true) {
            MostrarMenu();
            int opcionSeleccionada = opcion.nextInt();
            switch (opcionSeleccionada) {
                case 1 -> {
                    CrearProducto();
                }
                case 2 -> {
                    CrearServicio();
                }
                case 3 -> {
                    AgregarProductoAlCarritoDeCompras();
                }
                case 4 -> {
                    AgregarServicioAlCarritoDeCompras();
                }
                case 5 -> {
                    EliminarProductosDelCarritoDeCompras();
                }
                case 6 -> {
                    EliminarServiciosDelCarritoDeCompras();
                }
                case 7 -> {
                    carritoDeCompras.listarCarrito();
                    Mostrar("El total de se Carrito es de: " + carritoDeCompras.calcularPrecio());
                }
                case 8 -> {
                    ListarProductosYServiciosDisponibles();
                }
                case 9 -> {
                    new PuntoDeVenta().CrearVenta(carritoDeCompras);
                }
                case 10 -> System.exit(0);
                default -> Mostrar("Opcion invalida");
            }
        }
    }

    private static void MostrarMenu() {
        Mostrar("1. Crear un producto");
        Mostrar("2. Crear un servicio");
        Mostrar("3. Agregar un producto al carrito de compras");
        Mostrar("4. Agregar un servicio al carrito de compras");
        Mostrar("5. Eliminar un producto del carrito de compras");
        Mostrar("6. Eliminar un servicio del carrito de compras");
        Mostrar("7. Calcular el total del carrito de compras");
        Mostrar("8. Listar Productos y Servicios disponibles");
        Mostrar("9. Crear Venta");
        Mostrar("10. Salir");
        Mostrar("Ingrese una opcion: ");
    }
    public static void CrearProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        Mostrar("Ingresar precio del producto: ");
        double precioProducto = scanner.nextDouble();
        Mostrar("Ingresar codigo de barras del producto: ");
        String codigoDeBarrasProducto = scanner.next();
        Mostrar("Ingresar cantidad en stock del producto: ");
        int cantidadEnStockProducto = scanner.nextInt();
        Mostrar("Ingresar descuento del producto: ");
        double descuentoProducto = scanner.nextDouble();
        productoList = new ProductosYServicios().crearProductos(productoList, nombreProducto, precioProducto, codigoDeBarrasProducto, cantidadEnStockProducto, descuentoProducto);
    }
    public static void CrearServicio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar nombre del servicio: ");
        String nombreServicio = scanner.nextLine();
        Mostrar("Ingresar descripcion del servicio: ");
        String descripcionServicio = scanner.nextLine();
        Mostrar("Ingresar precio del servicio: ");
        double precioServicio = scanner.nextDouble();
        servicioList = new ProductosYServicios().crearServicios(servicioList, nombreServicio, descripcionServicio, precioServicio);
    }
    public static void AgregarProductoAlCarritoDeCompras() {
        Scanner scanner = new Scanner(System.in);
        Mostrar("Ingresar codigo de barras del producto: ");
        String codigoDeBarrasProductoAAgregar = scanner.next();
        Mostrar("Ingresar cantidad de productos a agregar: ");
        int cantidadAAgregar = scanner.nextInt();
        carritoDeCompras.agregarProductos(productoList, codigoDeBarrasProductoAAgregar, cantidadAAgregar);
    }
    public static void AgregarServicioAlCarritoDeCompras() {
        Scanner scanner = new Scanner(System.in);
        Mostrar("Ingresar nombre del servicio: ");
        String nombreServicioAAgregar = scanner.nextLine();
        carritoDeCompras.agregarServicios(servicioList, nombreServicioAAgregar);
    }
    public static void EliminarProductosDelCarritoDeCompras() {
        Scanner scanner = new Scanner(System.in);
        Mostrar("Ingresar codigo de barras del producto a eliminar: ");
        String codigoDeBarrasProductoAEliminar = scanner.next();
        for (Producto producto : productoList) {
            if (producto.getCodigoDeBarras().equals(codigoDeBarrasProductoAEliminar)) {
                carritoDeCompras.eliminarProductos(producto);
            }
        }
    }
    public static void EliminarServiciosDelCarritoDeCompras() {
        Scanner scanner = new Scanner(System.in);
        Mostrar("Ingresar nombre del servicio a eliminar: ");
        String nombreServicioAEliminar = scanner.nextLine();
        for (Servicio servicio : servicioList) {
            if (servicio.getNombre().equals(nombreServicioAEliminar)) {
                carritoDeCompras.eliminarServicios(servicio);
            }
        }
    }
    public static void ListarProductosYServiciosDisponibles() {
        // Listar los productos y servicios disponibles
        Mostrar("Productos:");
        for (Producto producto : productoList) {
            Mostrar(producto.getNombre() + " " + producto.getPrecio());
        }
        Mostrar("Servicios:");
        for (Servicio servicio : servicioList) {
            Mostrar(servicio.getNombre() + " " + servicio.getPrecio());
        }
    }
    public static void Mostrar(String mensaje) {
        System.out.println(mensaje);
    }
}




